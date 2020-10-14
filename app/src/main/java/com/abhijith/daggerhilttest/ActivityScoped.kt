package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abhijith.daggerhilttest.di.sampleclass.ActivityModuleData
import com.abhijith.daggerhilttest.di.sampleclass.ActivityRetainedModuleData
import com.abhijith.daggerhilttest.di.sampleclass.ApplicationModuleData
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class ActivityScoped : AppCompatActivity() {

    @Inject
    lateinit var acd:ApplicationModuleData

    @Inject
    lateinit var atcd:ActivityModuleData

    @Inject
    lateinit var strcd:ActivityRetainedModuleData

    @SuppressLint("LogNotTimber")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.e("AbhiMainActivity","-------------------Activity----------------------")
        Log.e("AbhiMainActivity",acd.from)
        Log.e("AbhiMainActivity",atcd.from)
        Log.e("AbhiMainActivity",strcd.from)
        btn_start_service.setOnClickListener {
            Intent(this, ServiceScoped::class.java).also {
                startService(it)
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.fl_fragment_container_layout,FragmentScoped()).commit()
        fl_fragment_container_layout

        ViewScoped(this).hello()
    }
}