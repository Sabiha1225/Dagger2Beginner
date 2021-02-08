package com.example.daggertest;

import dagger.Component;

@Component(modules = MyApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
