@file:Suppress("DEPRECATION")

package com.kotlin.lib_base.service

import android.app.IntentService
import android.content.Intent
import com.kotlin.lib_base.helper.NotificationHelper
import com.kotlin.lib_base.utils.L
import com.kotlin.lib_base.utils.SpUtils

/**
 * 初始化服务  IntentService -- 初始化\短任务
 */
class InitService : IntentService(InitService::class.simpleName) {

    override fun onCreate() {
        super.onCreate()
        L.i("初始化开始")

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            startForeground(999, NotificationHelper.bindInitService("正在运行"))
//        }
    }

    override fun onHandleIntent(intent: Intent?) {
        L.i("执行初始化操作")

        SpUtils.initUtils(this)
        NotificationHelper.initHelper(this)
//        WordsTools.initTools(this)
//        SoundPoolHelper.init(this)
//
//        AppHelper.initHelper(this)
//        CommonSettingHelper.initHelper(this)
//        ConsTellHelper.initHelper(this)
//        AssetsUtils.initUtils(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        L.i("初始化完成")
    }

}