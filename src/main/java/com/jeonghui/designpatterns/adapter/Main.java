package com.jeonghui.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // ToyDuck는 진짜 새의 소리를 낼 수 없지만
        // Adapter을 통해서 접근하여 소리를 낼 수 있음
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("---Sparrow---");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println();

        System.out.println("---ToyDuck---");
        toyDuck.squeak();
        System.out.println();

        System.out.println("---BirdAdapter---");
        birdAdapter.squeak();
    }
}
