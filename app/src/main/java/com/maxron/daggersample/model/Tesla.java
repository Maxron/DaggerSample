package com.maxron.daggersample.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by maxron on 2018/3/28.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Tesla {}
