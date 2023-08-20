package com.jeonghui.springframework.dataStructureAlgorithm.strategy;

import java.util.List;

//전략 클래스
public class FlyStrategy implements MovementStrategy {

	private String fly;
    private List<Integer> values;

    public FlyStrategy(List<Integer> values) {
        this.values = values;
    }

    @Override
    public void move() {
        fly = "로봇이 날았습니다.";
        printValues(values, fly);
    }
    
    private void printValues(List<Integer> values, String move) {
        int sum = 0;

        for (Integer value : values) {
            sum += value;
        }

        System.out.println("Total sum: " + sum);
        System.out.println(sum + "km 거리를 " + move);
    }
}
