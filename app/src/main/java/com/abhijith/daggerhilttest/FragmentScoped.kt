package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.abhijith.daggerhilttest.di.sampleclass.ActivityModuleData
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationModuleData
import com.abhijith.daggerhilttest.di.sampleclass.FragmentModuleData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FragmentScoped : Fragment(R.layout.fragment_test_frament) {

    @Inject
    lateinit var acd: ApplicationModuleData

    @Inject
    lateinit var atcd: ActivityModuleData

    @Inject
    lateinit var fcd: FragmentModuleData

    @SuppressLint("LogNotTimber")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("AbhiTestFragment","-------------------Fragment----------------------")
        Log.e("AbhiTestFragment",acd.from)
        Log.e("AbhiTestFragment",atcd.from)
        Log.e("AbhiTestFragment",fcd.from)
//        Btn_fragment(this.requireContext()).hello()
        onDestroy()
    }

}