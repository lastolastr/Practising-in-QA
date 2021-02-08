import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver=driver;
    }

    private By searchField= By.xpath("//input[@id=\"search-form-field\"]");
    private By searchButton= By.xpath("//button[@id=\"search-form-btn\"]");

    public MainPage typeSearch(String search){
        driver.findElement(searchField).sendKeys(search);
        return this;
    }
    // переписать все методы
    // не делать заимосвязи
    public MainPage searchClick(){
        driver.findElement(searchButton).click();
        return this;
    }
    
    public SearchPage searchInform(String search){
        this.typeSearch(search);
        return new SearchPage(driver);
    }




}
