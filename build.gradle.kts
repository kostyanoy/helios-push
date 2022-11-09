plugins {
    id("java")
    id("java-gradle-plugin")
    id("maven-publish")
    id("com.gradle.plugin-publish") version "1.0.0-rc-1"
}

group = "io.github.kostyanoy"
version = "1.0.2"

//publishing.repositories.maven("$buildDir/repo")
publishing {
    publications {
        create<MavenPublication>("helios") {
            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
}

pluginBundle {
    website = "https://github.com/kostyanoy/helios-push"
    vcsUrl = "https://github.com/kostyanoy/helios-push.git"
    tags = listOf("helios", "publish", "itmo")
}

gradlePlugin {
    plugins {
        create("helios-push") {
            id = "io.github.kostyanoy.helios-push"
            displayName = "Helios Push Plugin"
            description = "This plugin allows you to push your files to the helios server by setting up parameters only once"
            implementationClass = "org.itmo.plugin.Helios"
        }
    }
}