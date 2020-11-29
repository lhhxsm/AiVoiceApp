package com.kotlin.aivoiceapp

import android.content.Intent
import com.kotlin.lib_base.base.BaseActivity

class MainActivity : BaseActivity() {

//    private var mList = ArrayList<String>()

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getTitleText(): String {
        return getString(R.string.app_name)
    }

    override fun isShowBack(): Boolean {
        return false
    }

    override fun initView() {
        startService(Intent(this, VoiceService::class.java))
//        ARouterHelper.startActivity(ARouterHelper.PATH_DEVELOPER)

//        SpUtils.putString("key", "Hello Kotlin")
//        val string = SpUtils.getString("key")
//        string?.let {
//            L.e(it)
//        }

//        //模拟数据
//        for (i in 1..30) {
//            mList.add("第${i}个")
//        }
//
//
//        mRecyclerView.layoutManager = LinearLayoutManager(this)
//        mRecyclerView.adapter =
//            CommonAdapter<String>(mList, object : CommonAdapter.OnBindDataListener<String> {
//                override fun onBindViewHolder(
//                    model: String,
//                    viewHolder: CommonViewHolder,
//                    type: Int,
//                    position: Int
//                ) {
//                    viewHolder.setText(R.id.textView, model)
//                }
//
//                override fun getLayoutId(type: Int): Int {
//                    return R.layout.text_item
//                }
//
//            })
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        EventManager.register(this)
//
//        btn1.setOnClickListener {
////            EventManager.post(1111)
//            ARouterHelper.startActivity(ARouterHelper.PATH_APP_MANAGER)
//        }
//        btn2.setOnClickListener {
////            EventManager.post(2222, "Hello EventBus")
//            ARouterHelper.startActivity(ARouterHelper.PATH_MAP)
//        }
//    }

//    override fun onDestroy() {
//        super.onDestroy()
//        EventManager.unregister(this)
//    }
//
//    @Subscribe(threadMode = ThreadMode.MAIN)
//    fun onMessageEvent(event: MessageEvent) {
//        when (event.type) {
//            1111 -> Toast.makeText(this, "1111", Toast.LENGTH_SHORT).show()
//            2222 -> Toast.makeText(this, "2222" + event.stringValue, Toast.LENGTH_SHORT).show()
//        }
//    }
}