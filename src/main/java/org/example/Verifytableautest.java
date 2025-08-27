package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verifytableautest {

    WebDriver webDriver;

    Verifytableau verifytableau;


    @BeforeEach
    void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver( );
        verifytableau=new Verifytableau(webDriver);
        webDriver.get("http://localhost:4200/uikit/table");

    }

    @Test
    void search(){
        verifytableau.search();
    }
}
