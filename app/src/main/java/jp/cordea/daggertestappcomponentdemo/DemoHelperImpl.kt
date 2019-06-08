package jp.cordea.daggertestappcomponentdemo

import android.content.Context
import javax.inject.Inject

class DemoHelperImpl @Inject constructor(
    private val context: Context
) : DemoHelper {
    override fun demo(id: String) {
        throw NotImplementedError()
    }
}
