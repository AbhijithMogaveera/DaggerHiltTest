package com.abhijith.daggerhilttest

import android.content.Context
import com.abhijith.daggerhilttest.module.CustomModule
import com.abhijith.daggerhilttest.module.data.CustomModuleData
import dagger.hilt.EntryPoints

class CustomEntryPoint(context: Context){
    var CustomModuleData = EntryPoints.get(context.applicationContext, CustomModule::class.java).begin()
}