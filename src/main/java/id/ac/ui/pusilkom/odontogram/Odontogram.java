package id.ac.ui.pusilkom.odontogram;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.PaintStyle;
import id.ac.ui.pusilkom.odontogram.constant.Size;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.*;
import id.ac.ui.pusilkom.odontogram.model.Box;
import id.ac.ui.pusilkom.odontogram.model.Gigi;
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
    private static int WILLBECALCULATEDLATER_Y = -1; // semua gigi akan di-set ulang posisi x & y-nya dgn method recalculatePositionOfAllGigi

    Map<Integer, Gigi> container;

    List<Gigi> listGigiRow1;
    List<Gigi> listGigiRow2;
    List<Gigi> listGigiRow3;
    List<Gigi> listGigiRow4;

    public Odontogram() {
        listGigiRow1 = this.initRow1();
        listGigiRow2 = this.initRow2();
        listGigiRow3 = this.initRow3();
        listGigiRow4 = this.initRow4();

        container = new HashMap<Integer, Gigi>();

        for (Gigi gigi : listGigiRow1) {
            container.put(gigi.getNo(), gigi);
        }
        for (Gigi gigi : listGigiRow2) {
            container.put(gigi.getNo(), gigi);
        }
        for (Gigi gigi : listGigiRow3) {
            container.put(gigi.getNo(), gigi);
        }
        for (Gigi gigi : listGigiRow4) {
            container.put(gigi.getNo(), gigi);
        }
    }

    //      DRAW to canvas/image. Or to outputstream if you want to download it in web controller
    public BufferedImage generateBufferedImage() {
        List<Layer> listAllLayer = this.recalculateThenGetAllLayer(listGigiRow1, listGigiRow2, listGigiRow3, listGigiRow4);

        BufferedImage canvas = new BufferedImage(START_X + this.totalWidthOfListGigi(listGigiRow1), START_Y + this.totalHeightOfCanvas(listGigiRow1, listGigiRow2, listGigiRow3, listGigiRow4), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = canvas.createGraphics();

        g.setStroke(StrokeStyle.BASIC);
        g.setColor(Color.RED);

        for (Layer layer : listAllLayer) {
            g.drawImage(layer.getBufferedImage(), 0, 0, null);
        }
        
        return canvas;
    }

    private List<Gigi> initRow1() {
        List<Gigi> listGigiRow = new ArrayList<Gigi>();

        for (int no = 18; no >= 11; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            Box boxTop = gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 11) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 21; no <= 28; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            Box boxTop = gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 21) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listGigiRow;
    }

    private List<Gigi> initRow2()  {
        List<Gigi> listGigiRow = new ArrayList<Gigi>();

        for (int no = 58; no >= 56; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 55; no >= 51; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Empty.class);
            if (no == 51) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 61; no <= 65; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Empty.class);
            if (no == 61) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 66; no <= 68; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listGigiRow;
    }

    private List<Gigi> initRow3()  {
        List<Gigi> listGigiRow = new ArrayList<Gigi>();

        for (int no = 88; no >= 86; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        for (int no = 85; no >= 81; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            Box boxTop = gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Empty.class);
            if (no == 81) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
        }

        for (int no = 71; no <= 75; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            Box boxTop = gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT);
            boxTop.buildThenAddLayer(Empty.class);
            if (no == 71) {
                boxTop.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.DOWN, PaintStyle.SOLID_BLACK);
            }

            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Label.class).with(String.valueOf(no));
        }

        for (int no = 76; no <= 78; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
        }

        return listGigiRow;
    }

    private List<Gigi> initRow4()  {
        List<Gigi> listGigiRow = new ArrayList<Gigi>();

        for (int no = 48; no >= 41; no--) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 41) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_RIGHT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        for (int no = 31; no <= 38; no++) {
            Gigi gigi = new Gigi(no, WILLBECALCULATEDLATER_X, WILLBECALCULATEDLATER_Y);
            listGigiRow.add(gigi);
            gigi.buildThenAddBoxForTop(Size.HALF_BOX_HEIGHT).buildThenAddLayer(Empty.class);
            gigi.buildThenSetBoxForCenter(Size.BOX_HEIGHT).buildThenAddLayer(Empty.class);
            Box boxBottom = gigi.buildThenAddBoxForBottom(Size.HALF_BOX_HEIGHT);
            boxBottom.buildThenAddLayer(Label.class).with(String.valueOf(no));
            if (no == 31) {
                boxBottom.buildThenAddLayer(TriangleSmall.class).with(TriangleSmallPart.HALF_LEFT, TriangleSmallDirection.UP, PaintStyle.SOLID_BLACK);
            }
        }

        return listGigiRow;
    }

