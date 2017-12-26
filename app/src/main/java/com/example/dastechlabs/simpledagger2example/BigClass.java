package com.example.dastechlabs.simpledagger2example;

import javax.inject.Inject;

/**
 * Created by dastechlabs on 5/2/17.
 */

public class BigClass {

    ClassA classA;
    ClassB classB;

    @Inject
    public BigClass(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    public int getSum() {
        return classA.getValue1() + classA.getValue2();
    }

    public String getString() {
        return classB.getValue1() + classB.getValue2();
    }
}
