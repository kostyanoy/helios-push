# helios-push  

This plugin for gradle allows you to push your dirs to the helios server by setting up parameters only once  

How to use this plugin:  

add these lines to your build.gradle file  

plugins {  
  id 'org.itmo.kostyanoy.helios-push' version '1.0.1'  
}  

helios() {  
    projectName = "projectName" #the name of your project on helios  
    isu = "123456" #your isu in the itmo  
    folderPath = "~/labs/programming" #folder to which you want copy your files   
    files = new String[]{  
        "src",  
        "libs",  
        "gradlew",  
        "gradle",  
        "build.gradle"  
    }; #array of the names of the files and dirs you want to copy (everything will be store in the folder with name of the projectName parameter)  
}  