package com.kotlin.aivoiceapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.kotlin.lib_base.helper.NotificationHelper
import com.kotlin.lib_base.utils.L

/**
 * 语音服务
 */
class VoiceService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }


    override fun onCreate() {
        super.onCreate()
        L.i("语音服务启动")
        initCoreVoiceService()
    }

    private fun initCoreVoiceService() {

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        bindNotification()
        return START_STICKY_COMPATIBILITY
    }

    //绑定通知栏
    private fun bindNotification() {
        startForeground(
            1000,
            NotificationHelper.bindVoiceService(getString(R.string.text_voice_run_text))
        )
    }
}