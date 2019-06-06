package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class DemoReceiver @Inject constructor() {
    fun receive(): String {
        throw NotImplementedError()
    }
}
