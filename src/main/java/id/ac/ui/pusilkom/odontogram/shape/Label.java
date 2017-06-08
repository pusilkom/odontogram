package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;

import java.awt.*;

/**
 * Created by fahri on 4/24/17.
 */
public class Label extends Layer {
    
    private String label;
    private int newWidth;
    
    public void with(String label) {
        this.label = label;
        this.newWidth = this.getWidth();
    }

    public void with(String label, String dia) {
        this.label = label;
        if(dia.equalsIgnoreCase("dia")) {
            this.newWidth = this.getWidth() / 2;
        }
    }

    public void draw() {
        this.init();

        Graphics2D g2 = this.getGraphics2D();

        g2.setStroke(StrokeStyle.BASIC);
        g2.setColor(Color.BLACK);

        g2.setFont(new Font("Dejavu Sans", Font.BOLD, 15)); // monospace not necessary
        FontMetrics fontMetrics = g2.getFontMetrics();

        int height_font = fontMetrics.getHeight();
        int width_font = fontMetrics.stringWidth(label);

        int start_x = this.getX() + (this.newWidth / 2) - (width_font/2); // horizontal center aligned
        double tune_height_font = (height_font/1.5);

        int start_y = (int) ((this.getY() + tune_height_font) + (this.getHeight()/2) - (tune_height_font/2)); // vertical center aligned

        g2.drawString(label, start_x, start_y);

        g2.dispose();
    }
}
