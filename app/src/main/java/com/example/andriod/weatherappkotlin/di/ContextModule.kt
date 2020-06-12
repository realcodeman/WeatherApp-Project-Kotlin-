package com.example.andriod.weatherappkotlin.di

import android.content.Context
import com.example.andriod.weatherappkotlin.WeatherApplication
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val application: WeatherApplication) {

    @Provides
    fun context(): Context {
        return application
    }
}