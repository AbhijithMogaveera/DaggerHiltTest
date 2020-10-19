package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromViewComponent
import com.abhijith.daggerhilttest.module.data.ViewModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ViewScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ViewComponent::class)
class ViewModule{
    @Provides
    @ViewScoped
    fun begin() = ViewModuleData(consumingFromViewComponent)
}