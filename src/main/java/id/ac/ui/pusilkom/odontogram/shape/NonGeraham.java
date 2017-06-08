package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.NonGerahamPart;
import id.ac.ui.pusilkom.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class NonGeraham extends Layer {
    NonGerahamPart nonGerahamPart;
    Stroke stroke;
    Color color;
    GradientPaint paint;
    
    public void with(NonGerahamPart nonGerahamPart, Stroke stroke, Color color) {
        this.nonGerahamPart = nonGerahamPart;
        this.stroke = stroke;
        this.color = color;
    }
    
    public void with(NonGerahamPart nonGerahamPart, GradientPaint paint) {
        this.nonGerahamPart = nonGerahamPart;
        this.paint = paint;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        if (nonGerahamPart == null) {
            g2.setStroke(StrokeStyle.BASIC);
            g2.setColor(Color.BLACK);
            g2.draw(ShapeHelper.Taring(this, NonGerahamPart.TOP));
            g2.draw(ShapeHelper.Taring(this, NonGerahamPart.BOTTOM));
            g2.draw(ShapeHelper.Taring(this, NonGerahamPart.LEFT));
            g2.draw(ShapeHelper.Taring(this, NonGerahamPart.RIGHT));
        } else {
            boolean isDraw = (stroke != null && color != null);
            boolean isFill = (paint != null);
            if (isDraw) {
                g2.setStroke(stroke);
                g2.setColor(color);
                g2.draw(ShapeHelper.Taring(this, nonGerahamPart));
            } else if (isFill) {
                g2.setPaint(paint);
                g2.fill(ShapeHelper.Taring(this, nonGerahamPart));
            }
        }

        g2.dispose();
    }
}
