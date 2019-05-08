// Tests for a typechecker are (confusingly) also Java programs. This is an example of test data.
// You should delete it and write your own for your checker - this test is not intended to actually be used.
class ExampleTestData {

    // When no errors are expected, test data is just regular Java code.
    void noErrorsExpected() {
        Object object = new Object();
    }

    // When you expect an error, use the special comment syntax below with the expected error key.
    void errorExpected() {
        // :: error: assignment.type.incompatible
        Object object = new Object();
    }

}