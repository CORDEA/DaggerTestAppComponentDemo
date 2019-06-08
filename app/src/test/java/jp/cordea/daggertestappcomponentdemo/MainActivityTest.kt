package jp.cordea.daggertestappcomponentdemo

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import io.reactivex.schedulers.Schedulers
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun test() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        scenario.moveToState(Lifecycle.State.CREATED)

        scenario.onActivity {
            assertThat(it.ioScheduler).isEqualTo(Schedulers.trampoline())
            assertThat(it.mainScheduler).isEqualTo(Schedulers.trampoline())

            assertThat(it.helper).isInstanceOf(TestDemoHelperImpl::class.java)
        }
    }
}
