package com.jeonghui.designpatterns.builder;

public class Computer {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

    public Computer(String cpu, String gpu, int ram, int storage){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
