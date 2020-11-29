//全局常量
object KotlinConstants {

    //Gradle 版本
    const val gradle_version = "4.1.1"

    //Kotlin 版本
    const val kotlin_version = "1.4.10"
}

//应用配置
object AppConfig {

    //依赖版本
    const val compileSdkVersion = 30

    //编译工具版本
    const val buildToolsVersion = "30.0.2"

    //包名
    const val applicationId = "com.kotlin.aivoiceapp"

    //最小支持SDK
    const val minSdkVersion = 21

    //当前基于SDK
    const val targetSdkVersion = 30

    //版本编码
    const val versionCode = 1

    //版本名称
    const val versionName = "1.0"
}

//依赖配置
object DependenciesConfig {

    //Kotlin基础库
    const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:${KotlinConstants.kotlin_version}"

    //Android标准库
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.2.0"
    const val APP_MATERIAL = "com.google.android.material:material:1.2.1"

    //Kotlin核心库
    const val KTX_CORE = "androidx.core:core-ktx:1.3.2"

    //EventBus
    const val EVENT_BUS = "org.greenrobot:eventbus:3.2.0"

    //ARouter
    const val AROUTER = "com.alibaba:arouter-api:1.5.1"
    const val AROUTER_COMPILER = "com.alibaba:arouter-compiler:1.5.1"

    //RecyclerView
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:1.2.0-alpha01"

    //Permissions
    const val AND_PERMISSIONS = "com.yanzhenjie:permission:2.0.3"

    //Retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.8.1"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:2.8.1"

    //ViewPager
    const val VIEWPAGER = "com.zhy:magic-viewpager:1.0.1"
    const val MATERIAL = "com.google.android.material:material:1.0.0"

    //Lottie
    const val LOTTIE = "com.airbnb.android:lottie:3.4.0"

    //刷新
    const val REFRESH_KERNEL = "com.scwang.smart:refresh-layout-kernel:2.0.1"
    const val REFRESH_HEADER = "com.scwang.smart:refresh-header-classics:2.0.1"
    const val REFRESH_FOOT = "com.scwang.smart:refresh-footer-classics:2.0.1"

    //图表
    const val CHART = "com.github.PhilJay:MPAndroidChart:v3.1.0"
}

//Module配置
object ModuleConfig {

    //Module是否App
    var isApp = false

    //包名
    const val MODULE_APP_MANAGER = "com.kotlin.module_app_manager"
    const val MODULE_CONSTELLATION = "com.kotlin.module_constellation"
    const val MODULE_DEVELOPER = "com.kotlin.module_developer"
    const val MODULE_JOKE = "com.kotlin.module_joke"
    const val MODULE_MAP = "com.kotlin.module_map"
    const val MODULE_SETTING = "com.kotlin.module_setting"
    const val MODULE_VOICE_SETTING = "com.kotlin.module_voice_setting"
    const val MODULE_WEATHER = "com.kotlin.module_weather"
}
