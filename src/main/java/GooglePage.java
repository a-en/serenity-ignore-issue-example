import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DefaultUrl("/")
public class GooglePage extends PageObject {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getDriver().getTitle();
    }

    public void search(String searchTerm) {
        element(By.name("q")).sendKeys(searchTerm, Keys.ENTER);
    }
}
