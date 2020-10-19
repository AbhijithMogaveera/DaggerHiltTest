package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromCustomComponent
import com.abhijith.daggerhilttest.module.data.CustomModuleData
import dagger.Module
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object CustomModule {

    @Singleton
    fun begin(): CustomModuleData = CustomModuleData(consumingFromCustomComponent)
}