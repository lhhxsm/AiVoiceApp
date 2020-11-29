package com.kotlin.lib_base.utils

import android.util.Log
import com.kotlin.lib_base.BuildConfig

/**
 * Log 日志
 */
object L {
    private const val TAG: String = "AiVoiceAPP"

    fun i(text: String?) {
        if (BuildConfig.DEBUG) {
            text?.let {
                Log.i(TAG, it)
            }
        }
    }

    fun e(text: String?) {
        if (BuildConfig.DEBUG) {
            text?.let {
                Log.e(TAG, it)
            }
        }
    }
}