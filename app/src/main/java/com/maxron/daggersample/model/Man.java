package com.maxron.daggersample.model;

import javax.inject.Inject;

/**
 * Created by maxron on 2018/3/24.
 */

public class Man {
    private Car car;

    @Inject
    public Man(@AustonMartin Car car) {
        this.car = car;
    }

    public String carBrand() {
        return this.car.brand();
    }

}
