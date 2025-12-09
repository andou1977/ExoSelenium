package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    WebDriver webDriver;
    Table table;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver=new ChromeDriver();
        table=new Table(webDriver);
        webDriver.get("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\htmldocument\\index1.html");

    }
    @Test
    public void launchtable(){

        table.launchtable();
    }

}