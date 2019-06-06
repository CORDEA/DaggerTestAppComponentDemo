package jp.cordea.daggertestappcomponentdemo

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {
    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}
