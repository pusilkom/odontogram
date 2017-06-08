package id.ac.ui.pusilkom.odontogram.helper;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;
import id.ac.ui.pusilkom.odontogram.enums.*;

import java.awt.geom.GeneralPath;

/**
 * Created by fahri on 4/24/17.
 */
public class ShapeHelper {
    public static GeneralPath Graham(Layer l, MolarPart graham) {
        double w_1per4 = l.getWidth()/4;
        double h_1per4 = l.getHeight()/4;
        double w_1per2 = l.getWidth()/2;
        double h_1per2 = l.getHeight()/2;

        GeneralPath shape = new GeneralPath();

        if (graham == MolarPart.CENTER) {
            shape.moveTo(l.getX() + w_1per4, l.getY() + h_1per4);
            shape.lineTo(l.getX() + w_1per4 + w_1per2, l.getY() + h_1per4);
            shape.lineTo(l.getX() + w_1per4 + w_1per2, l.getY() + h_1per4 + h_1per2);
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per4 + h_1per2);
            shape.closePath();
        } else if (graham == MolarPart.TOP) {
            shape.moveTo(l.getX(), l.getY());
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per4);
            shape.lineTo(l.getXWidth() - w_1per4, l.getY() + h_1per4);
            shape.lineTo(l.getXWidth(), l.getY());
            shape.closePath();
        } else if (graham == MolarPart.BOTTOM) {
            shape.moveTo(l.getX(), l.getYHeight());
            shape.lineTo(l.getX() + w_1per4, l.getYHeight() - h_1per4);
            shape.lineTo(l.getXWidth() - w_1per4, l.getYHeight() - h_1per4);
            shape.lineTo(l.getXWidth(), l.getYHeight());
            shape.closePath();
        } else if (graham == MolarPart.LEFT) {
            shape.moveTo(l.getX(), l.getY());
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per4);
            shape.lineTo(l.getX() + w_1per4, l.getYHeight() - h_1per4);
            shape.lineTo(l.getX(), l.getYHeight());
            shape.closePath();
        } else if (graham == MolarPart.RIGHT) {
            shape.moveTo(l.getXWidth(), l.getY());
            shape.lineTo(l.getXWidth() - w_1per4, l.getY() + h_1per4);
            shape.lineTo(l.getXWidth() - w_1per4, l.getYHeight() - h_1per4);
            shape.lineTo(l.getXWidth(), l.getYHeight());
            shape.closePath();
        }

        return shape;
    }

    public static GeneralPath Taring(Layer l, NonMolarPart nonMolarPart) {
        double w_1per4 = l.getWidth()/4;
        double h_1per4 = l.getHeight()/4;
        double w_1per2 = l.getWidth()/2;
        double h_1per2 = l.getHeight()/2;

        GeneralPath shape = new GeneralPath();

        if (nonMolarPart == NonMolarPart.TOP) {
            shape.moveTo(l.getX(), l.getY());
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getXWidth() - w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getXWidth(), l.getY());
            shape.closePath();
        } else if (nonMolarPart == NonMolarPart.BOTTOM) {
            shape.moveTo(l.getX(), l.getYHeight());
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getXWidth() - w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getXWidth(), l.getYHeight());
            shape.closePath();
        } else if (nonMolarPart == NonMolarPart.LEFT) {
            shape.moveTo(l.getX(), l.getY());
            shape.lineTo(l.getX() + w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getX(), l.getYHeight());
            shape.closePath();
        } else if (nonMolarPart == NonMolarPart.RIGHT) {
            shape.moveTo(l.getXWidth(), l.getY());
            shape.lineTo(l.getXWidth() - w_1per4, l.getY() + h_1per2);
            shape.lineTo(l.getXWidth(), l.getYHeight());
            shape.closePath();
        }

        return shape;
    }

    public static GeneralPath TriangleSmall(Layer l, TriangleSmallPart part, TriangleSmallDirection direction) {
        double w_1per4 = l.getWidth()/4;
        double h_1per4 = l.getHeight()/4;
        double w_1per2 = l.getWidth()/2;
        double h_1per2 = l.getHeight()/2;

        double w_per5 = l.getWidth()/5;
        double h_per5 = l.getHeight()/5;

        GeneralPath shape = new GeneralPath();

        if (part == TriangleSmallPart.HALF_RIGHT && direction == TriangleSmallDirection.DOWN) {
            shape.moveTo (l.getXWidth(), l.getY() + h_per5);
            shape.lineTo(l.getXWidth(), l.getYHeight() - h_per5);
            shape.lineTo(l.getXWidth() - w_per5, l.getY() + h_per5);
            shape.closePath();
        } else if (part == TriangleSmallPart.HALF_LEFT && direction == TriangleSmallDirection.DOWN) {
            shape.moveTo (l.getX(), l.getY() + h_per5);
            shape.lineTo(l.getX(), l.getYHeight() - h_per5);
            shape.lineTo(l.getX() + w_per5, l.getY() + h_per5);
            shape.closePath();
        }

        else if (part == TriangleSmallPart.HALF_RIGHT && direction == TriangleSmallDirection.UP) {
            shape.moveTo (l.getXWidth(), l.getY() + h_per5);
            shape.lineTo(l.getXWidth(), l.getYHeight() - h_per5);
            shape.lineTo(l.getXWidth() - w_per5, l.getYHeight() - h_per5);
            shape.closePath();
        } else if (part == TriangleSmallPart.HALF_LEFT && direction == TriangleSmallDirection.UP) {
            shape.moveTo (l.getX(), l.getY() + h_per5);
            shape.lineTo(l.getX(), l.getYHeight() - h_per5);
            shape.lineTo(l.getX() + w_per5, l.getYHeight() - h_per5);
            shape.closePath();
        }

        return shape;
    }


    public static GeneralPath Triangle(Layer l, TriangleDirection direction) {
        double w_per2 = l.getWidth()/2;
        double w_per3 = l.getWidth()/3;
        double h_per3 = l.getHeight()/3;

        GeneralPath shape = new GeneralPath();

        if (direction == TriangleDirection.DOWN) {
            shape.moveTo (l.getX() + w_per3, l.getY());
            shape.lineTo(l.getXWidth() - w_per3, l.getY());
            shape.lineTo(l.getX() + w_per2, l.getYHeight());
            shape.closePath();
        } else if (direction == TriangleDirection.UP) {
            shape.moveTo (l.getX() + w_per3, l.getYHeight());
            shape.lineTo(l.getXWidth() - w_per3, l.getYHeight());
            shape.lineTo(l.getX() + w_per2, l.getY());
            shape.closePath();
        }

        return shape;
    }
}
