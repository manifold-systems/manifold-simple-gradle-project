## Manifold : Simple Gradle Project

Demonstrates how to setup Manifold in a project using Gradle.

You can clone the project using:
* the command line or
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
  
### Cloning the project using the **command line**
You can clone this project using the `git clone` command on the command line:
```
git clone https://github.com/manifold-systems/manifold-simple-gradle-project.git
```          
To build from the command line you may need to set your JAVA_HOME environment variable.  The project uses Java 11,
so make sure your environment is setup with a Java 11 JDK e.g., on Windows:
```
>set java_home=\path\to\your\jdk-11
```                                                       
>**Note** Manifold fully supports Java 8 - 16. You can change the Java version in the `build.gradle` file to your
>preferred version.  
                                               
To build run:
```
gradlew build
```                 

### Cloning the project using **IntelliJ IDEA**

>**Note** you should install the Manifold plugin before you get started with this project.
>You can install the plugin directly from within IntelliJ: `Settings | Plugins | Browse Repositories | Manifold`

Follow these steps to automatically clone and open the project from IntelliJ IDEA.

If you already have a project IntelliJ open, you can clone this project using the menu command:

<kbd>File</kbd> ➜ <kbd>Project from Version Control...</kbd>
 
<p><img src="http://manifold.systems/images/simple-gradle-project/new_from_menu.png" alt="echo method" width="60%" height="60%"/></p>

Otherwise, if you don't have a project open use the `Get from Version Control` link from the IntelliJ IDEA open screen:

<p><img src="http://manifold.systems/images/simple-gradle-project/new_from_init.png" alt="echo method" width="60%" height="60%"/></p>

Then in the `Get from Version Control` window enter the project URL:
```
https://github.com/manifold-systems/manifold-simple-gradle-project.git
```                                                                   
<p><img src="http://manifold.systems/images/simple-gradle-project/get_from_vcs.png" alt="echo method" width="60%" height="60%"/></p>

Answer `Yes` in the following message box:

<p><img src="http://manifold.systems/images/simple-gradle-project/message.png" alt="echo method" width="60%" height="60%"/></p>

IntelliJ IDEA should clone and automatically load the project:

<p><img src="http://manifold.systems/images/simple-gradle-project/runme.png" alt="echo method" width="60%" height="60%"/></p>

>**Note** the project uses JDK 11. If you don't already have JDK 11 configured with IntelliJ, you'll need to set that
>up. Or if you prefer a different JDK, you can use a different one as you prefer -- Manifold fully supports Java 8 - 11.
>Remember to upate the `build.gradle` file to reflect the JDK you want to use.
 
### Examine the `build.gradle` file

Examine the `build.gradle` file to understand how to use Manifold in your own Gradle projects.  This project is quite
simple and provides a basic structure you can use as a model. 

 


 

