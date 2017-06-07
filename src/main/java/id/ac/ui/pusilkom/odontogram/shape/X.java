package com.pusilkom.rsgmui.odontogram.shape;

import com.pusilkom.rsgmui.odontogram.abstracts.Layer;
import com.pusilkom.rsgmui.odontogram.constant.StrokeStyle;
import com.pusilkom.rsgmui.odontogram.enums.VLinePart;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by fahri on 4/24/17.
 */
public class X extends Layer {
    VLinePart vLine;

    public void with(VLinePart vLinePart) {
        this.vLine = vLinePart;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        g2.setStroke(StrokeStyle.BOLDER_BASIC);
        g2.setColor(Color.black);

        g2.draw(new Line2D.Double(this.getX(), this.getY(), this.getXWidth(), this.getYHeight()));
        g2.draw(new Line2D.Double(this.getXWidth(), this.getY(), this.getX(), this.getYHeight()));

        g2.dispose();
    }
}
