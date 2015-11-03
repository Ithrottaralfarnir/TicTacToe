# Development manual

The Project was made using the agile software development technique: **Pair Programming**.

We run our project as a **console program**.

To run it we need terminal or other terminal emulators like PuTTy.

As a source control client we use **Git**. We host our repo on **GitHub**.

The link to our repo is https://github.com/Ithrottaralfarnir/TicTacToe.git which is public.

We use java as our build environment and gradle is a necessary dependency.
- **build.gradle** contains the gradle build that we used
- **gradle** is the folder containing the gradle wrapper
- **gradlew** is the Linux/Unix script to run the gradle wrapper
- **gradlew.bat** is the Windows script to run the gradle wrapper

We use continuous integration which we declared in the .travis.yml file.
  
Run the command "**git clone https://github.com/Ithrottaralfarnir/TicTacToe.git**" to download the files from the repository. 

After we’ve downloaded the files from the repository we can access the file which has the name TicTacToe with the command “**cd TicTacToe**”.

From there you need to build the jar file using the gradle command "**gradle build**".

Without building the jar file we will not be able to compile and deploy or run the program.
