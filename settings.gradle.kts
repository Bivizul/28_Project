pluginManagement {
    repositories {
        gradlePluginPortal()
//        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//        google()
//        mavenCentral()
        maven("https://jitpack.io")
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.toString() == "com.arkivanov.gradle.setup") {
                useModule("com.github.arkivanov:gradle-setup-plugin:f5e40dcc04")
            }
        }
    }

    plugins {
        id("com.arkivanov.gradle.setup")
    }

//    plugins {
//        kotlin("jvm").version(extra["kotlin.version"] as String)
//        kotlin("multiplatform").version(extra["kotlin.version"] as String)
//        kotlin("android").version(extra["kotlin.version"] as String)
//        kotlin("plugin.serialization").version(extra["kotlin.version"] as String)
//        id("com.android.application").version(extra["agp.version"] as String)
//        id("com.android.library").version(extra["agp.version"] as String)
////        id("org.jetbrains.compose").version(extra["compose.version"] as String)
////        id("com.github.arkivanov").version(extra["setup.version"] as String)
////        id("org.jetbrains.kotlin").version(extra["kotlin.version"] as String)
//
////        id("gradle.plugin.com.onesignal").version(extra["onesignal.version"] as String)
//        id("com.onesignal.androidsdk.onesignal-gradle-plugin").version(extra["onesignal.version"] as String)
////        id("com.arkivanov.gradle.setup")
//    }
}

rootProject.name = "28_Project"
include(":androidApp",":shared")