//    RECALCULATE position or size of everything (gigi,box,layer)
    private List<Layer> recalculateThenGetAllLayer(List<Gigi>... listOfListGigi)  {

        List<Layer> listAllLayer = new ArrayList<Layer>();

        this.recalculatePositionOfAllGigi(listOfListGigi);

        for (List<Gigi> listGigi : listOfListGigi) {

            this.appendWithEmptyIfGapped(listGigi);

            for (Gigi gigi : listGigi) {
                gigi.recalculatePositionAndSizeOfListBox();
                gigi.drawAllDrawableLayer();

                listAllLayer.addAll(gigi.getAllDrawableLayer());
            }
        }

        return listAllLayer;
    }

    // === TAMBAHAN : recalculate x & y semua gigi
    private void recalculatePositionOfAllGigi(List<Gigi>... listOfListGigi) {

        List<Gigi> prevListGigi = null;
        int xAmongListGigi = 0;
        int yAmongListGigi = 0;

        for (List<Gigi> listGigi : listOfListGigi) {

            if (prevListGigi == null) {
                xAmongListGigi = START_X;
                yAmongListGigi = START_Y;
            } else {
                yAmongListGigi += this.determineMaxTotalHeightOfListGigi(prevListGigi);
            }

            Gigi prevGigi = null;
            int xAmongGigi = 0;
            int yAmongGigi = 0;

            for (Gigi gigi : listGigi) {
                if (prevGigi == null) {
                    xAmongGigi = xAmongListGigi;
                    yAmongGigi = yAmongListGigi;
                } else {
                    xAmongGigi += prevGigi.getWidth();
                }

                gigi.setX(xAmongGigi);
                gigi.setY(yAmongGigi);

                prevGigi = gigi;
            }

            prevListGigi = listGigi;
        }
    }

    private void appendWithEmptyIfGapped(List<Gigi> listGigi) {
        // Find maxTotalHeight Top & Bottom
        int maxTotalHeightOfListBoxTop = 0;
        int maxTotalHeightOfListBoxBottom = 0;
        for (Gigi gigi : listGigi) {
            int totalHeightOfListBoxTop = gigi.totalHeightOfListBoxTop();
            if (totalHeightOfListBoxTop > maxTotalHeightOfListBoxTop)
                maxTotalHeightOfListBoxTop = totalHeightOfListBoxTop;

            int totalHeightOfListBoxBottom = gigi.totalHeightOfListBoxBottom();
            if (totalHeightOfListBoxBottom > maxTotalHeightOfListBoxBottom)
                maxTotalHeightOfListBoxBottom = totalHeightOfListBoxBottom;
        }

        for (Gigi gigi : listGigi) {
            int totalHeightOfListBoxTop = gigi.totalHeightOfListBoxTop();
            if (totalHeightOfListBoxTop < maxTotalHeightOfListBoxTop) {
                Box emptyBox = gigi.buildBoxForTop(maxTotalHeightOfListBoxTop - totalHeightOfListBoxTop);
                emptyBox.buildThenAddLayer(Empty.class);
                gigi.prependBoxForTop(emptyBox);
            }

            int totalHeightOfListBoxBottom = gigi.totalHeightOfListBoxBottom();
            if (totalHeightOfListBoxBottom < maxTotalHeightOfListBoxBottom) {
                Box emptyBox = gigi.buildBoxForBottom(maxTotalHeightOfListBoxBottom - totalHeightOfListBoxBottom);
                emptyBox.buildThenAddLayer(Empty.class);
                gigi.appendBoxForBottom(emptyBox);
            }
        }

    }

    private int totalWidthOfListGigi(List<Gigi> listGigi) {
        int totalWidth = 0;
        for (Gigi gigi : listGigi) {
            totalWidth += gigi.getWidth();
        }
        return totalWidth;
    }

    private int determineMaxTotalHeightOfListGigi(List<Gigi> listGigi) {
        int maxTotalHeight = 0;
        for (Gigi gigi : listGigi) {
            int totalHeight = gigi.totalHeight();
            if (totalHeight > maxTotalHeight) maxTotalHeight = totalHeight;
        }
        return maxTotalHeight;
    }

    private int totalHeightOfCanvas(List<Gigi>... listOfListGigi) {
        int totalHeight = 0;
        for (List<Gigi> listGigi : listOfListGigi) {
            totalHeight += this.determineMaxTotalHeightOfListGigi(listGigi);
        }
        return totalHeight;
    }

    public Gigi getGigi(int nomorGigi) {
        return container.get(nomorGigi);
    }

}
