package id.ac.ui.pusilkom.odontogram.shape;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.constant.PaintStyle;
import id.ac.ui.pusilkom.odontogram.constant.StrokeStyle;

import java.awt.*;
import java.awt.geom.*;

/**
 * Created by fahri on 4/24/17.
 */
public class Arrow extends Layer {
    String orient = "RIGHT";
    Stroke stroke;
    public void with(String orient, Stroke stroke){
        this.orient = orient;
        this.stroke = stroke;
    }
    public void draw() {
        init();
//
        Graphics2D g2 = this.getGraphics2D();
        g2.setColor(Color.BLACK);
        g2.setPaint(PaintStyle.SOLID_BLACK);
        GeneralPath path = new GeneralPath();
        if(orient.equalsIgnoreCase("RIGHT")) {
            int newWidth = this.getWidth()*4/5;

            path.moveTo (this.getX() +(this.getWidth()/5), this.getY() + this.getHeight()/2);
            path.lineTo (this.getX() +(this.getWidth()/5) + (newWidth*3/5), this.getY()+this.getHeight()/2);
            g2.setStroke(this.stroke);
            g2.draw(path);
            path.lineTo (this.getX() +(this.getWidth()/5) + (newWidth*3/5), (this.getY()+this.getHeight()*3/4));
            path.lineTo (this.getX() +(this.getWidth()/5) + (newWidth*4/5), this.getY()+this.getHeight()/2);
            path.lineTo (this.getX() +(this.getWidth()/5) + (newWidth*3/5), (this.getY()+this.getHeight()/4));
            path.lineTo (this.getX() +(this.getWidth()/5) + (newWidth*3/5), this.getY()+this.getHeight()/2);
        } else if(orient.equalsIgnoreCase("LEFT")) {
            int newWidth = this.getWidth()*4/5;
            path.moveTo (this.getX() +(this.getWidth()/5 + newWidth), this.getY() + this.getHeight()/2);
            path.lineTo (this.getX() +(this.getWidth()*2/5), (this.getY()+this.getHeight()*2/4));
            g2.setStroke(this.stroke);
            g2.draw(path);
            path.lineTo (this.getX() +(this.getWidth()*2/5), (this.getY()+this.getHeight()*3/4));
            path.lineTo (this.getX() +(this.getWidth()/5), (this.getY()+this.getHeight()*2/4));
            path.lineTo (this.getX() +(this.getWidth()*2/5), (this.getY()+this.getHeight()*1/4));
            path.lineTo (this.getX() +(this.getWidth()*2/5), (this.getY()+this.getHeight()*2/4));
        } else if(orient.equalsIgnoreCase("UP")) {
            path.moveTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight());
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*2/5);
            g2.setStroke(this.stroke);
            g2.draw(path);
            path.lineTo(this.getX() + this.getWidth()*1/4, this.getY() + this.getHeight()*2/5);
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*1/5);
            path.lineTo(this.getX() + this.getWidth()*3/4, this.getY() + this.getHeight()*2/5);
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*2/5);
        } else if(orient.equalsIgnoreCase("DOWN")) {
            path.moveTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*1/5);
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*4/5);
            g2.setStroke(this.stroke);
            g2.draw(path);
            path.lineTo(this.getX() + this.getWidth()*1/4, this.getY() + this.getHeight()*4/5);
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight());
            path.lineTo(this.getX() + this.getWidth()*3/4, this.getY() + this.getHeight()*4/5);
            path.lineTo(this.getX() + this.getWidth()/2, this.getY() + this.getHeight()*4/5);
        } else if(orient.equalsIgnoreCase("CLOCKWISE")) {
            QuadCurve2D q = new QuadCurve2D.Double();
            q.setCurve(this.getX()+this.getWidth()/2, (double)(this.getY()+this.getHeight()), this.getX()+this.getWidth()/10, (this.getY()+this.getHeight()/2), this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            //path.moveTo(this.getX()+this.getWidth()*7.5/10, this.getY()+this.getHeight()/2);
            //path.curveTo((this.getX()+this.getWidth()*7.5/10), (double)(this.getY()+this.getHeight()/2), (this.getX()+this.getWidth()/2), (double)(this.getY()+this.getHeight()), (this.getX()+this.getWidth()*2.5/10), (this.getY()+this.getHeight()/2));

            g2.setStroke(this.stroke);
            g2.draw(q);
            path.moveTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            path.lineTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/6);
            path.lineTo(this.getX()+this.getWidth()*3/5, this.getY()+this.getHeight()/5);
            path.lineTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/3);
            path.moveTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            g2.draw(path);
        } else if(orient.equalsIgnoreCase("COUNTERCLOCKWISE")) {
            QuadCurve2D q = new QuadCurve2D.Double();
            q.setCurve(this.getX()+this.getWidth()/2, (double)(this.getY()+this.getHeight()), this.getX()+this.getWidth()/10, (this.getY()+this.getHeight()/2), this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            //path.moveTo(this.getX()+this.getWidth()*7.5/10, this.getY()+this.getHeight()/2);
            //path.curveTo((this.getX()+this.getWidth()*7.5/10), (double)(this.getY()+this.getHeight()/2), (this.getX()+this.getWidth()/2), (double)(this.getY()+this.getHeight()), (this.getX()+this.getWidth()*2.5/10), (this.getY()+this.getHeight()/2));

            g2.setStroke(this.stroke);
            AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
            tx.translate(-(this.getX()+this.getXWidth()), 0);
            g2.transform(tx);
            g2.draw(q);
            path.moveTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            path.lineTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/6);
            path.lineTo(this.getX()+this.getWidth()*3/5, this.getY()+this.getHeight()/5);
            path.lineTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/3);
            path.moveTo(this.getX()+this.getWidth()/2, this.getY()+this.getHeight()/5);
            g2.draw(path);
        }
        //g2.rotate(Math.toRadians(45), this.getX()/2, this.getY()/2);

        g2.setStroke(StrokeStyle.BASIC);
        g2.fill( path );
        g2.dispose();

    }

//    public void with(int x) {
//
//    }

//    public void draw() {
//        init();
//
//        Graphics2D g2 = this.getGraphics2D();
//
////        X
////        Y
////        XWidth = X + Width
////        YWidth = Y + Height
////        Width
////        Height
//
////        ............
////        |          |
////        |          |
////        ............
//
//
//    }
}
