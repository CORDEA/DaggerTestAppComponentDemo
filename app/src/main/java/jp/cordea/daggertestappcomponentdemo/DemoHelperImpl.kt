package jp.cordea.daggertestappcomponentdemo

import javax.inject.Inject

class DemoHelperImpl @Inject constructor() : DemoHelper {
    override fun demo(id: String) {
        throw NotImplementedError()
    }
}
