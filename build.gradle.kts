// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}


/*
plugins {
    id 'com.android.application' version '8.0.0-alpha09' apply false
    id 'com.android.library' version '8.0.0-alpha09' apply false
    id 'org.jetbrains.kotlin.android' version '1.7.21' apply false
}
*/

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt) apply false
}


/*
plugins {
    alias(androidx.plugins.application) apply false
    alias(androidx.plugins.library) apply false
    alias(kotlinx.plugins.android) apply false
    alias(kotlinx.plugins.kotlin.jvm) apply false
}
*/


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
