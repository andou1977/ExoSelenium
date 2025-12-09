package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//il se lance automatiquement sur jenkins
public class DownloadFile2 {



    @FindBy(xpath = "//a[@href='download/some-file.txt']")
    private WebElement downloadfile;
    WebDriver webDriver;

    public DownloadFile2(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver,this);
    }

    void download(){
        downloadfile.click();
        Assertions.assertEquals("some-file.txt",downloadfile.getText());

    }


}
