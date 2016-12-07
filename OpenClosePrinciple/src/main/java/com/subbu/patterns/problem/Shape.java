package com.subbu.patterns.problem;

/**
 * Created by devsu04 on 07/12/16.
 */
public class Shape {

    private ShapeType type;

    public Shape(){}

    public Shape(ShapeType type) {
        this.type=type;
    }

    public ShapeType getType(){
        return this.type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }
}
