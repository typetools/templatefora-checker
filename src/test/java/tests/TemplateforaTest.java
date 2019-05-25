import java.io.File;
import java.util.List;
import org.checkerframework.checker.templatefora.TemplateforaChecker;
import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test runner for tests of the TemplateForA Checker.
 *
 * <p>Tests appear as Java files in the {@code tests/templatefora} folder. To add a new test case,
 * create a Java file in that directory. The file contains "// ::" comments to indicate expected
 * errors and warnings; see
 * https://github.com/typetools/checker-framework/blob/master/checker/tests/README .
 */
public class TemplateforaTest extends CheckerFrameworkPerDirectoryTest {
    public TemplateforaTest(List<File> testFiles) {
        super(
                testFiles,
                TemplateforaChecker.class,
                "templatefora",
                "-Anomsgtext",
                "-Astubs=stubs/",
                "-nowarn");
    }

    @Parameters
    public static String[] getTestDirs() {
        return new String[] {"templatefora"};
    }
}
