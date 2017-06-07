package com.pusilkom.rsgmui.odontogram.shape;

import com.pusilkom.rsgmui.odontogram.abstracts.Layer;
import com.pusilkom.rsgmui.odontogram.constant.StrokeStyle;
import com.pusilkom.rsgmui.odontogram.enums.HLinePart;
import com.pusilkom.rsgmui.odontogram.enums.VLinePart;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by fahri on 4/24/17.
 */
public class VLine extends Layer {
    VLinePart vLine;

    public void with(VLinePart vLinePart) {
        this.vLine = vLinePart;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        g2.setStroke(StrokeStyle.BOLDER_BASIC);
        g2.setColor(Color.black);

        double w_per2 = this.getWidth()/2;
        double h_per2 = this.getHeight()/2;

        if (vLine == VLinePart.FULL) {
            g2.draw(new Line2D.Double(this.getX() + w_per2, this.getY(), this.getX() + w_per2, this.getYHeight()));
        } else if (vLine == VLinePart.HALF_TOP) {
            g2.draw(new Line2D.Double(this.getX() + w_per2, this.getY(), this.getX() + w_per2, this.getYHeight() - h_per2));
        } else if (vLine == VLinePart.HALF_BOTTOM) {
            g2.draw(new Line2D.Double(this.getX() + w_per2, this.getYHeight(), this.getX() + w_per2, this.getYHeight() - h_per2));
        }

        g2.dispose();
    }
}
