// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra.apply {
        set("arch_lifecycle_version", "2.7.0")
        set("room_version", "2.6.1")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.android.library") version "8.2.2" apply false
}