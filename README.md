# Template for a checker built on the Checker Framework

This is a template for a pluggable type-checker built on the Checker Framework.

### How to use this template to build your own typechecker

To build your own typechecker:
1. Copy this repository's contents (don't make a fork).
2. Make changes to your copy.  We will give examples based on creating a
   checker to verify character encoding, such as UTF-8.

* Choose a name for your type system (e.g., "Character Encoding Checker"), a name for the implementation (e.g., "CharEncoding"), and a directory name (e.g., "charencoding").
* Change every occurrence of "TemplateForA" to "Character Encoding".
* Change every occurrence of "Templatefora" to "CharEncoding".
  This includes in file names (rename several files including
  `src/main/java/org/checkerframework/checker/templatefora/TemplateforaChecker.java`).
* Change every occurrence of "templatefora" to "charencoding".
  This includes in file names (for example, rename directories
  `src/main/java/org/checkerframework/checker/templatefora/` and `tests/templatefora/`).
* Change the groupId of the `publishing` block in the `build.gradle` file
  to an organization you belong to that can publish to Maven
  Central. Change the name of the package containing the source (currently
  `org.checkerframework.checker.templatefora`) so that it reflects your
  organization's naming standards. Replace all instances of `org.checkerframework.checker.templatefora` and
  `org/checkerframework/checker/templatefora` with whatever name you have chosen.
* Change the copyright info in the `LICENSE` file.  You may change the license as well, if you wish.
* Follow the ["How to create a new checker"
  instructions](https://checkerframework.org/manual/#creating-a-checker)
  in the Checker Framework Manual.

* While following the instructions, you should have changed all occurrences of TODO
  (and probably all occurrences of "Bottom") throughout the repository, and
  modified this README so that it describes your checker.

* Remove all text up from the top of this README, through this line.


# TemplateForA Checker

A common problem when programming is TODO.
This results in a run-time exception.

The TemplateForA Checker guarantees, at compile time, that your code will
not suffer that run-time exception.


## How to run the checker

First, publish the checker to your local Maven repository by running
`./gradlew publish` in this repository.

Then, if you use Gradle, add the following to the `build.gradle` file in
the project you wish to type-check (using Maven is similar):

```
repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    annotationProcessor 'org.checkerframework.checker.templatefora:0.1-SNAPSHOT'
}
```

Now, when you build your project, the TemplateForA Checker will also run,
informing you of any potential errors related to TODO.


## How to specify your code

At compile time, the TemplateForAChecker estimates what values the program
may compute at run time.  It issues a warning if the program may TODO.
It works via a technique called pluggable typechecking.

You need to specify the contracts of methods and fields in your code --
that is, their requirements and their guarantees.  The TemplateForAChecker
ensures that your code is consistent with the contracts, and that the
contracts guarantee that TODO.

You specify your code by writing *qualifiers* such as `@TemplateforaBottom`
on types, to indicate more precisely what values the type represents.
Here are the type qualifiers that are supported by the TemplateForAChecker:

`@TemplateforaUnknown`:
The value might or might not be TODO. It is not safe to use for TODO.
This is the default type, so programmers usually do not need to write it.

`@TemplateforaBottom`:
The value is definitely TODO. It is safe to use for TODO.


## How to build the checker

Run these commands from the top-level directory.

`./gradlew build`: build the checker

`./gradlew publish`: publish the checker to your local Maven repository.
This is useful for testing before you publish it elsewhere, such as to Maven Central.


## More information

The TemplateForA Checker is built upon the Checker Framework.  Please see
the [Checker Framework Manual](https://checkerframework.org/manual/) for
more information about using pluggable type-checkers, including this one.
