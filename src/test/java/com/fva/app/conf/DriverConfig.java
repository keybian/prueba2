package com.fva.app.conf;

import com.fva.app.enums.Browser;
import com.fva.app.util.driver.DriverFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.MalformedURLException;
import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "com.fva.app")
@PropertySource("classpath:/application-${environment:dev}.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driveType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverWaitTimeOut;


    @Autowired
    private DriverFactory driver;

    @Bean
    public WebDriver webDriver() {
        return driver.get(driveType);
    }


}
