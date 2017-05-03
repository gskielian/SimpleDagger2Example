package com.example.dastechlabs.simpledagger2example;

import com.example.dastechlabs.simpledagger2example.ClassA;
import com.example.dastechlabs.simpledagger2example.ClassB;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dastechlabs on 5/3/17.
 */

@Module
public class AlphabetModules {

    @Provides
    ClassA provideClassA() {
        return new ClassA(1,2);
    }

    @Provides
    ClassB provideClassB() {
        return new ClassB("a", "b");
    }

    @Provides
    BigClass provideBigClass() {
        return new BigClass(provideClassA(),provideClassB());
    }
}
