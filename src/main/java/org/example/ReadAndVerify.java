package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadAndVerify {

    WebDriver webDriver;

    @FindBy(xpath = "//a[@id='downloadButton']")
    private WebElement clickbutton;



    public ReadAndVerify(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    void downloadnow(){
        clickbutton.click();
    }
}
