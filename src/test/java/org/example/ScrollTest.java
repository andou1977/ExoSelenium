package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ScrollTest {

    WebDriver webDriver;
    Scroll scroll;

    @BeforeEach
    void setup() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        scroll=new Scroll(webDriver);
        webDriver.get("https://unsplash.com/fr");


        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000); // juste pour bien voir le scroll




        // 5. Prendre une capture d’écran complète
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("screenshot_full.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Capture enregistrée : screenshot_full.png");

    }

    @Test
    void launch() throws InterruptedException {
 setup();
    }

}