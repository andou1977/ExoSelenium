package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tablelaunch {
    WebDriver  webDriver;
    Table table;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        table=new Table(webDriver);
        webDriver.get("file:///C:/Users/GENIUS/Downloads/e-commerce-pricing/index.html");
    }

    @XrayTest(key = "TEST-123")



    @Test
    public void launchtable(){

        table.launchtable();
    }
}
