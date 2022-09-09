pluginManagement {
    repositories {
        gradlePluginPortal()
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
        id("org.jetbrains.kotlin.android") version "1.7.10"
    }

}

rootProject.name = "28_Project"
include(":androidApp",":shared")