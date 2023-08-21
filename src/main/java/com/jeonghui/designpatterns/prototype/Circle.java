package com.jeonghui.designpatterns.prototype;

public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
