package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InsertionetTestLaunch {

    WebDriver webDriver;

    InsertionEtTest insertionEtTest;

    @BeforeEach
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver();
        insertionEtTest=new InsertionEtTest(webDriver);
        webDriver.get("file:///C:/Users/GENIUS/downloads/download/contact-form-08/index.html");

    }

    @Test
    public void launch(){
      // insertionEtTest.messagesuccess();
        insertionEtTest.messageempty();
    }
}
