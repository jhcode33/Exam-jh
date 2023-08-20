package com.jeonghui.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();

        Computer highPerformanceComputer = computerDirector.buildHighPerformanceComputer();
        Computer basicComputer = computerDirector.buildBasicComputer();

        System.out.println("High Performance Computer: " + highPerformanceComputer.toString());
        System.out.println("Basic Computer: " + basicComputer.toString());
    }
}
