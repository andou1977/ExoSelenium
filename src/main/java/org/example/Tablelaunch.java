package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
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


    @Test
    public void launchtable(){
        table.launchtable();
    }
}
