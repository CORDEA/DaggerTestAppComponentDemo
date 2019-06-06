package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class DemoHelper @Inject constructor() {
    fun demo(id: String) {
        throw NotImplementedError()
    }
}
