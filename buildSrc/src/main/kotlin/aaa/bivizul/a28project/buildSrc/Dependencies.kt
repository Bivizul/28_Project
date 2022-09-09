package aaa.bivizul.a28project.buildSrc

object Versions {

    const val compile_sdk_version = 33
    const val min_sdk_version = 24
    const val target_sdk_version = compile_sdk_version

    const val constraint_layout_version = "1.1.3"
    const val coroutines_version = "1.6.4"
    const val kotlin_version = "1.7.0"
    const val agp_version = "7.2.2"
    const val desugar_version = "1.1.5"
    const val compose_multiplatform = "1.1.0"
    const val compose_version = "1.2.1"
    const val compose_compile_version = "1.3.0"
    const val compose_navigation = "2.5.1"
    const val compose_jetbrains = "1.2.0-alpha01-dev753"
    const val jetbrains_kotlin_wrappers = "0.0.1-pre.325-kotlin-1.6.10"
    const val jetbrains_binary_compatibility_validator = "0.10.0"
    const val bundlizer = "0.7.0"
//    const val decompose = "1.0.0-alpha-04"
    const val coil_version = "2.2.0"
    const val activity_compose_version = "1.5.1"
    const val accompanist_version = "0.26.2-beta"
    const val levbrow_version = "1.4.0"
    const val appcompat = "1.5.0"
    const val core_ktx_version = "1.8.0"
    const val material_design_version = "1.2.0"
    const val onesignal_version = "4.8.2"
    const val ktor_version = "2.1.0"
    const val napier_version = "2.6.1"
    const val settings_version = "0.9"
    const val koin_version= "3.2.0"
    const val serialization_version = "1.4.0"
}

object androidConfigVersion {
    const val compose_compile = Versions.compose_compile_version
}

object AndroidxSupport {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    const val contraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
    const val desugar = "com.android.tools:desugar_jdk_libs:${Versions.desugar_version}"
}

object JetpackCompose {
//    const val ui = "androidx.compose.ui:ui:${Versions.compose_version}"
//    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
//    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose_version}"
//    const val material = "androidx.compose.material:material:${Versions.compose_version}"
}

object JetbrainsCompose {
//    const val compose = "org.jetbrains.compose:compose-gradle-plugin:${Versions.compose_jetbrains}"
//    const val test = "org.jetbrains.compose.ui:ui-test-junit4:${Versions.compose_jetbrains}"
//    const val wrappers = "org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:${Versions.jetbrains_kotlin_wrappers}"
}

object ComposeUtils {
    const val coil = "io.coil-kt:coil-compose:${Versions.coil_version}"
    const val activity = "androidx.activity:activity-compose:${Versions.activity_compose_version}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.compose_navigation}"
}

object accompanist {
    const val webview = "com.google.accompanist:accompanist-webview:${Versions.accompanist_version}"
}

object materialDesign {
    const val materialDesign = "com.google.android.material:material:${Versions.material_design_version}"
}

object Other{
    const val onesignal = "com.onesignal:OneSignal:${Versions.onesignal_version}"
}

object Ktor {
    const val core = "io.ktor:ktor-client-core:${Versions.ktor_version}"
    const val logging = "io.ktor:ktor-client-logging:${Versions.ktor_version}"
    const val cio = "io.ktor:ktor-client-cio:${Versions.ktor_version}"
    const val negotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor_version}"
    const val json = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor_version}"
}

object Kotlin {
//    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    const val wrappers = "org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:${Versions.jetbrains_kotlin_wrappers}"
    const val validator = "org.jetbrains.kotlinx:binary-compatibility-validator:${Versions.jetbrains_binary_compatibility_validator}"
    const val serializationJson =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization_version}"
    const val serializationProtobuf =
        "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:${Versions.serialization_version}"
}

object KotlinCoroutines {
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_version}"
}

object Util {
    const val napier = "io.github.aakira:napier:${Versions.napier_version}"
    const val settings = "com.russhwolf:multiplatform-settings:${Versions.settings_version}"
    const val bundlizer = "dev.ahmedmourad.bundlizer:bundlizer-core:0.7.0:${Versions.bundlizer}"
}

object Koin{
    const val core = "io.insert-koin:koin-core:${Versions.koin_version}"
    const val android = "io.insert-koin:koin-android:${Versions.koin_version}"
    const val compat = "io.insert-koin:koin-android-compat:${Versions.koin_version}"
    const val navigation = "io.insert-koin:koin-androidx-navigation:${Versions.koin_version}"
    const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin_version}"
    const val ktor = "io.insert-koin:koin-ktor:${Versions.koin_version}"
}

object Coil {
    const val coil = "io.coil-kt:coil:${Versions.coil_version}"
}


//object Navigation{
//    const val decompose = "com.arkivanov.decompose:decompose:${Versions.decompose}"
//}

object ArkIvanov {
    object MVIKotlin {
        private const val VERSION = "3.0.0-beta01"
        const val rx = "com.arkivanov.mvikotlin:rx:$VERSION"
        const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:$VERSION"
        const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:$VERSION"
        const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:$VERSION"
        const val mvikotlinTimeTravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:$VERSION"
        const val mvikotlinExtensionsReaktive = "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:$VERSION"
    }

    object Decompose {
//        private const val VERSION = "0.5.1"
//        private const val VERSION = "1.0.0-alpha-04-native-compose"
        private const val VERSION = "1.0.0-alpha-04"
        const val decompose = "com.arkivanov.decompose:decompose:$VERSION"
        const val extensionsComposeJetbrains = "com.arkivanov.decompose:extensions-compose-jetbrains:$VERSION"
    }

    object Essenty {
        private const val VERSION = "0.5.2"
        const val lifecycle = "com.arkivanov.essenty:lifecycle:$VERSION"
        const val stateKeeper = "com.arkivanov.essenty:state-keeper:$VERSION"
        const val instanceKeeper = "com.arkivanov.essenty:instance-keeper:$VERSION"
        const val backHandler = "com.arkivanov.essenty:back-handler:$VERSION"
    }

    object Badoo{
        private const val VERSION = "1.2.1"
        const val reaktive = "com.badoo.reaktive:reaktive:$VERSION"
    }
}