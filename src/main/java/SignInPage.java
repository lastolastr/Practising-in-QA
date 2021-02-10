import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver=driver;
    }

    private By fieldEmail= By.xpath("//input[@type =\"email\"]");
    private By fieldPassword = By.xpath("//input[@type =\"password\"]");
    private By enterButton = By.xpath("//button[@type =\"submit\"]");

    public SignInPage enterEmail(String email){ //Лучше использовать в возвращаемом типе SignIn или просто писать void?
        driver.findElement(fieldEmail).sendKeys(email);
        return this;
    }

    public SignInPage enterPassword (String string){
        driver.findElement(fieldPassword).sendKeys(string);
        return this;
    }

//    public SignInPage pushButton (String pass){ // узнать что возвращает вход
//
//    }

}
