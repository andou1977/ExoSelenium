package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TableauVerify {


    @FindBy(xpath = "//table/tbody/tr[5]/td[1]")
    private WebElement company;
    @FindBy(xpath = "//table/tbody/tr[5]/td[2]")
    private WebElement contact;
    WebDriver webDriver;

    public TableauVerify(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


    void mylaunch(){
        Assertions.assertEquals("Island Trading",company.getText());
        Assertions.assertEquals("Helen Bennett",contact.getText());
    }
}
