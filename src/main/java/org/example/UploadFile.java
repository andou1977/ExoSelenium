package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile {


    @FindBy(xpath="//input[@id='uploadFile']")
    private WebElement uploadmyfileclick;




    WebDriver webDriver;

    public UploadFile(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    void uploadmyfile(){
        uploadmyfileclick.sendKeys("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\30.BDD.pdf");
        Assertions.assertEquals(" ", "");
    }
}
