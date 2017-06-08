package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;
import id.ac.ui.pusilkom.odontogram.enums.VLinePart;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by fahri on 4/24/17.
 */
public class Hash extends Layer {

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        g2.setStroke(StrokeStyle.BOLDER_BASIC);
        g2.setColor(Color.black);

        double w_per5 = this.getWidth()/5;
        double h_per5 = this.getHeight()/5;
        double w_per6 = this.getWidth()/6;
        double h_per6 = this.getHeight()/6;

        double two_times_w_per5 = 2 * w_per5;
        double two_times_h_per5 = 2 * h_per5;

        double two_times_w_per6 = 2 * w_per6;
        double two_times_h_per6 = 2 * h_per6;

        g2.draw(new Line2D.Double(this.getX() + two_times_w_per5, this.getY(), this.getX() + w_per5, this.getYHeight()));
        g2.draw(new Line2D.Double(this.getXWidth() - w_per5, this.getY(), this.getXWidth() - two_times_h_per5, this.getYHeight()));

        g2.draw(new Line2D.Double(this.getX(), this.getY() + two_times_h_per6, this.getXWidth(), this.getY() + two_times_h_per6));
        g2.draw(new Line2D.Double(this.getX(), this.getYHeight() - two_times_h_per6, this.getXWidth(), this.getYHeight() - two_times_h_per6));

        g2.dispose();
    }
}
