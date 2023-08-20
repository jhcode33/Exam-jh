package com.jeonghui.designpatterns.builder;

public class ComputerDirector {

    public Computer buildHighPerformanceComputer(){
        return new ComputerBuilder()
                .setCpu("Intel i9")
                .setGpu("NVIDIA RTX 4090")
                .setRam(32)
                .setStorage(1000)
                .build();
    }

    public Computer buildBasicComputer(){
        return new ComputerBuilder()
                .setCpu("Intel i3")
                .setGpu("NVIDIA RTX 1050")
                .setRam(8)
                .setStorage(500)
                .build();
    }
}
