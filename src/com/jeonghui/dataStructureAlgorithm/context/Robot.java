package com.jeonghui.dataStructureAlgorithm.context;

import com.jeonghui.dataStructureAlgorithm.strategy.MovementStrategy;

public class Robot {
	private MovementStrategy movementStrategy;

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        if (movementStrategy != null) {
            movementStrategy.move();
        } else {
            System.out.println("행동을 선택하세요.");
        }
    }
}
