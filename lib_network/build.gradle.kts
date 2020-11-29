//引用插件
plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}
android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        consumerProguardFiles("consumer-rules.pro")
    }

    //编译类型
    buildTypes {
        getByName("debug") {

        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    //依赖操作
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
//依赖
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    //Retrofit
    api(DependenciesConfig.RETROFIT)
    api(DependenciesConfig.RETROFIT_GSON)
}