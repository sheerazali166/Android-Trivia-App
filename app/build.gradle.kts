import kotlin.script.experimental.jvm.util.classpathFromClass


plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    //id("androidx.navigation.safeargs")
    //id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.triviaapp"
    compileSdk = 34

    defaultConfig {
        //multiDexEnabled true
        applicationId = "com.example.triviaapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

         //multiDexEnabled = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    dataBinding {
        enable = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

//    implementation(libs.androidx.navigation.safe.args.gradle.plugin)
//    implementation(libs.navigation.fragment.ktx)
//    implementation(libs.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
//
//    implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
//    implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")

    //implementation("com.android.support:multidex:2.0.1")

    val nav_version = "2.7.7"

    //implementation("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")

    // Jetpack Compose integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    // Views/Fragments integration
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Feature module support for Fragments
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    // Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")

    //classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")

    //classpathFromClass("")

    //implementation(files("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"))

    implementation("androidx.compose.material:material:1.6.8")



}

