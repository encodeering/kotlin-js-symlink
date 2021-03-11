import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack

plugins {
    kotlin ("js")
}

val webpack: KotlinWebpack.() -> Unit = {
    outputFileName = "${rootProject.name}-${project.name}.js"
}

kotlin {
    js {
        browser {
            webpackTask (webpack)
            runTask (webpack)
        }
    }
}

repositories {
    maven ("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral ()
    jcenter ()
}

dependencies {
    implementation (kotlin ("stdlib-js"))
}
