package com.kotlin.module_weather

import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.lib_base.base.BaseActivity
import com.kotlin.lib_base.helper.ARouterHelper

/**
 * 天气
 */
@Route(path = ARouterHelper.PATH_WEATHER)
class WeatherActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_weather
    }

    override fun getTitleText(): String {
        return getString(com.kotlin.lib_base.R.string.app_title_weather)
    }

    override fun isShowBack(): Boolean {
        return true
    }

    override fun initView() {
    }
}