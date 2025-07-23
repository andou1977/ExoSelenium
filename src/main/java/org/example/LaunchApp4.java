package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApp4 {
    WebDriver webDriver;

    ReadAndVerify readAndVerify;


    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        readAndVerify=new ReadAndVerify(webDriver);
        webDriver.get("https://demoqa.com/upload-download");
    }

    @Test
    public void readandverify(){
readAndVerify.downloadnow();
    }
}
