package jp.cordea.daggertestappcomponentdemo

import dagger.Binds
import dagger.Module

@Module
interface TestHelperModule {
    @Binds
    fun bind(helperImpl: TestDemoHelperImpl): DemoHelper
}
