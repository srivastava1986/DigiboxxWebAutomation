package PageObjects;

import BaseUi.GetPage;
import Utilities.ConfigFileReader;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends GetPage {
    ConfigFileReader reader=new ConfigFileReader();

    public LoginPageObject(WebDriver driver) {
        super(driver,"LoginPageTest");
    }

    public Boolean enterLoginCredentials(){
        element("digispace").sendKeys("Freeuse");
        element("emailid").sendKeys(reader.configFile("username"));
        element("password").sendKeys(reader.configFile("password"));
        element("loginbutton").click();
        String title=element("homepage").getText();
        if (title.equalsIgnoreCase("myboxx")){
            return true;
        }else {
            return false;
        }
    }
}
