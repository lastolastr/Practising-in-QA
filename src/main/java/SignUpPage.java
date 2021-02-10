import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

   private WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }

    By fieldEmail = By.xpath("//input[@type=\"email\"]");
    By fieldNickname = By.xpath("//input[@type=\"text\"]");
    By fieldPassword = By.xpath("//input[@id=\"password_field\"]");
    By fieldCheckPassword = By.xpath("//input[@id=\"password_repeat\"]");

    public SignUpPage enterEmail (String string){
        driver.findElement(fieldEmail).sendKeys(string);
        return this;
    }

    public SignUpPage enterNickname(String string){
        driver.findElement(fieldNickname).sendKeys(string);
        return this;
    }

    public SignUpPage enterPassword (String string){
        driver.findElement(fieldPassword).sendKeys(string);
        driver.findElement(fieldCheckPassword).sendKeys(string);
        return this;
    }

    public void pushTheButton(){// Узнать что возвращает сайт при нажатии на кнопку


    }






}
