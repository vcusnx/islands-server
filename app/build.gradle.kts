plugins {
    id("islands.messenger.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
}

application {
    // Define the main class for the application.
    mainClass.set("islands.messenger.app.AppKt")
}
