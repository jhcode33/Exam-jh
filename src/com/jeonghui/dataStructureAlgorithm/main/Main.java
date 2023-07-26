package com.jeonghui.dataStructureAlgorithm.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.jeonghui.dataStructureAlgorithm.context.Robot;
import com.jeonghui.dataStructureAlgorithm.strategy.FlyStrategy;
import com.jeonghui.dataStructureAlgorithm.strategy.JustDoingStrategy;
import com.jeonghui.dataStructureAlgorithm.strategy.MovementStrategy;
import com.jeonghui.dataStructureAlgorithm.strategy.WalkStrategy;

public class Main {
	//== 전략 패턴을 사용했습니다. ==//
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
    	// context 생성
        Robot robot = new Robot();
        
        // 전략 생성 및 주입
        robot.setMovementStrategy(createMovementStrategy(scanner));
        robot.move();
    }
    
    
    // 전략 선택 및 생성
    private static MovementStrategy createMovementStrategy(Scanner scanner) {
        System.out.print("로봇이 수행할 작업을 선택하세요 (Walk / Fly / Swim / anything): ");
        String movementType = scanner.nextLine();

        if ("Walk".equals(movementType)) {
        	List<Integer> values = readIntegerInputValues(scanner);
            return new WalkStrategy(values);
            
        } else if ("Fly".equals(movementType)) {
        	List<Integer> values = readIntegerInputValues(scanner);
            return new FlyStrategy(values);
        
        // 전략 패턴 람다식 적용
        } else if ("Swim".equals(movementType)) {
        	List<Integer> values = readIntegerInputValues(scanner);
        	
        	//MovementStrategy 인터페이스의 move() 메소드를 구현함
        	return () -> {
                String move = "로봇이 수영하였습니다.";
                int sum = 0;

                for (Integer value : values) {
                    sum += value;
                }

                System.out.println("Total sum: " + sum);
                System.out.println(sum + "km 거리를 " + move);
            };
            
        // 제너릭 클래스 사용
        } else if  ("anything".equals(movementType)) {
        	List<String> values = readStringInputValues(scanner);
        	return new JustDoingStrategy<>(values);
            
        } else {
        	throw new IllegalArgumentException("지원하지 않는 기능입니다.");
        }
    }
    
    // int를 입력 받을 메소드
    private static List<Integer> readIntegerInputValues(Scanner scanner) {
        List<Integer> values = new ArrayList<>();
        System.out.println("이동할 거리를 세번 입력하세요: ");
        
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 이동거리: ");

            try {
                int value = scanner.nextInt();
                values.add(value);
                
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
                scanner.nextLine(); 
                i--;
            }
        }
        scanner.close();
        return values;
    }
    
    // string을 입력 받을 메소드
    private static List<String> readStringInputValues(Scanner scanner) {
        List<String> values = new ArrayList<>();
        System.out.println("행동을 세번 입력하세요: ");
        
        for (int i = 0; i < 3; i++) {
        	System.out.print((i+1) + "번째 행동: ");
        	String value = scanner.nextLine();
            values.add(value);
        }
        scanner.close();
        return values;
    }
}
