package com.example.andriod.weatherappkotlin.di

import com.example.andriod.weatherappkotlin.WeatherApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules=[ContextModule::class])
interface AppComponent {
    fun inject(application: WeatherApplication)
}