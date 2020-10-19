package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
//import com.abhijith.daggerhilttest.module.component.CustomModuleTwo
import com.abhijith.daggerhilttest.module.data.ActivityModuleData
import com.abhijith.daggerhilttest.module.data.ActivityRetainedModuleData
import com.abhijith.daggerhilttest.module.data.ApplicationModuleData
import dagger.hilt.EntryPoints
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

    @SuppressLint("LogNotTimber", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val also = Intent(this, ServiceScoped::class.java)

        setContentView(R.layout.activity_main)

        var flag = true
        btn_start_service.setOnClickListener {
            if(flag) {
                startService(also)
                flag = false
                btn_start_service.text = stopService
            }else{
                stopService(also)
                flag = true
                btn_start_service.text = startService
            }
        }
        tv_one.apply {
            text = activity
            gravity = Gravity.CENTER
        }
        tv_two.text = acd.from;
        tv_three.text = strcd.from
        tv_four.text = atcd.from

        supportFragmentManager.beginTransaction().replace(R.id.fl_fragment_container_layout,FragmentScoped()).commit()
        fl_fragment_container_layout

        btn_data_show.showConsumedData()

        DummyComponentAccess(this.applicationContext).begin()
    }
}