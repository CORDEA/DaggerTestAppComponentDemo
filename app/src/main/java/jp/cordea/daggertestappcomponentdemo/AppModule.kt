package jp.cordea.daggertestappcomponentdemo

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideContext(application: Application) = application.applicationContext
}
