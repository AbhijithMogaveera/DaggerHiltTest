package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromActivityComponent
import com.abhijith.daggerhilttest.module.data.ActivityModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @Provides @ActivityScoped
    fun begin(): ActivityModuleData {
        return ActivityModuleData(
            consumingFromActivityComponent
        )
    }
}