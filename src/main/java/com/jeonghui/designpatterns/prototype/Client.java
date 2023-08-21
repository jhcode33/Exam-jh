package com.jeonghui.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        Shape originalCircle = new Circle();
        Shape originalSquare = new Square();

        Shape clonedCircle = (Shape) originalCircle.clone();
        Shape clonedSquare = (Shape) originalSquare.clone();

        originalCircle.draw();
        clonedCircle.draw();

        originalSquare.draw();
        clonedSquare.draw();
    }
}
