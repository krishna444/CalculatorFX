# Simple Calculator Using JAVAFX
This is a simple calculator program using JavaFX. I have developed this using windows 10 and openjdk 11. The Adopt OpenJDK dpes not come with integrated JavaFX, so I have to install it separately.

# JavaFX Installation
The installation of JavaFX is quite straightforward. We need to download it from 

https://gluonhq.com/download/javafx-11-0-2-sdk-windows/

The downloaded compressed file should be extracted and the jar files in lib folder should be included as referenced libraries.

# Issue
**Error: JavaFX runtime components are missing, and are required to run this application**

Since the framework is dependent with the runtime components with the underlying operating system. To solve this issue, we have to add jvm arguments while running the application. 

For a VSCode project, we just need to define launch parameter in file launch.json. This file can be opened with **Run=> Open Configurations**

And then adding the following line

*"vmArgs": "--module-path [PATH_TO_LIB_FOLDER_IN_JAVAFX] --add-modules javafx.controls,javafx.fxml",*

Then we can simply run this code from VSCode will show a calculator window with the buttons.

**Note: the buttons functions are not complete.**

