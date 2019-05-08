# Template for a checker built on the Checker Framework

This is a template for a pluggable type-checker built on the Checker Framework.

To build your own typechecker, copy this repository's contents (don't make a fork),
then make changes to your copy.
We will give examples based on creating a checker to verify character encoding, such as UTF-8.

* Choose a name for your type system, for example "Character Encoding Checker", a name for the implementation, such as "CharEncoding", and a directory name, such 
* Change every occurrence of "TemplateForA" to "Character Encoding".
* Change every occurrence of "Templatefora" to "CharEncoding".  This includes in file names (for example, rename file `src/main/java/org/checkerframework/checker/templatefora/TemplateforaChecker.java`).
* Change every occurrence of "templatefora" to "charencoding".  This includes in file names (for example, rename directory
`src/main/java/org/checkerframework/checker/templatefora/`).
* Change the groupId of the `publishing` block in the `build.gradle` file to an organization you belong to that can publish to Maven Central.
* Change the copyright info in the `LICENSE` file.  You may change the license as well, if you wish.
* Modify this README so that it describes your checker, instead of this text. :)
* Follow the ["How to create a new checker" instructions](https://checkerframework.org/manual/#creating-a-checker) in the Checker Framework Manual .
