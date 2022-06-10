package BaseUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    private String pageName;

    protected BasePage(WebDriver driver, String pageName){
        PageFactory.initElements(driver,this);
        this.driver=driver;
        this.pageName=pageName;

    }

}
