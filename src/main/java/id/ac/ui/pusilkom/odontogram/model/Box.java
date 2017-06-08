package id.ac.ui.pusilkom.odontogram.model;

import id.ac.ui.pusilkom.odontogram.abstracts.Layer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fahri on 4/24/17.
 */
public class Box {
    private int x;
    private int y;
    private int width;
    private int height;

    private List<Layer> listLayer = new ArrayList<Layer>();

    public Box(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void appendLayer(Layer... list) {
        for (Layer layer : list) {
            if (layer == null) continue;

            listLayer.add(layer);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Layer> getListLayer() {
        return listLayer;
    }

    public <T> T buildThenAddLayer(Class<T> clazz) {
//        Layer layer = (Layer) clazz.getDeclaredConstructor(Layer.class).newInstance(x, y, width, height);
        Layer layer = null;
        try {
            layer = (Layer) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        layer.setX(x);
        layer.setY(y);
        layer.setWidth(width);
        layer.setHeight(height);


        listLayer.add(layer);
        return (T) layer;
    }

    public <T> T buildLayer(Class<T> clazz) {
        Layer layer = null;
        try {
            layer = (Layer) clazz.getDeclaredConstructor(Layer.class).newInstance(x, y, width, height);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return (T) layer;
    }

    public void recalculatePositionAndSizeOfListLayer() {
        for (Layer layer : listLayer) {
            layer.setX(x);
            layer.setY(y);
            layer.setWidth(width);
            layer.setHeight(height);
        }
    }
}
