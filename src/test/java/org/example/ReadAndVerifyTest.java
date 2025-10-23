//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ReadAndVerifyTest {
//
//
//    WebDriver webDriver;
//
//    ReadAndVerify readAndVerify;
//
//
//    @BeforeEach
//    public void setup(){
//        WebDriverManager.firefoxdriver().setup();
//        webDriver=new FirefoxDriver();
//        readAndVerify=new ReadAndVerify(webDriver);
//        webDriver.get("https://demoqa.com/upload-download");
//    }
//
//    @Test
//    public void readandverify(){
//        readAndVerify.downloadnow();
//    }
//
//
//}