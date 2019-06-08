package jp.cordea.daggertestappcomponentdemo

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        RxModule::class,
        ActivityModule::class,
        TestHelperModule::class
    ]
)
interface TestAppComponent : AppComponent {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            appModule: AppModule,
            rxModule: RxModule
        ): TestAppComponent
    }
}
