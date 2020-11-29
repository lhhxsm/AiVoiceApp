@file:Suppress("DEPRECATION")

package com.kotlin.lib_base.helper

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

/**
 * 通知栏帮助类
 */
object NotificationHelper {

    private lateinit var mContext: Context
    private lateinit var nm: NotificationManager
    private const val CHANNEL_ID = "ai_voice_service"
    private const val CHANNEL_NAME = "语音服务"

    fun initHelper(context: Context) {
        this.mContext = context

        nm = mContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        //创建渠道
        setBindVoiceChannel()

    }

    //设置绑定服务渠道
    private fun setBindVoiceChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {//Android 8.0 需要创建渠道
            //创建渠道对象
            val channel =
                NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH)
            //呼吸灯
            channel.enableLights(false)
            //震动
            channel.enableVibration(false)
            //角标
            channel.setShowBadge(false)
            nm.createNotificationChannel(channel)
        }
    }

    //绑定语音服务
    fun bindVoiceService(msg: String): Notification {
        //创建通知栏对象
        val builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            NotificationCompat.Builder(mContext, CHANNEL_ID)
        else {
            NotificationCompat.Builder(mContext)
        }
        //设置标题
        builder.setContentTitle(CHANNEL_NAME)
        //设置描述
        builder.setContentText(msg)
        //设置时间
        builder.setWhen(System.currentTimeMillis())
        //禁止滑动
        builder.setAutoCancel(false)
        return builder.build()
    }
}