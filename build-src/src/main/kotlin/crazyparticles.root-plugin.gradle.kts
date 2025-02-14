import task.ReleaseWebhook
import task.WebhookExtension

plugins {
    `java-library`

    `maven-publish`

    id("com.github.hierynomus.license")

    id("com.github.johnrengelman.shadow")
}

repositories {
    maven("https://repo.triumphteam.dev/snapshots/")

    maven("https://repo.crazycrew.us/libraries/")

    maven("https://repo.crazycrew.us/plugins/")

    maven("https://libraries.minecraft.net/")

    maven("https://jitpack.io/")

    mavenCentral()
    mavenLocal()
}

tasks {
    // Creating the extension to be available on the root gradle
    val webhookExtension = extensions.create("webhook", WebhookExtension::class)

    // Register the task
    register<ReleaseWebhook>("webhook") {
        extension = webhookExtension
    }
}

license {
    header = rootProject.file("LICENSE")
    encoding = "UTF-8"

    mapping("java", "JAVADOC_STYLE")

    include("**/*.java")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of("17"))
}

tasks {
    compileJava {
        options.release.set(17)
    }
}