package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.MolarPart;
import id.ac.ui.pusilkom.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/25/17.
 */
public class Molar extends Layer {
    MolarPart molarPart;
    Stroke stroke;
    Color color;
    GradientPaint paint;

    public void with(MolarPart molarPart, Stroke stroke, Color color) {
        this.molarPart = molarPart;
        this.stroke = stroke;
        this.color = color;
    }

    public void with(MolarPart molarPart, GradientPaint paint) {
        this.molarPart = molarPart;
        this.paint = paint;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        if (molarPart == null) {
            g2.setStroke(StrokeStyle.BASIC);
            g2.setColor(Color.BLACK);
            g2.draw(ShapeHelper.Graham(this, MolarPart.TOP));
            g2.draw(ShapeHelper.Graham(this, MolarPart.BOTTOM));
            g2.draw(ShapeHelper.Graham(this, MolarPart.LEFT));
            g2.draw(ShapeHelper.Graham(this, MolarPart.RIGHT));
            g2.draw(ShapeHelper.Graham(this, MolarPart.CENTER));
        } else {
            boolean isDraw = (stroke != null && color != null);
            boolean isFill = (paint != null);
            if (isDraw) {
                g2.setStroke(stroke);
                g2.setColor(color);
                g2.draw(ShapeHelper.Graham(this, molarPart));
            } else if (isFill) {
                g2.setPaint(paint);
                g2.fill(ShapeHelper.Graham(this, molarPart));
            }
        }

        g2.dispose();
    }
}
