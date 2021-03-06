package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.enums.TriangleSmallDirection;
import id.ac.ui.pusilkom.odontogram.enums.TriangleSmallPart;
import id.ac.ui.pusilkom.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class TriangleSmall extends Layer {
    TriangleSmallPart triangleSmallPart;
    TriangleSmallDirection triangleSmallDirection;
    Stroke stroke;
    Color color;
    GradientPaint paint;

    public void with(TriangleSmallPart taringPart, TriangleSmallDirection triangleSmallDirection, Stroke stroke, Color color) {
        this.triangleSmallPart = taringPart;
        this.triangleSmallDirection = triangleSmallDirection;
        this.stroke = stroke;
        this.color = color;
    }

    public void with(TriangleSmallPart taringPart, TriangleSmallDirection triangleSmallDirection, GradientPaint paint) {
        this.triangleSmallPart = taringPart;
        this.triangleSmallDirection = triangleSmallDirection;
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
            g2.draw(ShapeHelper.TriangleSmall(this, triangleSmallPart, triangleSmallDirection));
        } else if (isFill) {
            g2.setPaint(paint);
            g2.fill(ShapeHelper.TriangleSmall(this, triangleSmallPart, triangleSmallDirection));
        }
    }
}
