package com.kotlin.lib_base.base

import android.app.Application
import android.content.Intent
import android.os.Build
import com.kotlin.lib_base.helper.ARouterHelper
import com.kotlin.lib_base.helper.NotificationHelper
import com.kotlin.lib_base.service.InitService

/**
 * 基类App
 */
open class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        //只有主进程才能初始化
//        val processName = CommonUtils.getProcessName(this)
//        if (!TextUtils.isEmpty(processName)) {
//            if (processName == packageName) {
//                initApp()
//            }
//        }

        ARouterHelper.initHelper(this)
        NotificationHelper.initHelper(this)
        startService(Intent(this, InitService::class.java))
    }

    //初始化App
    private fun initApp() {
        ARouterHelper.initHelper(this)
//        NotificationHelper.initHelper(this)
//        MapManager.initMap(this)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(Intent(this, InitService::class.java))
        } else {
            startService(Intent(this, InitService::class.java))
        }
    }
}