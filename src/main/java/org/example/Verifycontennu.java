package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifycontennu {

    WebDriver webDriver;

    @FindBy(xpath = "//a[@href='download/sample.png']")
    private WebElement  downloadfile;

    public Verifycontennu(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    void downloadfile(){
        downloadfile.click();

    }
}
