package com.maxron.daggersample.model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maxron on 2018/3/26.
 */

@Module
public class CarModule {

    @Provides
    @Tesla
    public Car provideTesla() {
        return new TeslaCar();
    }

    @Provides
    @AustonMartin
    public Car provideAustonMartin() {
        return new AustonMartinCar();
    }
}
