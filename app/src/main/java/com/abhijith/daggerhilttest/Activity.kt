package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abhijith.daggerhilttest.di.sampleclass.ActivityComponentData
import com.abhijith.daggerhilttest.di.sampleclass.ActivityRetainedComponentData
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationComponentData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class Activity : AppCompatActivity() {

    @Inject
    lateinit var acd:ApplicationComponentData

    @Inject
    lateinit var atcd:ActivityComponentData

    @Inject
    lateinit var strcd:ActivityRetainedComponentData

    @SuppressLint("LogNotTimber")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.e("AbhiMainActivity","-------------------Activity----------------------")
        Log.e("AbhiMainActivity",acd.from)
        Log.e("AbhiMainActivity",atcd.from)
        Log.e("AbhiMainActivity",strcd.from)
        btn_start_service.setOnClickListener {
            Intent(this, Service::class.java).also {
                startService(it)
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.fl_fragment_container_layout,Fragment()).commit()
        fl_fragment_container_layout

        Btn(this)
    }
}