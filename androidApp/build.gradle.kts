import aaa.bivizul.a28project.buildSrc.*

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
    id("kotlin-parcelize")
}

android {
    compileSdk = Versions.compile_sdk_version
    defaultConfig {
        applicationId = "aaa.bivizul.a28project.android"
        minSdk = Versions.min_sdk_version
        targetSdk = Versions.target_sdk_version
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                file("proguard-rules.pro")
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(ComposeUtils.activity)
    implementation(Other.onesignal)
    implementation(compose.foundation)
    implementation(Kotlin.serializationJson)
    implementation(AndroidxSupport.appcompat)
    implementation(MaterialDesign.materialDesign)
}