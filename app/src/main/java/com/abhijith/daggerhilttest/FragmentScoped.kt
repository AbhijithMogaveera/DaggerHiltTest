package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import androidx.fragment.app.Fragment
import com.abhijith.daggerhilttest.module.data.ActivityModuleData
import com.abhijith.daggerhilttest.module.data.ActivityRetainedModuleData
import com.abhijith.daggerhilttest.module.data.ApplicationModuleData
import com.abhijith.daggerhilttest.module.data.FragmentModuleData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.tv_four
import kotlinx.android.synthetic.main.activity_main.tv_one
import kotlinx.android.synthetic.main.activity_main.tv_three
import kotlinx.android.synthetic.main.activity_main.tv_two
import kotlinx.android.synthetic.main.fragment_test_frament.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentScoped : Fragment(R.layout.fragment_test_frament) {

    @Inject
    lateinit var applicationModuleData: ApplicationModuleData

    @Inject
    lateinit var activityModuleData: ActivityModuleData

    @Inject
    lateinit var activityRetainedModuleData: ActivityRetainedModuleData

    @Inject
    lateinit var fragmentModuleData: FragmentModuleData

    @SuppressLint("LogNotTimber")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_one.apply {
            text = "Fragment"
            gravity = Gravity.CENTER
        }
        tv_one.gravity = Gravity.CENTER
        tv_two.text = applicationModuleData.from
        tv_three.text = activityRetainedModuleData.from
        tv_four.text = activityModuleData.from
        tv_five.text = fragmentModuleData.from
        btn_data_shows.showConsumedData()
    }

}