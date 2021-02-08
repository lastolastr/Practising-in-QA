import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Field;

public class MainClass {
    public static void main (String [] args){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Дмитрий\\IdeaProjects\\untitled\\drivers\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://habr.com/ru/");


    }
}
