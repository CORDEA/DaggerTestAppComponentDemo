package jp.cordea.daggertestappcomponentdemo

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider

class TestAppModule : AppModule() {
    override fun provideContext(application: Application): Context = ApplicationProvider.getApplicationContext()
}
