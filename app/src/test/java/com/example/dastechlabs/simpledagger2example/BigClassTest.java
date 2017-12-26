package com.example.dastechlabs.simpledagger2example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by dastechlabs on 12/26/17.
 */

public class BigClassTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    ClassA classA;

    @Mock
    ClassB classB;

    @InjectMocks
    BigClass bigClass;

    @Before
    public void setupBehavior() {
        when(classA.getValue1()).thenReturn(2);
        when(classA.getValue2()).thenReturn(3);

        when(classB.getValue1()).thenReturn("a");
        when(classB.getValue2()).thenReturn("b");
    }

    @Test
    public void performAddition() {
        System.out.println(bigClass.getSum());
        assertEquals(bigClass.getSum(), 5);
    }

    @Test
    public void performStringConcatenation() {
        System.out.println(bigClass.getString());
        assertEquals(bigClass.getString(),"ab");
    }
}
