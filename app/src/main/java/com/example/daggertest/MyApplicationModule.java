package com.example.daggertest;

import dagger.Module;
import dagger.Provides;

@Module
public class MyApplicationModule {

    @Provides
    NetworkApi provideNetworkApi()
    {
        return new NetworkApi();
    }
}
