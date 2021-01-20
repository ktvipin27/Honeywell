/**
 * Created by Vipin KT on 20/01/21
 */
object Plugins {
    const val ANDROID_APPLICATION = "com.android.application"

    object Kotlin {
        const val KOTLIN_ANDROID = "android"
        const val KOTLIN_ANDROID_EXTENSION = "android.extensions"
        const val KOTLIN_KAPT = "kapt"
    }

    object Gradle {
        const val GRADLE_ANDROID = "com.android.tools.build:gradle:4.1.1"
        const val GRADLE_KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10"
    }
}

object Libs {
    const val MATERIAL_DESIGN = "com.google.android.material:material:1.1.0"
    const val GSON = "com.google.code.gson:gson:2.8.5"
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
    const val JAVAX_ANNOTATION = "javax.annotation:jsr250-api:1.0"

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.1.0"
        const val ANDROIDX_CORE = "androidx.core:core-ktx:1.3.1"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.1"
        const val PAGING_RUNTIME = "androidx.paging:paging-runtime-ktx:2.1.2"

        object Lifecycle {
            private const val version = "2.2.0"
            const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime:$version"
            const val LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:$version"
            const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$version"
            const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:$version"
            const val LIFECYCLE_SERVICE = "androidx.lifecycle:lifecycle-service:$version"
            const val LIFECYCLE_PROCESS = "androidx.lifecycle:lifecycle-process:$version"
        }
    }

    object Kotlin {
        private const val version = "1.4.10"
        const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }

    object Coroutines {
        private const val version = "1.3.5"
        const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object Okhttp {
        private const val version = "4.4.0"
        const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$version"
        const val OKHTTP_URL_CONNECTION = "com.squareup.okhttp3:okhttp-urlconnection:$version"
    }

    object Retrofit {
        private const val version = "2.6.0"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:$version"
        const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:$version"
    }

    object Glide {
        private const val version = "4.11.0"
        const val GLIDE = "com.github.bumptech.glide:glide:$version"
        const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:$version"
        const val GLIDE_OKHTTP3 = "com.github.bumptech.glide:okhttp3-integration:$version"
    }

    object Dagger {
        private const val version = "2.26"
        private const val version_assisted = "0.5.2"
        const val DAGGER = "com.google.dagger:dagger:$version"
        const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$version"
        const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:$version"
        const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$version"
        const val DAGGER_PROCESSOR = "com.google.dagger:dagger-android-processor:$version"
        const val DAGGER2_PROCESSOR =
            "com.squareup.inject:assisted-inject-processor-dagger2:$version_assisted"
        const val DAGGER2_ANNOTATIONS =
            "com.squareup.inject:assisted-inject-annotations-dagger2:$version_assisted"
    }
}