package com.maxron.daggersample.model;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maxron on 2018/3/26.
 */

@Module
public class CarModule {

    @Provides
    @Named("Tesla")
    public Car provideTesla() {
        return new TeslaCar();
    }

    @Provides
    @Named("AustonMartin")
    public Car provideAustonMartin() {
        return new AustonMartinCar();
    }
}
