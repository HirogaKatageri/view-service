object Constants {

    const val MIN_SDK_VERSION = 23
    const val COMPILE_SDK_VERSION = 31
    const val TARGET_SDK_VERSION = 31
    const val VERSION_CODE = 1

    const val VERSION_NAME = "0.2.0"

    //Kotlin
    const val KOTLIN_VERSION = "1.5.31"
    const val COROUTINES_VERSION = "1.5.1"

    //Android
    const val LIFECYCLE_VERSION = "2.4.0"
    const val ARCHITECTURE_VERSION = "2.1.0"

    //Core
    const val KOIN_VERSION = "3.1.2"

    //Testing
    const val ANDROIDX_TEST_VERSION = "1.4.0"
    const val ESPRESSO_VERSION = "3.3.0"
    const val ROBOLECTRIC_VERSION = "4.6.1"

    //Full Paths
    //Kotlin
    const val KOTLIN_JDK_8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$KOTLIN_VERSION"

    const val COROUTINES_BOM = "org.jetbrains.kotlinx:kotlinx-coroutines-bom:$COROUTINES_VERSION"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test"

    //Android Lifecycle
    const val ANDROID_LIFECYCLE_COMMON =
        "androidx.lifecycle:lifecycle-common-java8:$LIFECYCLE_VERSION"
    const val ANDROID_LIFECYCLE_SERVICE = "androidx.lifecycle:lifecycle-service:$LIFECYCLE_VERSION"

    //Android Lifecycle Test Helpers
    const val ANDROID_LIFECYCLE_TEST = "androidx.arch.core:core-testing:$ARCHITECTURE_VERSION"

    //DI
    const val KOIN_TEST = "io.insert-koin:koin-test:$KOIN_VERSION"
    const val KOIN_TEST_JUNIT4 = "io.insert-koin:koin-test-junit4:$KOIN_VERSION" // Tests
    const val KOIN_ANDROID = "io.insert-koin:koin-android:$KOIN_VERSION"
    const val KOIN_ANDROID_EXT = "io.insert-koin:koin-android-ext:$KOIN_VERSION"
    const val KOIN_ANDROID_WORKMANAGER = "io.insert-koin:koin-androidx-workmanager:$KOIN_VERSION"

    //Test
    const val JUNIT = "junit:junit:4.13.2" // Unit Test available
    const val ANDROIDX_TEST = "androidx.test:core:$ANDROIDX_TEST_VERSION"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:$ANDROIDX_TEST_VERSION"
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:$ANDROIDX_TEST_VERSION"
    const val ANDROIDX_TEST_FRAGMENT = "androidx.fragment:fragment-testing:1.3.6"
    const val ANDROIDX_TEST_JUNIT = "androidx.test.ext:junit:1.1.3"

    const val ROBOLECTRIC =
        "org.robolectric:robolectric:$ROBOLECTRIC_VERSION" // Unit Test available
}