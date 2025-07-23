package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saudecemolaunch {

    WebDriver webDriver;
    Saudecemo saudecemolaunch;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        saudecemolaunch=new Saudecemo(webDriver);
        webDriver.get("https://www.saucedemo.com/");
    }


    @Test
    public void launch(){
        saudecemolaunch.loginnow();
    }



}
