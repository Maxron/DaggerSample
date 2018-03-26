package com.maxron.daggersample.view;

import com.maxron.daggersample.model.CarModule;

import dagger.Component;

/**
 * Created by maxron on 2018/3/25.
 */

@Component( modules = CarModule.class )
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
