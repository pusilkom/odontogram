package id.ac.ui.pusilkom.odontogram.abstracts;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by fahri on 4/24/17.
 */
public abstract class Layer {
    private int x;
    private int y;

    private int width;
    private int height;

    private BufferedImage bufferedImage;
    private Graphics2D g2;

    public Layer() {
    }

    public Layer(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    protected void init() {
        bufferedImage = new BufferedImage(this.getXWidth(), this.getYHeight(), BufferedImage.TYPE_INT_ARGB);
        g2 = bufferedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
    }

    public int getXWidth() {
        return x + width;
    }

    public int getYHeight() {
        return y + height;
    }

    public Graphics2D getGraphics2D() {
        return g2;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    abstract public void draw();

    @Override
    public String toString() {
        return "Layer{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", class=" + this.getClass() +
                '}';
    }
}
