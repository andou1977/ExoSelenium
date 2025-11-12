package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class SaudecemoTest {

    WebDriver webDriver;
    Saudecemo saudecemolaunch;

    @BeforeEach
    public void setup() throws MalformedURLException {
        WebDriverManager.firefoxdriver().setup();
//        webDriver=new FirefoxDriver();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");

        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);

        saudecemolaunch=new Saudecemo(webDriver);
        webDriver.get("https://www.saucedemo.com/");

    }


    @Test
    public void launch(){
        saudecemolaunch.loginnow();
    }


}