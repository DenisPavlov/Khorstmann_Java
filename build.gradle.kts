plugins {
    java
}

repositories {
    jcenter()
    maven {
        url = uri("http://repo.opennms.org/maven2")
    }
}

dependencies {
    implementation("javax.jnlp:jnlp:1.5.0")
}

compileJava {

}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}



//compileJava {
//    options.fork = true
//    options.forkOptions.executable = 'javac'
//    options.compilerArgs << "-XDignore.symbol.file"
//}
//
//sourceCompatibility = 1.8