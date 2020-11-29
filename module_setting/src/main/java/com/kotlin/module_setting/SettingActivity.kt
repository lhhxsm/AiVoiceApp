package com.kotlin.module_setting

import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.lib_base.base.BaseActivity
import com.kotlin.lib_base.helper.ARouterHelper

/**
 * 系统设置
 */
@Route(path = ARouterHelper.PATH_SETTING)
class SettingActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun getTitleText(): String {
        return getString(com.kotlin.lib_base.R.string.app_title_system_setting)
    }

    override fun isShowBack(): Boolean {
        return true
    }

    override fun initView() {
    }
}