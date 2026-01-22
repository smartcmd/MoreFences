plugins {
    id("java-library")
    id("org.allaymc.gradle.plugin") version "0.2.1"
}

group = "MoreFences.ClexaGod.morefences"
description = "Adds multiple custom fences"
version = "0.1.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

allay {
    api = "0.23.0-SNAPSHOT"
    apiOnly = false

    plugin {
        entrance = "MoreFences.ClexaGod.morefences.MoreFences"
        authors += "ClexaGod"
        website = "https://github.com/ClexaGod/MoreFences"
    }
}
