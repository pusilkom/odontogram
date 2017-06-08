package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.enums.TriangleDirection;
import id.ac.ui.pusilkom.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class Triangle extends Layer {
    TriangleDirection triangleDirection;
    Stroke stroke;
    Color color;
    GradientPaint paint;

    public void with(TriangleDirection triangleDirection, Stroke stroke, Color color) {
        this.triangleDirection = triangleDirection;
        this.stroke = stroke;
        this.color = color;
    }

    public void with(TriangleDirection triangleDirection, GradientPaint paint) {
        this.triangleDirection = triangleDirection;
        this.paint = paint;
    }

    public void draw() {
        init();

        Graphics2D g2 = this.getGraphics2D();

        boolean isDraw = (stroke != null && color != null);
        boolean isFill = (paint != null);
        if (isDraw) {
            g2.setStroke(stroke);
            g2.setColor(color);
            g2.draw(ShapeHelper.Triangle(this, triangleDirection));
        } else if (isFill) {
            g2.setPaint(paint);
            g2.fill(ShapeHelper.Triangle(this, triangleDirection));
        }
    }
}
