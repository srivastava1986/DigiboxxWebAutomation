package Session;

import PageObjects.LoginPageObject;
import Utilities.ConfigFileReader;
import org.openqa.selenium.WebDriver;

public class TestSessionInitiator {
    WebDriver driver;
    private webDriverFactory wd;
    public LoginPageObject loginpage;
    public ConfigFileReader reader=new ConfigFileReader();


    private void init(){
        loginpage=new LoginPageObject(driver);
    }

    public TestSessionInitiator(){
        wd=new webDriverFactory();
        driver= webDriverFactory.getDriver();
        driver.get(getBaseURl());
        driver.manage().window().maximize();
        init();
    }

    private String getBaseURl(){
        //String baseurl="https://apptest.digiboxx.com/login";
        return reader.configFile("url");
        //return baseurl;
    }


}
