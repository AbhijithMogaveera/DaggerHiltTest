package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import com.abhijith.daggerhilttest.di.sampleclass.ViewModuleData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@SuppressLint("LogNotTimber")
@AndroidEntryPoint
class ViewScoped : AppCompatButton {

    @Inject
    lateinit var vcd:ViewModuleData

    init{ }
    constructor(context: Context) : super(context) {}
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @SuppressLint("LogNotTimber")
    override fun onAnimationEnd() {
        super.onAnimationEnd()
    }

    fun hello(){
        Log.e("AbhiBtn","-------------------Btn----------------------")
        Log.e("AbhiBtn",vcd.from)
    }
}