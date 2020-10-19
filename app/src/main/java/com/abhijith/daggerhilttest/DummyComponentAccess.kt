package com.abhijith.daggerhilttest

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import com.abhijith.daggerhilttest.module.component.AppComponent
import com.abhijith.daggerhilttest.module.component.DaggerAppComponent
import com.abhijith.daggerhilttest.module.component.DummyComponent
import com.abhijith.daggerhilttest.module.component.DummyData
import javax.inject.Inject

class DummyComponentAccess (private val ctx:Context)
{
    @Inject
    lateinit var dummyComponent: DummyData

    private val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    private fun initializeComponent(): AppComponent {
        return DaggerAppComponent
            .factory()
            .build(ctx.applicationContext)
    }

    fun begin(){
        appComponent
            .dummyComponent()
            .build()
            .inject(this)

        Toast
            .makeText(
                ctx,
                dummyComponent.getMessage(),
                Toast.LENGTH_SHORT
            )
            .show()
    }
}