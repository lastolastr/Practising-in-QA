import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SearchPageTest {

    private WebDriver driver;
    private SearchPage searchPage;



    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Дмитрий\\IdeaProjects\\untitled\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://habr.com/ru/search/?q=%D0%98%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B5+%D0%B2%D1%8B%D1%87%D0%B8%D1%81%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5#h");
      //  mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void trySearch(){
       // SearchPage search= mainPage.typeSearch("Интегральные исчисления");
        String rst = searchPage.searchElement();   //Через метод или напрямую?
        Assert.assertEquals(rst,"по релевантности");
    }

    @After
    public void close(){
        driver.quit();
    }

}
