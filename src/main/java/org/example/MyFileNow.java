package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyFileNow {

    WebDriver  webDriver;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement myclick;

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement choosefile;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement verifytext;

    public MyFileNow(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


    boolean verify(){
        if (verifytext.getText().equals("blbla.pdf")){
return true;
        }
        return false;
    }

  void sendnow(){
      choosefile.sendKeys("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\blbla.pdf");
      myclick.click();

  }
}
