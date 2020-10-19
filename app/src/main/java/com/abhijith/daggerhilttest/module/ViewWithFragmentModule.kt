package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromViewWithFragmentComponent
import com.abhijith.daggerhilttest.module.data.ViewWithFragmentModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewWithFragmentComponent
import dagger.hilt.android.scopes.ViewScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ViewWithFragmentComponent::class)
object ViewWithFragmentModule {

    @Provides
    @ViewScoped
    fun begin(): ViewWithFragmentModuleData = ViewWithFragmentModuleData(
        consumingFromViewWithFragmentComponent
    )

}


