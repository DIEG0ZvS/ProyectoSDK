plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "edu.pe.udh.proyectosdk"
<<<<<<< HEAD
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
=======
    compileSdk = 34
>>>>>>> 417446008e2ecbe4a44530cf7a397590a8a95901

    defaultConfig {
        applicationId = "edu.pe.udh.proyectosdk"
        minSdk = 29
<<<<<<< HEAD
        targetSdk = 36
=======
        targetSdk = 34
>>>>>>> 417446008e2ecbe4a44530cf7a397590a8a95901
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
<<<<<<< HEAD
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
=======
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
>>>>>>> 417446008e2ecbe4a44530cf7a397590a8a95901
    }
}

dependencies {
<<<<<<< HEAD
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
=======

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
>>>>>>> 417446008e2ecbe4a44530cf7a397590a8a95901
}