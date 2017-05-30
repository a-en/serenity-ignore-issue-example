import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class MySteps extends ScenarioSteps {

    private GooglePage googlePage;

    @Step
    public void openGooglePage() {
        googlePage.open();
    }

    @Step
    public void checkIfTitleMatches(String title) {
        assertEquals(title, googlePage.getTitle());
    }

    @Step
    public void search(String searchTerm) {
        googlePage.search(searchTerm);
    }
}
