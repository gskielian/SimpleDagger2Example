package com.example.dastechlabs.simpledagger2example;



import dagger.Component;

/**
 * Created by dastechlabs on 5/3/17.
 */
@Component(modules=AlphabetModules.class)
public interface AlphabetComponent {
    BigClass provideBigClass();

    void inject(MainActivity mainActivity);

}
