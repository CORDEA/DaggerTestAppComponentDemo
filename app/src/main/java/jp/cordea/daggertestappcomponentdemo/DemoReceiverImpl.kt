package jp.cordea.daggertestappcomponentdemo

import io.reactivex.Scheduler
import javax.inject.Inject

class DemoReceiverImpl @Inject constructor(
    @IoScheduler private val ioScheduler: Scheduler,
    @MainScheduler private val mainScheduler: Scheduler
) : DemoReceiver {
    override fun receive(): String {
        throw NotImplementedError()
    }
}
