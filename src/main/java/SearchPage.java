import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private WebDriver driver;

    private By text = By.xpath("");

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchElement=By.xpath("//a[@class='toggle-menu__item-link toggle-menu__item-link_active']");

    public String searchElement() {

        String heading = driver.findElement(searchElement).getText();
        return heading;

    }
}
