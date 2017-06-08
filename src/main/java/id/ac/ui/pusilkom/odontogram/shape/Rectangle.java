package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by fahri on 4/24/17.
 */
public class Rectangle extends Layer {
    Stroke stroke;
    Color color;
    GradientPaint paint;
    Boolean isHalf = false;

    public void with(Stroke stroke, Color color) {
        this.stroke = stroke;
        this.color = color;
    }

    public void with(GradientPaint paint) {
        this.paint = paint;
    }
    public void with(Stroke stroke, Color color, boolean half) {
        this.stroke = stroke;
        this.color = color;
        this.isHalf = half;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        boolean isDraw = (stroke != null && color != null);
        boolean isFill = (paint != null);
        boolean isRecHalf = this.isHalf;
        if (isRecHalf) {
            g2.setStroke(stroke);
            g2.setColor(color);
            g2.draw(new Rectangle2D.Double(this.getX() + this.getWidth() * 1/8, this.getY() + this.getWidth() * 1/8, this.getWidth() * 3/4, this.getHeight() * 3/4));
            g2.draw(new Rectangle2D.Double(this.getX() + this.getWidth() * 1/8, this.getY() + this.getWidth() * 1/8, this.getWidth() * 3/4, this.getHeight() * 3/4));
        } else if (isDraw) {
            g2.setStroke(stroke);
            g2.setColor(color);
            g2.draw(new Rectangle2D.Double(this.getX(), this.getY(), this.getWidth(), this.getHeight()));
        } else if (isFill) {
            g2.setPaint(paint);
            g2.fill(new Rectangle2D.Double(this.getX(), this.getY(), this.getWidth(), this.getHeight()));
        }

        g2.dispose();
    }
}
