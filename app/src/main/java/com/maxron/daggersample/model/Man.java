package com.maxron.daggersample.model;

/**
 * Created by maxron on 2018/3/24.
 */

public class Man {
    private Car car;

    public Man(Car car) {
        this.car = car;
    }

    public String carBrand() {
        return this.car.brand();
    }
}
