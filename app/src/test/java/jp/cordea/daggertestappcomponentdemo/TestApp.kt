package jp.cordea.daggertestappcomponentdemo

class TestApp : App() {
    override fun setupDagger() {
        DaggerTestAppComponent
            .factory()
            .create(this, TestRxModule())
            .inject(this)
    }
}
