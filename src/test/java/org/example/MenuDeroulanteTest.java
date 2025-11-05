package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class MenuDeroulanteTest {



    WebDriver webDriver;
    MenuDeroulante mmenudeMenuDeroulante;

    @BeforeEach
    void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        mmenudeMenuDeroulante=new MenuDeroulante(webDriver);
        webDriver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Test
    void launchmenu(){
        mmenudeMenuDeroulante.menu();
    }

}