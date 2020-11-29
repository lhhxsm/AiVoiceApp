package com.kotlin.lib_base.utils

import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences

object SpUtils {

    private const val SP_NAME = "config"

    //对象
    private lateinit var sp: SharedPreferences
    private lateinit var spEditor: SharedPreferences.Editor

    fun initUtils(context: Context) {
        sp = context.getSharedPreferences(SP_NAME, ContextWrapper.MODE_PRIVATE)
        spEditor = sp.edit()
        spEditor.apply()
    }

    fun putString(key: String, value: String) {
        spEditor.putString(key, value)
        spEditor.commit()
    }

    fun getString(key: String): String? {
        return sp.getString(key, "")
    }

    fun putInt(key: String, value: Int) {
        spEditor.putInt(key, value)
        spEditor.commit()
    }

    fun getInt(key: String, defValue: Int): Int? {
        return sp.getInt(key, defValue)
    }
}