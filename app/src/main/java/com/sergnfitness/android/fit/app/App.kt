package com.sergnfitness.android.fit.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application()

//{
//
//    lateinit var appComponent: AppComponent
//
//    override fun onCreate() {
//        super.onCreate()
//
//    appComponent = DaggerAppComponent
//        .builder()
//        .appModule(AppModule(context = this))
//        .build()
//
//    }
//}