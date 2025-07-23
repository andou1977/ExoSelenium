package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApp2 {

    WebDriver webDriver;

    UploadFile uploadFile;

    @Before
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
