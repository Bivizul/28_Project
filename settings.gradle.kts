pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
    }


    plugins {
        id("org.jetbrains.kotlin.android") version "1.7.10"
    }

}

rootProject.name = "28_Project"
include(":androidApp",":shared")