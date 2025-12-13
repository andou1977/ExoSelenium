package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        WebDriverManager.chromedriver().setup();
        webDriver=new ChromeDriver();

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setBrowserName("firefox");
//
//        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);

        saudecemolaunch=new Saudecemo(webDriver);
        webDriver.get("https://www.saucedemo.com/");

    }


    @Test
    @XrayTest(key = "FIR-1")
    public void launch(){
        saudecemolaunch.loginnow();
    }


}