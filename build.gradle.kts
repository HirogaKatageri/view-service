// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("io.insert-koin:koin-gradle-plugin:3.1.2")
    }
}

apply(plugin = "koin")

plugins {
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
