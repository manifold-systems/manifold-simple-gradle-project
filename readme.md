## Manifold : Simple Gradle Project

Demonstrates how to setup Manifold in a project using Gradle.

You can clone the project using the command or using IntelliJ IDEA.
  
### Cloning the project using the **command line**
You can clone this project using the `git clone` command on the command line:
```
git clone https://github.com/manifold-systems/manifold-simple-gradle-project.git
```          
To build from the command line you may need to set your JAVA_HOME environment variable e.g., on Windows:
```
>set java_home=c:\Program Files\Java\open_jdk\jdk-11.0.4+11
```                                                                                                      
To build run:
```
gradlew build
```          
To run tests:
```
gradlew test
```         

### Cloning the project using **IntelliJ IDEA**

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

### Examine the `build.gradle` file

Examine the `build.gradle` file to understand how to use Manifold in your own Gradle projects.  This project is quite
simple and provides a basic structure you can use as a model. 

 


 

