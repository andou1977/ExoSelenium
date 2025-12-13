package org.example;



import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class MenuDeroulanteTest {



    WebDriver webDriver;
    MenuDeroulante mmenudeMenuDeroulante;

    @BeforeEach
    void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver=new ChromeDriver();
        mmenudeMenuDeroulante=new MenuDeroulante(webDriver);
        webDriver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Test
    @XrayTest(key = "FIR-1")
    void launchmenu(){
        mmenudeMenuDeroulante.menu();
    }

}