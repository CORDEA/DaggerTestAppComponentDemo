package jp.cordea.daggertestappcomponentdemo

import dagger.Module

@Module(
    includes = [
        MainActivityModule::class
    ]
)
interface ActivityModule
