package com.kotlin.module_constellation

import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.lib_base.base.BaseActivity
import com.kotlin.lib_base.helper.ARouterHelper

/**
 * 星座
 */
@Route(path = ARouterHelper.PATH_CONSTELLATION)
class ConstellationActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_constellation
    }

    override fun getTitleText(): String {
        return getString(com.kotlin.lib_base.R.string.app_title_constellation)
    }

    override fun isShowBack(): Boolean {
        return true
    }

    override fun initView() {

    }
}