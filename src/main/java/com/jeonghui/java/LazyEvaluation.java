package com.jeonghui.java;

import java.util.function.Supplier;

public class LazyEvaluation {
    public static void main(String[] args) {
        lazyEvaluationTest(() -> lazyEvaluation());
    }

    static boolean lazyEvaluationTest(Supplier<Boolean> isLazy) {
        System.out.println("convertBooleanToString");
        if (true || isLazy.get()) {
            System.out.println("method execute!!!");
        }
        return isLazy.get();
    }

    static private boolean lazyEvaluation() {
        System.out.println("lazy evaluation");
        return true;
    }
}

