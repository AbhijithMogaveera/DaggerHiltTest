package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationModuleData
import com.abhijith.daggerhilttest.di.sampleclass.ServiceModuleData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ServiceScoped : LifecycleService() {

    @Inject
    lateinit var scd:ServiceModuleData;

    @Inject
    lateinit var acd: ApplicationModuleData

    @SuppressLint("LogNotTimber")
    override fun onCreate() {
        super.onCreate()
        Log.e("AbhiMainActivity","-------------------Service----------------------")
        Log.e("AbhiTrackingService", acd.from)
        Log.e("AbhiTrackingService", scd.from)
        onDestroy()
    }
}