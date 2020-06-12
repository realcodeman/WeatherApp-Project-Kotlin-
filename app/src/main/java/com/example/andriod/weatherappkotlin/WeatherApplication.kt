package com.example.andriod.weatherappkotlin

import android.app.Application
import com.example.andriod.weatherappkotlin.di.AppComponent
import com.example.andriod.weatherappkotlin.di.ContextModule
import com.example.andriod.weatherappkotlin.di.DaggerAppComponent

class WeatherApplication : Application() {

    lateinit var component:AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().contextModule(ContextModule(this)).build()
    }
    fun getAppComponent(): AppComponent{
        return component
    }
    }
