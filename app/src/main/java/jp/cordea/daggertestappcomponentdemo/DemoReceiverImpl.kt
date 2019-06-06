package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class DemoReceiverImpl @Inject constructor() : DemoReceiver {
    override fun receive(): String {
        throw NotImplementedError()
    }
}
