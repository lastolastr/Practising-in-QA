import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    WebDriver driver;
    MainPage mainPage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Дмитрий\\IdeaProjects\\untitled\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://habr.com/ru/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void searchTry () {
        SearchPage searchPage;
        searchPage=mainPage.typeSearch("Интегральное вычисление");

    }
}
