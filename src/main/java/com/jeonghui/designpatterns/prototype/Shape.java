package com.jeonghui.designpatterns.prototype;

abstract class Shape implements Cloneable{

    protected String type;

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
