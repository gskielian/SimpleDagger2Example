package com.example.dastechlabs.simpledagger2example;

import javax.inject.Inject;

/**
 * Created by dastechlabs on 5/2/17.
 */

public class ClassA {
    private int value1;
    private int value2;

    @Inject
    public ClassA(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
