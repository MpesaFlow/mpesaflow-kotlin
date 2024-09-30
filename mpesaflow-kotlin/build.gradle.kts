plugins {
    id("mpesaflow.kotlin")
    id("mpesaflow.publish")
}

dependencies {
    api(project(":mpesaflow-kotlin-client-okhttp"))
}
