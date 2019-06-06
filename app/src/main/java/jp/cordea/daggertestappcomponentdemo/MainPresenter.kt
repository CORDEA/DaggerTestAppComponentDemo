package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val receiver: DemoReceiver,
    private val helper: DemoHelper
) {
    private val id by lazy { receiver.receive() }

    fun demo() {
        helper.demo(id)
    }
}
