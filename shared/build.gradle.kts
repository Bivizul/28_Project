import aaa.bivizul.a28project.buildSrc.*

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("kotlin-parcelize")
    id("kotlinx-serialization")
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
                implementation(compose.preview)
                implementation(JetpackCompose.navigation)
                implementation(Ktor.core)
                implementation(Ktor.logging)
                implementation(Ktor.negotiation)
                implementation(Ktor.json)
                implementation(Ktor.cio)
                implementation(KotlinCoroutines.core)
                implementation(Util.napier)
                implementation(Kotlin.serializationJson)
                implementation(Kotlin.serializationProtobuf)
                implementation(Util.settings)
                implementation(Other.onesignal)

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
                // compose
                implementation(JetpackCompose.material)
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
