package com.kotlin.module_app_manager

import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.lib_base.base.BaseActivity
import com.kotlin.lib_base.helper.ARouterHelper

/**
 * 应用管理
 */
@Route(path = ARouterHelper.PATH_APP_MANAGER)
class AppManagerActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_app_manager
    }

    override fun getTitleText(): String {
        return getString(com.kotlin.lib_base.R.string.app_title_app_manager)
    }

    override fun isShowBack(): Boolean {
        return true
    }

    override fun initView() {
    }

}