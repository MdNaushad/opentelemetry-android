plugins {
    id("otel.android-app-conventions")
    id("net.bytebuddy.byte-buddy-gradle-plugin")
}

dependencies {
    byteBuddy(project(":instrumentation:okhttp3:agent"))
    implementation(project(":instrumentation:okhttp3:library"))
    implementation(libs.okhttp)
    implementation(libs.opentelemetry.exporter.otlp)
    androidTestImplementation(libs.okhttp.mockwebserver)
    implementation(project(":test-common"))
}
