import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SearchPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Дмитрий\\IdeaProjects\\untitled\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://habr.com/ru/");

    }

    @Test
    public void trySearch(){
        // последовательность методов из MainPage
        SearchPage search=mainPage.searchInform("Интегральные исчисления");
        String rst = search.searchElement();
        Assert.assertEquals(rst,"По релевантности");
    }



}
