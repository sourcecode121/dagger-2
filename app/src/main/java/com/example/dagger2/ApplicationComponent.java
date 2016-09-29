package com.example.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Anand on 29/09/2016.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(Dagger2Application target);
    void inject(MainActivity target);
}
