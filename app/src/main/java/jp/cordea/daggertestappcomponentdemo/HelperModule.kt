package jp.cordea.daggertestappcomponentdemo

import dagger.Binds
import dagger.Module

@Module
interface HelperModule {
    @Binds
    fun bind(helperImpl: DemoHelperImpl): DemoHelper
}
