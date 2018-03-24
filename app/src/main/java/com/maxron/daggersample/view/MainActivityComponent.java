package com.maxron.daggersample.view;

import dagger.Component;

/**
 * Created by maxron on 2018/3/25.
 */

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
