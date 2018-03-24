package com.maxron.daggersample.model;

import javax.inject.Inject;

/**
 * Created by maxron on 2018/3/24.
 */

public class Car {

    @Inject
    public Car() {
    }

    public String brand() {
        return "Maserati";
    }
}
