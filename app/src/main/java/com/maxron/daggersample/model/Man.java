package com.maxron.daggersample.model;

/**
 * Created by maxron on 2018/3/24.
 */

public class Man implements CarInjector{
    private Car car;

    public Man() {
    }

    public String carBrand() {
        return this.car.brand();
    }

    @Override
    public void injectCar(Car car) {
        this.car = car;
    }
}
