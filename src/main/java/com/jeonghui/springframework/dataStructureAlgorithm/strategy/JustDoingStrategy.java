package com.jeonghui.springframework.dataStructureAlgorithm.strategy;

import java.util.List;

//제너릭 클래스
public class JustDoingStrategy<T> implements MovementStrategy {
	private String action;
    private List<T> values;

    public JustDoingStrategy(List<T> values) {
        this.values = values;
    }

    @Override
    public void move() {
        action = " 행동을 하였습니다.";
        printAction(values, action);
    }

    private void printAction(List<T> values, String action) {
        for (T value : values) {
        	System.out.println("로봇이 " + value + action);
        }
    }
}
