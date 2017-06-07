package id.ac.ui.pusilkom.odontogram;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.PaintStyle;
import id.ac.ui.pusilkom.odontogram.constant.Size;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.*;
import id.ac.ui.pusilkom.odontogram.model.Box;
import id.ac.ui.pusilkom.odontogram.model.Tooth;
import id.ac.ui.pusilkom.odontogram.shape.*;
import id.ac.ui.pusilkom.odontogram.shape.Label;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fahri on 4/26/17.
 */
public class Odontogram {

    private static int START_X = 0;
    private static int START_Y = 0;

    private static int WILLBECALCULATEDLATER_X = -1; // setelah semua state gigi sudah di-set, pada tahap akan dirender,
    private static int WILLBECALCULATEDLATER_Y = -1; // semua gigi akan di-set ulang posisi x & y-nya dgn method recalculatePositionOfAllTooth

    Map<Integer, Tooth> container;

    List<Tooth> listToothRow1;
    List<Tooth> listToothRow2;
    List<Tooth> listToothRow3;
    List<Tooth> listToothRow4;

    public Odontogram() {
        listToothRow1 = this.initRow1();
        listToothRow2 = this.initRow2();
        listToothRow3 = this.initRow3();
        listToothRow4 = this.initRow4();

        container = new HashMap<Integer, Tooth>();

        for (Tooth tooth : listToothRow1) {
            container.put(tooth.getNo(), tooth);
        }
        for (Tooth tooth : listToothRow2) {
            container.put(tooth.getNo(), tooth);
        }
        for (Tooth tooth : listToothRow3) {
            container.put(tooth.getNo(), tooth);
        }
        for (Tooth tooth : listToothRow4) {
            container.put(tooth.getNo(), tooth);
        }
    }

    //      DRAW to canvas/image. Or to outputstream if you want to download it in web controller
    public BufferedImage generateBufferedImage() {
        List<Layer> listAllLayer = this.recalculateThenGetAllLayer(listToothRow1, listToothRow2, listToothRow3, listToothRow4);

        BufferedImage canvas = new BufferedImage(START_X + this.totalWidthOfListTooth(listToothRow1), START_Y + this.totalHeightOfCanvas(listToothRow1, listToothRow2, listToothRow3, listToothRow4), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = canvas.createGraphics();

        g.setStroke(StrokeStyle.BASIC);
        g.setColor(Color.RED);

        for (Layer layer : listAllLayer) {
            g.drawImage(layer.getBufferedImage(), 0, 0, null);
        }
        
        return canvas;
    }

    private List<Tooth> initRow1() {
        List<Tooth> listToothRow = new ArrayList<Tooth>();

        for (int no = 18; no >= 11; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            Box boxTop = tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 11) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 21; no <= 28; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            Box boxTop = tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 21) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listToothRow;
    }

    private List<Tooth> initRow2()  {
        List<Tooth> listToothRow = new ArrayList<Tooth>();

        for (int no = 58; no >= 56; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 55; no >= 51; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Empty.class);
            if (no == 51) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 61; no <= 65; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Empty.class);
            if (no == 61) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 66; no <= 68; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listToothRow;
    }

    private List<Tooth> initRow3()  {
        List<Tooth> listToothRow = new ArrayList<Tooth>();

        for (int no = 88; no >= 86; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 85; no >= 81; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            Box boxTop = tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Empty.class);
            if (no == 81) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
        }

        for (int no = 71; no <= 75; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            Box boxTop = tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Empty.class);
            if (no == 71) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
        }

        for (int no = 76; no <= 78; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listToothRow;
    }

    private List<Tooth> initRow4()  {
        List<Tooth> listToothRow = new ArrayList<Tooth>();

        for (int no = 48; no >= 41; no--) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 41) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 31; no <= 38; no++) {
            Tooth tooth = new Tooth(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listToothRow.add(tooth);
            tooth.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
            tooth.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = tooth.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 31) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        return listToothRow;
    }

