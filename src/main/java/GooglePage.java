import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("/")
public class GooglePage extends PageObject {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getDriver().getTitle();
    }
}
