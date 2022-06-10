package Session;

import Utilities.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverFactory {
    WebDriver driver;
    static ConfigFileReader reader=new ConfigFileReader();


    public static WebDriver getDriver(){
        String getBrowser=reader.configFile("Browser");
        if(getBrowser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/resources/Drivers/ChromeDriver/chromedriver.exe");
            return new ChromeDriver();
        }else if(getBrowser.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }else if(getBrowser.equalsIgnoreCase("edge")){
            return new EdgeDriver();
        }

        return new ChromeDriver();
    }
}
