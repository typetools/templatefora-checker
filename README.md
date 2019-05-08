# Checker Framework checker template

This is a template for a pluggable type-checker built on the Checker Framework.

To build your own typechecker, you can copy this repository's contents. Make the
following changes once you do:

* change the name of the package containing the sources to something sensible for your
checker.
* choose a name for your typechecker, and change the name of the `TemplateforaChecker` class
to replace `Templatefora` with the name of your checker.
* change the artifactId (and groupId) of the `publishing` block in the `build.gradle` file
to something sensible for your checker.
* change the project name in the `settings.gradle` file.
* consider changing the license, and/or the copyright info, in the `LICENSE` file
* write some sensible tests for your checker, and add them to the `tests` folder in a new directory.
You should give this directory a sensible name based on the tests, then modify 
the `src/test/java/tests/ExampleTest.java` file so that each instance of "example" is replaced
with the name of your directory. You'll also need to change the checker being invoked to match the
name of your checker, and rename the test accordingly.
* delete the `tests/example` directory.
* modify this README so that it describes your checker, instead of this text :)
