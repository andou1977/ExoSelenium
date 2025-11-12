package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import static org.junit.jupiter.api.Assertions.*;

class MyFileNowTest {

    WebDriver webDriver;
    MyFileNow myFileNow;


    @BeforeEach
    void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        myFileNow=new MyFileNow(webDriver);
        webDriver.get("https://the-internet.herokuapp.com/upload");




    }

    @Test
    void mylaunch(){
        myFileNow.sendnow();
boolean verifynow=myFileNow.verify();
assertTrue(verifynow);
    }

}