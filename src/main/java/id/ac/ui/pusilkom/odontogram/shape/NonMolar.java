package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.NonMolarPart;
import id.ac.ui.pusilkom.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class NonMolar extends Layer {
    NonMolarPart nonMolarPart;
    Stroke stroke;
    Color color;
    GradientPaint paint;
    
    public void with(NonMolarPart nonMolarPart, Stroke stroke, Color color) {
        this.nonMolarPart = nonMolarPart;
        this.stroke = stroke;
        this.color = color;
    }
    
    public void with(NonMolarPart nonMolarPart, GradientPaint paint) {
        this.nonMolarPart = nonMolarPart;
        this.paint = paint;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        if (nonMolarPart == null) {
            g2.setStroke(StrokeStyle.BASIC);
            g2.setColor(Color.BLACK);
            g2.draw(ShapeHelper.Taring(this, NonMolarPart.TOP));
            g2.draw(ShapeHelper.Taring(this, NonMolarPart.BOTTOM));
            g2.draw(ShapeHelper.Taring(this, NonMolarPart.LEFT));
            g2.draw(ShapeHelper.Taring(this, NonMolarPart.RIGHT));
        } else {
            boolean isDraw = (stroke != null && color != null);
            boolean isFill = (paint != null);
            if (isDraw) {
                g2.setStroke(stroke);
                g2.setColor(color);
                g2.draw(ShapeHelper.Taring(this, nonMolarPart));
            } else if (isFill) {
                g2.setPaint(paint);
                g2.fill(ShapeHelper.Taring(this, nonMolarPart));
            }
        }

        g2.dispose();
    }
}
