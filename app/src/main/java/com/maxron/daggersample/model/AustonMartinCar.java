package com.maxron.daggersample.model;

import javax.inject.Inject;

/**
 * Created by maxron on 2018/3/26.
 */

public class AustonMartinCar extends Car {

    @Inject
    public AustonMartinCar() {
    }

    @Override
    public String brand() {
        return "Auston Martin";
    }
}

