package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromActivityRetainedModule
import com.abhijith.daggerhilttest.module.data.ActivityRetainedModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ActivityRetainedComponent::class)
object ActivityRetainedModule {

    @Provides
    @ActivityRetainedScoped
    fun begin():ActivityRetainedModuleData {
        return ActivityRetainedModuleData(
            consumingFromActivityRetainedModule
        )
    }
}