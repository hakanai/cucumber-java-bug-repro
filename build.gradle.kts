import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
}

group = "garden.ephemeral"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.cucumber:cucumber-java8:${project.property("cucumber.version")}")
    testImplementation("io.cucumber:cucumber-junit:${project.property("cucumber.version")}")
    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.22")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}