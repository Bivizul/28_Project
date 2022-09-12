package aaa.bivizul.a28project.buildSrc

object Versions {

    const val compile_sdk_version = 33
    const val min_sdk_version = 24
    const val target_sdk_version = compile_sdk_version
    const val coroutines_version = "1.6.4"
    const val agp_version = "7.2.2"
    const val compose_multiplatform = "1.1.0"
    const val compose_version = "1.2.1"
    const val nav_compose = "2.4.1"
    const val compose_navigation = "2.5.2"
    const val jetbrains_binary_compatibility_validator = "0.10.0"
    const val coil_version = "2.2.0"
    const val activity_compose_version = "1.5.1"
    const val appcompat = "1.5.1"
    const val core_ktx_version = "1.8.0"
    const val material_design_version = "1.6.1"
    const val onesignal_version = "4.8.2"
    const val ktor_version = "2.1.0"
    const val napier_version = "2.6.1"
    const val settings_version = "0.9"
    const val serialization_version = "1.4.0"
}

object AndroidxSupport {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
}

object JetpackCompose {
    const val foundation = "androidx.compose.foundation:foundation:${Versions.compose_version}"
    const val material = "androidx.compose.material:material:${Versions.compose_version}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.nav_compose}"
}

object ComposeUtils {
    const val coil = "io.coil-kt:coil-compose:${Versions.coil_version}"
    const val activity = "androidx.activity:activity-compose:${Versions.activity_compose_version}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.compose_navigation}"
}

object MaterialDesign {
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
}

object Coil {
    const val coil = "io.coil-kt:coil:${Versions.coil_version}"
}
