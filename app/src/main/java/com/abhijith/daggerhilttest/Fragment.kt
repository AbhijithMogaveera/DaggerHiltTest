package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.abhijith.daggerhilttest.di.sampleclass.ActivityComponentData
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationComponentData
import com.abhijith.daggerhilttest.di.sampleclass.FragmentComponentData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Fragment : Fragment(R.layout.fragment_test_frament) {

    @Inject
    lateinit var acd: ApplicationComponentData

    @Inject
    lateinit var atcd: ActivityComponentData

    @Inject
    lateinit var fcd:FragmentComponentData

    @SuppressLint("LogNotTimber")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("AbhiTestFragment","-------------------Fragment----------------------")
        Log.e("AbhiTestFragment",acd.from)
        Log.e("AbhiTestFragment",atcd.from)
        Log.e("AbhiTestFragment",fcd.from)
        onDestroy()
    }
}