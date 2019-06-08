package jp.cordea.daggertestappcomponentdemo

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class TestRxModule : RxModule() {
    override fun provideMainScheduler(): Scheduler = Schedulers.trampoline()
}
