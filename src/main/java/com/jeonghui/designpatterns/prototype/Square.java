package com.jeonghui.designpatterns.prototype;

public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
