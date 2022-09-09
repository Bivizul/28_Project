import aaa.bivizul.a28project.buildSrc.*

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
    id("kotlin-parcelize")
//    id("com.arkivanov.gradle.setup")
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
    //JSON
    implementation(Kotlin.serializationJson)
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation(Util.bundlizer)
//    implementation("com.chrynan.parcelable:parcelable-core:0.4.2 (7)")
    // Navigation

//    implementation("io.github.alexgladkov:odyssey-core:1.0.0-beta15") // For core classes
//    implementation("io.github.alexgladkov:odyssey-compose:1.0.0-beta15") // For compose extensions
//    implementation("com.google.android.material:material:1.4.0")
//    implementation("androidx.appcompat:appcompat:1.3.1")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
}