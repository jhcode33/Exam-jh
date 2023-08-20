package com.jeonghui.designpatterns.builder;

public class ComputerBuilder {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

    public ComputerBuilder setCpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setGpu(String gpu){
        this.gpu = gpu;
        return this;
    }

    public  ComputerBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }

    public  ComputerBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }

    public Computer build(){
        return new Computer(cpu, gpu, ram, storage);
    }
}
