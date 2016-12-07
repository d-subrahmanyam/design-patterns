package com.subbu.patterns.problem;

/**
 * Created by devsu04 on 07/12/16.
 */
public class GraphicEditor {

    public String drawShape(Shape s) {
        String result = null;
        switch (s.getType()) {
            case Circle:
                result = drawCircle();
                break;
            case Square:
                result = drawSquare();
                break;
            case Rectangle:
                result = drawRectangle();
                break;
        }
        return result;
    }

    private String drawCircle() {
        return("drawing a circle...");
    }

    private String drawSquare() {
        return("drawing a square...");
    }

    private String drawRectangle() {
        return("drawing a rectangle...");
    }
}
