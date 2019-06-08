package jp.cordea.daggertestappcomponentdemo

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
open class AppModule {
    @Provides
    open fun provideContext(application: Application): Context = application.applicationContext
}
