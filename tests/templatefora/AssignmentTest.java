// This Java program is test data for a typechecker.
//
// You should delete it and write your own tests for your checker.
// This test is not intended to actually be used.
class AssignmentTest {

    // When no errors are expected, test data is just regular Java code.
    void noErrorsExpected() {
        Object object = new Object();
    }

    // When you expect an error, use the "// ::" comment syntax to indicate the expected error key.
    void errorExpected() {
        // :: error: assignment.type.incompatible
        Object object = new Object();
    }
}
