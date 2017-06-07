package com.pusilkom.rsgmui.odontogram.model;

import com.pusilkom.rsgmui.odontogram.abstracts.Layer;
import com.pusilkom.rsgmui.odontogram.constant.Size;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by fahri on 4/23/17.
 */
public class Gigi {

    private int no;
    private int x;
    private int y;
    private int width = Size.BOX_WIDTH;

    private List<Box> listBoxTop = Lists.newArrayList();
    private Box boxCenter;
    private List<Box> listBoxBottom = Lists.newArrayList();

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
        List<Layer> allLayer = Lists.newArrayList();

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




    public Gigi(int no, int x, int y) {
        this.no = no;
        this.x = x;
        this.y = y;
    }

    public Gigi(int no, int x, int y, int width) {
        this.no = no;
        this.x = x;
        this.y = y;
        this.width = width;
    }

//    public Layer OuterSquare(int y, int height) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BASIC);
//        g2.setColor(Color.black);
//
//        g2.draw(new Rectangle2D.Double(l.getX(), l.getY(), l.getWidth(), l.getHeight()));
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer OuterSquareBold(int y, int height) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BOLD_BASIC);
//        g2.setColor(Color.black);
//
//        g2.draw(new Rectangle2D.Double(l.getX(), l.getY(), l.getWidth(), l.getHeight()));
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer X(int y, int height) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        System.out.println("X : " + l);
//
//        g2.setStroke(StrokeStyle.BOLD_BASIC);
//        g2.setColor(Color.black);
//
//        g2.draw(new Line2D.Double(l.getX(), l.getY(), l.getXWidth(), l.getYHeight()));
//        g2.draw(new Line2D.Double(l.getXWidth(), l.getY(), l.getX(), l.getYHeight()));
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer XWithoutCenter(int y, int height) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BASIC);
//        g2.setColor(Color.black);
//
//        double w_1per4 = l.getWidth()/4;
//        double h_1per4 = l.getHeight()/4;
//
//        g2.draw(new Line2D.Double(l.getX(), l.getY(), l.getX() + w_1per4, l.getY() + h_1per4));
//        g2.draw(new Line2D.Double(l.getXWidth(), l.getYHeight(), l.getXWidth() - w_1per4, l.getYHeight() - h_1per4));
//        g2.draw(new Line2D.Double(l.getXWidth(), l.getY(), l.getXWidth() - w_1per4, l.getY() + h_1per4));
//        g2.draw(new Line2D.Double(l.getX(), l.getYHeight(), l.getX() + w_1per4, l.getYHeight() - h_1per4));
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer HLinePart(int y, int height, HLinePart hLine) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BOLDER_BASIC);
//        g2.setColor(Color.black);
//
//        double w_per2 = l.getWidth()/2;
//        double h_per2 = l.getHeight()/2;
//
//        if (hLine == HLinePart.FULL) {
//            g2.draw(new Line2D.Double(l.getX(), l.getY() + h_per2, l.getXWidth(), y + h_per2));
//        } else if (hLine == HLinePart.HALF_LEFT) {
//            g2.draw(new Line2D.Double(l.getX() + w_per2, l.getY() + h_per2, l.getX(), l.getY() + h_per2));
//        } else if (hLine == HLinePart.HALF_RIGHT) {
//            g2.draw(new Line2D.Double(l.getX() + w_per2, l.getY() + h_per2, l.getXWidth(), l.getY() + h_per2));
//        }
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer VLinePart(int y, int height, VLinePart vLine) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BOLDER_BASIC);
//        g2.setColor(Color.black);
//
//        double w_per2 = l.getWidth()/2;
//        double h_per2 = l.getHeight()/2;
//
//        if (vLine == VLinePart.FULL) {
//            g2.draw(new Line2D.Double(l.getX() + w_per2, l.getY(), l.getX() + w_per2, l.getYHeight()));
//        } else if (vLine == VLinePart.HALF_TOP) {
//            g2.draw(new Line2D.Double(l.getX() + w_per2, l.getY(), l.getX() + w_per2, l.getYHeight() - h_per2));
//        } else if (vLine == VLinePart.HALF_BOTTOM) {
//            g2.draw(new Line2D.Double(l.getX() + w_per2, l.getYHeight(), l.getX() + w_per2, l.getYHeight() - h_per2));
//        }
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer ArrowDownHalfRight(int y, int height) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setStroke(StrokeStyle.BASIC);
//        g2.setColor(Color.black);
//
//        double w_per4 = l.getWidth()/4;
//        double h_per4 = l.getHeight()/4;
//
//        double w_per5 = l.getWidth()/5;
//        double h_per5 = l.getHeight()/5;
//
//        GeneralPath polyline = new GeneralPath(Path2D.WIND_EVEN_ODD,3);
//
//        polyline.moveTo (l.getXWidth(), l.getY() + h_per5);
//        polyline.lineTo(l.getXWidth(), l.getYHeight() - h_per5);
//        polyline.lineTo(l.getXWidth() - w_per5, l.getY() + h_per5);
//
//        g2.setPaint(new GradientPaint(0,0,Color.BLACK,100, 0,Color.BLACK));
//        g2.fill(polyline);
//
//        g2.dispose();
//        return l;
//    }
//
//    public Layer BackgroundPaint(int y, int height, Paint paint) {
//        Layer l = new Layer(x, y, width, height);
//        Graphics2D g2 = l.getGraphics2D();
//
//        g2.setPaint(paint);
//        g2.fill(new Rectangle2D.Double(l.getX(), l.getY(), l.getWidth(), l.getHeight()));
//
//        g2.dispose();
//        return l;
//    }

}