//    RECALCULATE position or size of everything (gigi,box,layer)
    private List<Layer> recalculateThenGetAllLayer(List<Tooth>... listOfListTooth)  {

        List<Layer> listAllLayer = new ArrayList<Layer>();

        this.recalculatePositionOfAllTooth(listOfListTooth);

        for (List<Tooth> listTooth : listOfListTooth) {

            this.appendWithEmptyIfGapped(listTooth);

            for (Tooth tooth : listTooth) {
                tooth.recalculatePositionAndSizeOfListBox();
                tooth.drawAllDrawableLayer();

                listAllLayer.addAll(tooth.getAllDrawableLayer());
            }
        }

        return listAllLayer;
    }

    // === TAMBAHAN : recalculate x & y semua gigi
    private void recalculatePositionOfAllTooth(List<Tooth>... listOfListTooth) {

        List<Tooth> prevListTooth = null;
        int xAmongListTooth = 0;
        int yAmongListTooth = 0;

        for (List<Tooth> listTooth : listOfListTooth) {

            if (prevListTooth == null) {
                xAmongListTooth = START_X;
                yAmongListTooth = START_Y;
            } else {
                yAmongListTooth += this.determineMaxTotalHeightOfListTooth(prevListTooth);
            }

            Tooth prevTooth = null;
            int xAmongTooth = 0;
            int yAmongTooth = 0;

            for (Tooth tooth : listTooth) {
                if (prevTooth == null) {
                    xAmongTooth = xAmongListTooth;
                    yAmongTooth = yAmongListTooth;
                } else {
                    xAmongTooth += prevTooth.getWidth();
                }

                tooth.setX(xAmongTooth);
                tooth.setY(yAmongTooth);

                prevTooth = tooth;
            }

            prevListTooth = listTooth;
        }
    }

    private void appendWithEmptyIfGapped(List<Tooth> listTooth) {
        // Find maxTotalHeight Top & Bottom
        int maxTotalHeightOfListBoxTop = 0;
        int maxTotalHeightOfListBoxBottom = 0;
        for (Tooth tooth : listTooth) {
            int totalHeightOfListBoxTop = tooth.totalHeightOfListBoxTop();
            if (totalHeightOfListBoxTop > maxTotalHeightOfListBoxTop)
                maxTotalHeightOfListBoxTop = totalHeightOfListBoxTop;

            int totalHeightOfListBoxBottom = tooth.totalHeightOfListBoxBottom();
            if (totalHeightOfListBoxBottom > maxTotalHeightOfListBoxBottom)
                maxTotalHeightOfListBoxBottom = totalHeightOfListBoxBottom;
        }

        for (Tooth tooth : listTooth) {
            int totalHeightOfListBoxTop = tooth.totalHeightOfListBoxTop();
            if (totalHeightOfListBoxTop < maxTotalHeightOfListBoxTop) {
                Box emptyBox = tooth.buildBoxForTop(maxTotalHeightOfListBoxTop - totalHeightOfListBoxTop);
                emptyBox.buildThenAddLayer(Empty.class);
                tooth.prependBoxForTop(emptyBox);
            }

            int totalHeightOfListBoxBottom = tooth.totalHeightOfListBoxBottom();
            if (totalHeightOfListBoxBottom < maxTotalHeightOfListBoxBottom) {
                Box emptyBox = tooth.buildBoxForBottom(maxTotalHeightOfListBoxBottom - totalHeightOfListBoxBottom);
                emptyBox.buildThenAddLayer(Empty.class);
                tooth.appendBoxForBottom(emptyBox);
            }
        }

    }

    private int totalWidthOfListTooth(List<Tooth> listTooth) {
        int totalWidth = 0;
        for (Tooth tooth : listTooth) {
            totalWidth += tooth.getWidth();
        }
        return totalWidth;
    }

    private int determineMaxTotalHeightOfListTooth(List<Tooth> listTooth) {
        int maxTotalHeight = 0;
        for (Tooth tooth : listTooth) {
            int totalHeight = tooth.totalHeight();
            if (totalHeight > maxTotalHeight) maxTotalHeight = totalHeight;
        }
        return maxTotalHeight;
    }

    private int totalHeightOfCanvas(List<Tooth>... listOfListTooth) {
        int totalHeight = 0;
        for (List<Tooth> listTooth : listOfListTooth) {
            totalHeight += this.determineMaxTotalHeightOfListTooth(listTooth);
        }
        return totalHeight;
    }

    public Tooth getTooth(int noTooth) {
        return container.get(noTooth);
    }

}
