package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class TableauVerifyTest {
    WebDriver webDriver;
    TableauVerify tableauVerify;

    @BeforeEach
    void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        tableauVerify=new TableauVerify(webDriver);
        webDriver.get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test
    void launchmy(){
        tableauVerify.mylaunch();
    }

}