package jp.cordea.daggertestappcomponentdemo

import dagger.Binds
import dagger.Module

@Module
interface ReceiverModule {
    @Binds
    fun bind(receiverImpl: DemoReceiverImpl): DemoReceiver
}
