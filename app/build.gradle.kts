import java.io.FileInputStream
import java.util.Properties

val localPropertiesFile = rootProject.file("local.properties")
val localProperties = Properties()
localProperties.load(FileInputStream(localPropertiesFile))

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
    id("kotlin-kapt")
    alias(libs.plugins.dagger.hilt)
    alias(libs.plugins.google.services)
    id("com.google.firebase.crashlytics")
}

android {
    namespace = "dev.cancio.marvel_characters"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.cancio.marvel_characters"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String","MARVEL_BASE_URL", "")
            buildConfigField("String","MARVEL_API_KEY", "")
            buildConfigField("String","MARVEL_PRIVATE_KEY", "")
        }
        debug {
            buildConfigField("String","MARVEL_BASE_URL", localProperties["MARVEL_BASE_URL"].toString())
            buildConfigField("String","MARVEL_API_KEY", localProperties["MARVEL_API_KEY"].toString())
            buildConfigField("String","MARVEL_PRIVATE_KEY", localProperties["MARVEL_PRIVATE_KEY"].toString())
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    //coil
    implementation(libs.coil)
    implementation(libs.coil.compose)

    //Crashlytics
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.crashlytics.ktx)
    implementation(libs.firebase.analytics.ktx)

    //Paging
    implementation(libs.paging.runtime)
    implementation(libs.paging.common)
    implementation(libs.paging.rxjava2)
    implementation(libs.paging.rxjava3)
    implementation(libs.paging.guava)
    implementation(libs.paging.compose)
    implementation(libs.paging.test)

    //Dagger Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    //Retrofit and OkHttp
    implementation(libs.retrofit.retrofit)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp3)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    //test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    testImplementation(libs.kotlinx.coroutines.test)
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.androidx.paging.common.ktx)
    testImplementation(libs.androidx.core.testing)
}