# Template for a checker built on the Checker Framework

This is a template for a pluggable type-checker built on the Checker Framework.

### How to use this template to build your own typechecker

To build your own typechecker, copy this repository's contents (don't make a fork),
then make changes to your copy.
We will give examples based on creating a checker to verify character encoding, such as UTF-8.

* Choose a name for your type system (e.g., "Character Encoding Checker"), a name for the implementation (e.g., "CharEncoding"), and a directory name (e.g., "charencoding").
* Change every occurrence of "TemplateForA" to "Character Encoding".
* Change every occurrence of "Templatefora" to "CharEncoding".
  This includes in file names (for example, rename file
  `src/main/java/org/checkerframework/checker/templatefora/TemplateforaChecker.java`).
* Change every occurrence of "templatefora" to "charencoding".
  This includes in file names (for example, rename directory
  `src/main/java/org/checkerframework/checker/templatefora/`).
* Change the groupId of the `publishing` block in the `build.gradle` file
  to an organization you belong to that can publish to Maven
  Central. Change the name of the package containing the source (currently
  `org.checkerframework.checker.templatefora`) so that it reflects your
  organization's naming standards.
* Change the copyright info in the `LICENSE` file.  You may change the license as well, if you wish.
* Modify this README so that it describes your checker, instead of this text. :)
* Follow the ["How to create a new checker" instructions](https://checkerframework.org/manual/#creating-a-checker) in the Checker Framework Manual .

### How the build system works

This template uses [Gradle](https://gradle.org/) as its build system.
To build the checker, run `./gradlew build` from the top-level directory.

The `build.gradle` file contains the definition of the build. The only
significant modification from a standard Gradle Java project is the
addition of the Maven publishing plugin, which permits you to publish
your checker to your local Maven repository by running `./gradlew publish`.
This is useful for testing out your checker on a real codebase before you
publish it elsewhere, such as to Maven Central.
