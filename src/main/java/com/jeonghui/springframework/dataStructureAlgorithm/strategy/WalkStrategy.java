package com.jeonghui.springframework.dataStructureAlgorithm.strategy;

import java.util.List;

//전략 클래스
public class WalkStrategy implements MovementStrategy {
	
	private String walk;
    private List<Integer> values;

    public WalkStrategy(List<Integer> values) {
        this.values = values;
    }

    @Override
    public void move() {
        walk = "로봇이 걸었습니다.";
        printValues(values, walk);
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
