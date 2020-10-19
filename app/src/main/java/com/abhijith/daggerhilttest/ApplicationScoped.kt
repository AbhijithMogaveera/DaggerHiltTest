package com.abhijith.daggerhilttest

import android.app.Application
import com.abhijith.daggerhilttest.module.component.AppComponent
import com.abhijith.daggerhilttest.module.component.DaggerAppComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApplicationScoped : Application(){

//    val appComponent: AppComponent by lazy {
//        initializeComponent()
//    }
//
//    fun initializeComponent(): AppComponent {
//        return DaggerAppComponent.factory().build(applicationContext)
//    }
}