import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestSuite {

    @Managed
    private WebDriver driver;

    @Steps
    private MySteps mySteps;

    @Test
    @Ignore
    public void test1() throws Exception {

    }

    @Test
    public void test2() throws Exception {
        mySteps.openGooglePage();
        mySteps.checkIfTitleMatches("Google");
    }
}
