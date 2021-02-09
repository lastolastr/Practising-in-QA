import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver=driver;
    }

    private By searchField= By.xpath("//input[@id=\"search-form-field\"]");
    private By searchButton= By.xpath("//button[@id=\"search-form-btn\"]");



    public SearchPage typeSearch(String search){
        driver.findElement(searchButton).click();
        driver.findElement(searchField).sendKeys(search);
        driver.findElement(searchField).sendKeys(Keys.RETURN);
        return new SearchPage (driver);
    }
//     переписать все методы
//     не делать заимосвязи
//    public MainPage searchClick(){
//        driver.findElement(searchButton).click();
//        return this;
//    }

//    public SearchPage searchInform(String search){
//        this.typeSearch(search);
//        return new SearchPage(driver);
//    }




}
