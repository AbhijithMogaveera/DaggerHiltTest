package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.GravityCompat
import com.abhijith.daggerhilttest.module.data.ActivityModuleData
import com.abhijith.daggerhilttest.module.data.ActivityRetainedModuleData
import com.abhijith.daggerhilttest.module.data.ApplicationModuleData
import com.abhijith.daggerhilttest.module.data.ViewModuleData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@SuppressLint("LogNotTimber")
@AndroidEntryPoint
class ViewScoped : AppCompatButton {

    @Inject
    lateinit var vcd:ViewModuleData

    @Inject
    lateinit var acd: ApplicationModuleData

    @Inject
    lateinit var atcd: ActivityModuleData

    @Inject
    lateinit var strcd: ActivityRetainedModuleData

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @SuppressLint("SetTextI18n")
    fun showConsumedData(){
        gravity  = Gravity.LEFT
        text = "" +
                "\nCustom view inside Activity " +
                "\n${vcd.from.trim()} " +
                "\n${atcd.from.trim()} " +
                "\n${strcd.from.trim()} " +
                "\n${acd.from.trim()} "
    }
}