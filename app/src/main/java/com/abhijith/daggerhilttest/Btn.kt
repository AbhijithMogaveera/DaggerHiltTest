package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Button
import com.abhijith.daggerhilttest.di.sampleclass.ViewComponentData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@SuppressLint("LogNotTimber")
@AndroidEntryPoint
class Btn(ctx:Context) :View(ctx){

    @Inject
    lateinit var vcd:ViewComponentData

    init{
        Log.e("AbhiBtn","-------------------VIEW----------------------")
        Log.e("AbhiBtn",vcd.from)
    }

}