package com.maxron.daggersample.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maxron on 2018/3/26.
 */

@Module
public class CarModule {

    @Provides
    public Car provideCar() {
        return new TeslaCar();
    }
}
