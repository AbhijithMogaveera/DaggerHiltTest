package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationComponentData
import com.abhijith.daggerhilttest.di.sampleclass.ServiceComponentData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class Service : LifecycleService() {

    @Inject
    lateinit var scd:ServiceComponentData;

    @Inject
    lateinit var acd: ApplicationComponentData

    @SuppressLint("LogNotTimber")
    override fun onCreate() {
        super.onCreate()
        Log.e("AbhiMainActivity","-------------------Service----------------------")
        Log.e("AbhiTrackingService", acd.from)
        Log.e("AbhiTrackingService", scd.from)
        onDestroy()
    }
}