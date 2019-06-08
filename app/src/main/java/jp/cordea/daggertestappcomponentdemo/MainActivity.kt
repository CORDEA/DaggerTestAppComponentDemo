package jp.cordea.daggertestappcomponentdemo

import android.content.Context
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.Scheduler
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var helper: DemoHelper
    @Inject
    lateinit var context: Context
    @Inject
    @field:IoScheduler
    lateinit var ioScheduler: Scheduler
    @Inject
    @field:MainScheduler
    lateinit var mainScheduler: Scheduler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
