package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import com.abhijith.daggerhilttest.module.data.*
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import javax.inject.Inject

@SuppressLint("LogNotTimber")
@WithFragmentBindings
@AndroidEntryPoint
class ViewScopedWithFragment : AppCompatButton {

    @Inject
    lateinit var vcd: ViewWithFragmentModuleData

    @Inject
    lateinit var acd: ApplicationModuleData

    @Inject
    lateinit var atcd: ActivityModuleData

    @Inject
    lateinit var strcd: ActivityRetainedModuleData

    init{ }
    constructor(context: Context) : super(context) {}
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    @SuppressLint("LogNotTimber")
    override fun onAnimationEnd() {
        super.onAnimationEnd()
    }

    @SuppressLint("SetTextI18n")
    fun showConsumedData(){
        gravity  = Gravity.LEFT
        text = "" +
                "\nCustom view inside Fragment " +
                "\n${vcd.from.trim()} " +
                "\n${atcd.from.trim()} " +
                "\n${strcd.from.trim()} " +
                "\n${acd.from.trim()} "
    }
}