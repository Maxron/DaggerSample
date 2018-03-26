package com.maxron.daggersample.model;

import javax.inject.Inject;

/**
 * Created by maxron on 2018/3/26.
 */

public class TeslaCar extends Car {

    @Inject
    public TeslaCar() {
    }

    @Override
    public String brand() {
        return "Tesla";
    }
}
