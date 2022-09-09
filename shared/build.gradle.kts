import aaa.bivizul.a28project.buildSrc.*

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
//    id("com.arkivanov.gradle.setup")
    id("kotlin-parcelize")
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting{
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                // Needed only for preview.
                implementation(compose.preview)
                //Network
                implementation(Ktor.core)
                implementation(Ktor.logging)
                implementation(Ktor.negotiation)
                implementation(Ktor.json)
                implementation(Ktor.cio)
                //Coroutines
                implementation(KotlinCoroutines.core)
                //Logger
                implementation(Util.napier)
                //JSON
                implementation(Kotlin.serializationJson)
                implementation(Kotlin.serializationProtobuf)
                //Key-Value storage
                implementation(Util.settings)
                // DI
//            implementation(Koin.core)
//            implementation(Koin.android)
                // Signal
                implementation(Other.onesignal)
                // Navigation

//                implementation("io.github.alexgladkov:odyssey-core:1.0.0-beta15") // For core classes
//                implementation("io.github.alexgladkov:odyssey-compose:1.0.0-beta15") // For compose extensions

//                api("me.dmdev.premo:premo:1.0.0-alpha.06")
//                api("me.dmdev.premo:premo-navigation:1.0.0-alpha.06")

                implementation(ArkIvanov.Decompose.decompose)
                implementation(ArkIvanov.Decompose.extensionsComposeJetbrains)
                implementation(ArkIvanov.Badoo.reaktive)
                implementation(ArkIvanov.Essenty.lifecycle)
//                implementation(ArkIvanov.Essenty.backHandler)
                implementation(ArkIvanov.Essenty.stateKeeper)
                implementation(ArkIvanov.Essenty.instanceKeeper)
//                implementation(JetbrainsCompose.compose)
//                implementation(JetbrainsCompose.test)

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting{
            dependencies{
                api(AndroidxSupport.appcompat)
                api(AndroidxSupport.core_ktx)
                // Coil
                implementation(Coil.coil)
                implementation(ComposeUtils.coil)
            }
        }
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    compileSdk = Versions.compile_sdk_version
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = Versions.min_sdk_version
        targetSdk = Versions.target_sdk_version
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
dependencies {
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.2.0")
}
