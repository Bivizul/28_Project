plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
    kotlin("android") apply false
    kotlin("plugin.serialization") apply false
    id("com.android.application") apply false version "7.2.2"
    id("com.android.library") apply false version "7.2.2"
    id("org.jetbrains.compose") apply false
//    id("com.github.arkivanov") apply false
//    id("org.jetbrains.kotlin") apply false

//    id("gradle.plugin.com.onesignal") apply false
    id("com.onesignal.androidsdk.onesignal-gradle-plugin") apply false
//    id("com.arkivanov.gradle.setup")
}

//buildscript {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
//        classpath("gradle.plugin.com.onesignal:onesignal-gradle-plugin:0.14.0")
//        classpath("com.android.tools.build:gradle:$agp")
//    }
//}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//        maven("https://jitpack.io")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}