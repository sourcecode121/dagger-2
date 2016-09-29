package com.example.dagger2;

import android.app.Application;

/**
 * Created by Anand on 29/09/2016.
 */
public abstract class Dagger2Application extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
