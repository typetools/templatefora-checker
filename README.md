# Template for a checker built on the Checker Framework

This is a template for a pluggable type-checker built on the Checker Framework.

### How to use this template to build your own typechecker

To build your own typechecker:
1. Copy this repository's contents (don't make a fork).
2. Make changes to your copy.  We will give examples based on creating a checker to verify character encoding, such as UTF-8.

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
* Follow the ["How to create a new checker" instructions](https://checkerframework.org/manual/#creating-a-checker) in the Checker Framework Manual .
* Remove all text up from the top of this README to this line.
  Further modify this README so that it describes your checker.

# TemplateForA Checker

A common problem when programming is TODO.
This results in a run-time exception.

The TemplateForA Checker guarantees, at compile time, that your code will
not suffer that run-time exception.



### How to build the checker

Run these commands from the top-level directory.

`./gradlew build`: build the checker

`./gradlew publish`: publish the checker to your local Maven repository.
This is useful for test before you publish it elsewhere, such as to Maven Central.
