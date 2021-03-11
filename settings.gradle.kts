rootProject.name = "kotlin-js-symlink"

include  ("module:ui")
project (":module:ui").projectDir = file ("module/ui")

pluginManagement {
    repositories {
        mavenLocal ()
        gradlePluginPortal ()
    }

    plugins {
        kotlin ("js") version "1.4.20"
    }
}
