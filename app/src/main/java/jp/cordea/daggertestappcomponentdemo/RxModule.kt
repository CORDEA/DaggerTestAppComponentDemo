package jp.cordea.daggertestappcomponentdemo

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
open class RxModule {
    @Provides
    @IoScheduler
    open fun provideIoScheduler(): Scheduler = Schedulers.io()

    @Provides
    @MainScheduler
    open fun provideMainScheduler(): Scheduler = AndroidSchedulers.mainThread()
}
