package id.ac.ui.pusilkom.odontogram.model;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.Size;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fahri on 4/23/17.
 */
public class Tooth {

    private int no;
    private int x;
    private int y;
    private int width = Size.BOX_WIDTH;

    private List<Box> listBoxTop = new ArrayList<Box>();
    private Box boxCenter;
    private List<Box> listBoxBottom = new ArrayList<Box>();

    public Box getBoxCenter() {
        return this.boxCenter;
    }

    public int getListBoxTopSize() {
        return this.listBoxTop.size();
    }

    public int getListBoxBottomSize() {
        return this.listBoxBottom.size();
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNo() {
        return no;
    }

    public int totalHeight() {
        int totalHeight = this.totalHeightOfListBoxTop();
        totalHeight += boxCenter.getHeight();
        totalHeight += this.totalHeightOfListBoxBottom();
        return totalHeight;
    }

    public int totalHeightOfListBoxTop()  {
        int totalHeight = 0;
        for (Box box : listBoxTop) {
            totalHeight += box.getHeight();
        }
        return totalHeight;
    }

    public int totalHeightOfListBoxBottom()  {
        int totalHeight = 0;
        for (Box box : listBoxBottom) {
            totalHeight += box.getHeight();
        }
        return totalHeight;
    }

    // TOP

    public Box buildThenAddBoxForTop(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        this.listBoxTop.add(box);

        return box;
    }

    public Box buildBoxForTop(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        return box;
    }

    public void appendBoxForTop(Box... list) {
        for (Box box : list) {
            if (box == null) continue;

            listBoxTop.add(box);
        }
    }

    public void prependBoxForTop(Box... list) {
        for (Box box : list) {
            if (box == null) continue;

            listBoxTop.add(0, box);
        }
    }

    public void prependBoxForBottom(Box... list) {
        for (Box box : list) {
            if (box == null) continue;

            listBoxBottom.add(0, box);
        }
    }

    // CENTER

    public Box buildThenSetBoxForCenter(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        this.boxCenter = box;

        return box;
    }

    public Box buildBoxForCenter(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        return box;
    }

    public void replaceBoxForCenter(Box box) {
        this.boxCenter = box;
    }

    // BOTTOM
    public Box buildThenAddBoxForBottom(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }
        y += boxCenter.getHeight();
        for (Box box : listBoxBottom) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        this.listBoxBottom.add(box);

        return box;
    }

    public Box buildBoxForBottom(int height) {
        int y = this.y;

        for (Box box : listBoxTop) {
            y += box.getHeight();
        }
        y += boxCenter.getHeight();
        for (Box box : listBoxBottom) {
            y += box.getHeight();
        }

        Box box = new Box(x, y, width, height);
        return box;
    }

    public void appendBoxForBottom(Box... list) {
        for (Box box : list) {
            if (box == null) continue;

            listBoxBottom.add(box);
        }
    }

    // RECALCULATE

    public void recalculatePositionAndSizeOfListBox() {
        int y  = this.y;
        for (Box box : listBoxTop) {
            box.setX(x);
            box.setY(y);
            box.setWidth(width);

            y += box.getHeight();

            box.recalculatePositionAndSizeOfListLayer();
        }

        boxCenter.setX(x);
        boxCenter.setY(y);
        boxCenter.setWidth(width);
        y += boxCenter.getHeight();
        boxCenter.recalculatePositionAndSizeOfListLayer();

        for (Box box : listBoxBottom) {
            box.setX(x);
            box.setY(y);
            box.setWidth(width);

            y += box.getHeight();

            box.recalculatePositionAndSizeOfListLayer();
        }
    }

    // ===========

    // GET ALL DRAWABLE LAYER

    public List<Layer> getAllDrawableLayer() {
        List<Layer> allLayer = new ArrayList<Layer>();

        for (Box box : listBoxTop) {
            allLayer.addAll(box.getListLayer());
        }
        allLayer.addAll(boxCenter.getListLayer());
        for (Box box : listBoxBottom) {
            allLayer.addAll(box.getListLayer());
        }

        return allLayer;
    }

    // ====================

    // DRAW ALL DRAWABLE LAYER

    public void drawAllDrawableLayer() {

        for (Box box : listBoxTop) {
            for (Layer layer : box.getListLayer()) {
                layer.draw();
            }
        }
        for (Layer layer : boxCenter.getListLayer()) {
            layer.draw();
        }
        for (Box box : listBoxBottom) {
            for (Layer layer : box.getListLayer()) {
                layer.draw();
            }
        }
    }

    // ====================




    public Tooth(int no, int x, int y) {
        this.no = no;
        this.x = x;
        this.y = y;
    }

    public Tooth(int no, int x, int y, int width) {
        this.no = no;
        this.x = x;
        this.y = y;
        this.width = width;
    }
}
