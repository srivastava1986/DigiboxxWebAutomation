package BaseUi;

import Utilities.textFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetPage extends BasePage{
    protected WebDriver driver;
    String pageName;
    //textFileReader textFileReader=new textFileReader();
    public GetPage(WebDriver driver, String pageName) {
        super(driver, pageName);
        this.driver=driver;
        this.pageName=pageName;
    }

    public WebElement element(String elementname){
        String[] locator = new String[0];
        locator= textFileReader.getLocator(elementname);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webelement = wait.until( ExpectedConditions.presenceOfElementLocated(locator(locator[1],locator[2])) );
        return webelement;

    }

    public static By locator(String locatorType, String locatorvalue){

    switch (Locators.valueOf(locatorType)){

        case xpath:
            return By.xpath(locatorvalue);
        case id:
            return By.id(locatorvalue);
        default:
            return By.xpath(locatorvalue);
    }

    }
}
