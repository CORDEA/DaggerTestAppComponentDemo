package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val receiver: DemoReceiverImpl,
    private val helper: DemoHelperImpl
) {
    private val id by lazy { receiver.receive() }

    fun demo() {
        helper.demo(id)
    }
}
