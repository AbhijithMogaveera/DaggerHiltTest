package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromServiceComponent
import com.abhijith.daggerhilttest.module.data.ServiceModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.scopes.ServiceScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {

    @Provides
    @ServiceScoped
    fun begin():ServiceModuleData= ServiceModuleData(consumingFromServiceComponent)
}