package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class UploadFileTest {

    WebDriver webDriver;

    UploadFile uploadFile;

    @BeforeEach
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        uploadFile=new UploadFile(webDriver);
        webDriver.get("https://demoqa.com/upload-download");
        //uploadFile.uploadmyfile();
    }
    @Test
    public void uploadfile(){

        uploadFile.uploadmyfile();

    }
}