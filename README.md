![Eclipse Temurin](https://projects.eclipse.org/sites/default/files/Logo_Temurin_2021_08_17_JRR_RGB-V1A_0.png)
# primeNumbersApp

A simple Java cli application that has a dependency on the [primeNumbers library](https://github.com/bunny-thief/primeNumbers).

## Description

This application written as part of blog post that walks through the process of creating a Java `.jar` file, using Maven to install it to the local repository, import it. The idea for this blog post came about while working on a Spring MVC application that also required the static methods inside of the PrimeNumbers class.

Instead of copying and pasting the code from inside the PrimeNumbers class, I thought it would be a good opportunity to learn how to package a Java application with Maven so it could be reused across multiple projects.  I then used what I learned during that process to create the blog post about installing a JAR file to the local Maven repository which can be read here at [jarFile passing(arguments)](https://www.passingarguments.dev/posts/java-jar-file/).

## Getting Started

### Dependencies

This application has one dependency on the primeNumbers library. It needs to be installed to the Maven local repository. Simply, clone the library and then run the Maven install command.

```
git clone git@github.com:bunny-thief/primeNumbers.git
```

cd into the project directory.

```
cd primeNumbers
```

Then run the install command to save it to the local repository. 

```
mvn install
```

Once that is taken care of, you should be able to run the primeNumberApp.

In addition, the JAR file was compiled with Eclipse Temurin 17.0.8+7.

### Installing

The project can be distributed via the JAR file (primeNumberApp-1.0.jar) which is located in the project's base directory.

## Author

[@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.