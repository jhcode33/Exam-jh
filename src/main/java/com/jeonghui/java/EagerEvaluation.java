package com.jeonghui.java;

public class EagerEvaluation {
    public static void main(String[] args) {
        eagerEvaluationTest(eagerEvaluation());
    }

    static boolean eagerEvaluationTest(boolean isEager) {
        System.out.println("convertBooleanToString");
        if (true || isEager) {
            System.out.println("method execute!!!");
        }
        return isEager;
    }

    static private boolean eagerEvaluation() {
        System.out.println("eager evaluation");
        return true;
    }

}
