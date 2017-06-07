package com.pusilkom.rsgmui.odontogram.shape;

import com.pusilkom.rsgmui.odontogram.abstracts.Layer;
import com.pusilkom.rsgmui.odontogram.constant.StrokeStyle;
import com.pusilkom.rsgmui.odontogram.enums.GerahamPart;
import com.pusilkom.rsgmui.odontogram.helper.ShapeHelper;

import java.awt.*;

/**
 * Created by fahri on 4/25/17.
 */
public class Geraham extends Layer {
    GerahamPart gerahamPart;
    Stroke stroke;
    Color color;
    GradientPaint paint;

    public void with(GerahamPart gerahamPart, Stroke stroke, Color color) {
        this.gerahamPart = gerahamPart;
        this.stroke = stroke;
        this.color = color;
    }

    public void with(GerahamPart gerahamPart, GradientPaint paint) {
        this.gerahamPart = gerahamPart;
        this.paint = paint;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        if (gerahamPart == null) {
            g2.setStroke(StrokeStyle.BASIC);
            g2.setColor(Color.BLACK);
            g2.draw(ShapeHelper.Graham(this, GerahamPart.TOP));
            g2.draw(ShapeHelper.Graham(this, GerahamPart.BOTTOM));
            g2.draw(ShapeHelper.Graham(this, GerahamPart.LEFT));
            g2.draw(ShapeHelper.Graham(this, GerahamPart.RIGHT));
            g2.draw(ShapeHelper.Graham(this, GerahamPart.CENTER));
        } else {
            boolean isDraw = (stroke != null && color != null);
            boolean isFill = (paint != null);
            if (isDraw) {
                g2.setStroke(stroke);
                g2.setColor(color);
                g2.draw(ShapeHelper.Graham(this, gerahamPart));
            } else if (isFill) {
                g2.setPaint(paint);
                g2.fill(ShapeHelper.Graham(this, gerahamPart));
            }
        }

        g2.dispose();
    }
}
