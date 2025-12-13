package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class ScrollTest {

    WebDriver webDriver;
    Scroll scroll;

    @BeforeEach
    void setup()  {
        WebDriverManager.chromedriver().setup();

        scroll=new Scroll(webDriver);
       webDriver=new ChromeDriver();
        webDriver.get("https://unsplash.com/fr");





    }

    void screeshot(){
        scoll();
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("screenshot_full.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Capture enregistrée : screenshot_full.png");
    }

    void scoll(){
                JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    @XrayTest(key = "FIR-1")
    void launch() throws InterruptedException {
screeshot();
    }

}