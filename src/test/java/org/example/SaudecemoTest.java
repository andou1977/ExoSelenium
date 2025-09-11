package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class SaudecemoTest {

    WebDriver webDriver;
    Saudecemo saudecemolaunch;

    @BeforeEach
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