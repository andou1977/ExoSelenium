package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadFile {

    @FindBy(xpath="//a[@href='download/30.BDD.pdf']")
    private WebElement downloadfile;
    WebDriver webDriver;

    public DownloadFile(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    void downloadfile(){
        downloadfile.click();


    }
}
