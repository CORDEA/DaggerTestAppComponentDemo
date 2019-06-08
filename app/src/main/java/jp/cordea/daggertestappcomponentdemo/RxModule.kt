package jp.cordea.daggertestappcomponentdemo

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
class RxModule {
    @Provides
    @IoScheduler
    fun provideIoScheduler(): Scheduler = Schedulers.io()

    @Provides
    @MainScheduler
    fun provideMainScheduler(): Scheduler = AndroidSchedulers.mainThread()
}
