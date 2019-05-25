import org.checkerframework.checker.templatefora.qual.*;

// Test basic subtyping relationships for the TemplateForA Checker.
class SubtypeTest {
    void allSubtypingRelationships(@TemplateforaUnknown int x, @TemplateforaBottom int y) {
        @TemplateforaUnknown int a = x;
        @TemplateforaUnknown int b = y;
        // :: error: assignment.type.incompatible
        @TemplateforaBottom int c = x; // expected error on this line
        @TemplateforaBottom int d = y;
    }
}
