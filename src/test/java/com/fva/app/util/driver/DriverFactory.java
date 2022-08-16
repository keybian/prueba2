package com.fva.app.util.driver;


import com.fva.app.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import java.net.MalformedURLException;
import java.net.URI;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {
    private static String pathFormat = System.getProperty("user.dir") + "/src/test/resources/drivers/linux/%s";


    public static WebDriver get(Browser browser) {



        if (Browser.chrome.equals(browser)) {
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat,"chromedriver.exe"));

            return new ChromeDriver();
        }
        if (Browser.firefox.equals(browser)) {
            System.setProperty("webdriver.gecko.driver",String.format(pathFormat,"geckodriver.exe"));

            return new FirefoxDriver();
        }

        throw new IllegalArgumentException("Druver no encontrado por el Browser: " + browser);


    }


}



