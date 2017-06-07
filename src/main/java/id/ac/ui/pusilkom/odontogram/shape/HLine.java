package com.pusilkom.rsgmui.odontogram.shape;

import com.pusilkom.rsgmui.odontogram.abstracts.Layer;
import com.pusilkom.rsgmui.odontogram.constant.StrokeStyle;
import com.pusilkom.rsgmui.odontogram.enums.HLinePart;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by fahri on 4/24/17.
 */
public class HLine extends Layer {
    HLinePart hLine;

    public void with(HLinePart hLinePart) {
        this.hLine = hLinePart;
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        g2.setStroke(StrokeStyle.BOLDER_BASIC);
        g2.setColor(Color.black);

        double w_per2 = this.getWidth()/2;
        double h_per2 = this.getHeight()/2;

        if (hLine == HLinePart.FULL) {
            g2.draw(new Line2D.Double(this.getX(), this.getY() + h_per2, this.getXWidth(), this.getY() + h_per2));
        } else if (hLine == HLinePart.HALF_LEFT) {
            g2.draw(new Line2D.Double(this.getX() + w_per2, this.getY() + h_per2, this.getX(), this.getY() + h_per2));
        } else if (hLine == HLinePart.HALF_RIGHT) {
            g2.draw(new Line2D.Double(this.getX() + w_per2, this.getY() + h_per2, this.getXWidth(), this.getY() + h_per2));
        }

        g2.dispose();
    }
}
