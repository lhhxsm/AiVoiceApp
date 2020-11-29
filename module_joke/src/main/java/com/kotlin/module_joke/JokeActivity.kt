package com.kotlin.module_joke

import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.lib_base.base.BaseActivity
import com.kotlin.lib_base.helper.ARouterHelper

/**
 * 笑话
 */
@Route(path = ARouterHelper.PATH_JOKE)
class JokeActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_joke
    }

    override fun getTitleText(): String {
        return getString(com.kotlin.lib_base.R.string.app_title_joke)
    }

    override fun isShowBack(): Boolean {
        return true
    }

    override fun initView() {
    }
}