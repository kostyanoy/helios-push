# helios-push

This plugin for gradle allows you to push your files to the helios server by setting up 
parameters only once

## How to use 

This plugin adds a task named "helios" to the gradle

### Call a task via console
 
<pre>
./gradlew helios
</pre>

### Add plugin to your project  
Add these lines to your **build.gradle** file

<pre>
plugins {
  id 'io.github.kostyanoy.helios-push' version '1.0.2'
}

helios() {
    projectName = "projectName"
    isu = "123456"
    folderPath = "~/labs/programming"
    files = new String[]{
        "src",
        "libs",
        "gradlew",
        "gradle",
        "build.gradle"
    };
}
</pre>

Kotlin DSL
<pre>
plugins {
    id("io.github.kostyanoy.helios-push") version "1.0.2"
}

tasks.helios {
    projectName = "projectName"
    isu = "123456"
    folderPath = "~/labs/programming"
    val arr = arrayOf<String>(
        "src",
        "build/libs/lab3-1.0-SNAPSHOT.jar",
        "build.gradle.kts",
        "settings.gradle.kts",
        "gradlew",
        "gradle"
    )
    files = arr
}
</pre>

### Parameters description
**projectName** - the name of your project on helios  
**isu** - your isu in the itmo  
**folderPath** - path to folder on helios to which you want copy your files  
**files** - array of the names of the files and dirs you want to copy  
(everything will be store in the folder with name of the projectName parameter)  
