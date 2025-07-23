package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Saudecemo {

    WebDriver driver;

    public Saudecemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

 @FindBy(xpath = "//input[contains(@id,'user-name')]")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement myboutton;

  @FindBy(xpath="//div[@class='inventory_item_name ']")
  private List<WebElement>mylist=new ArrayList<>();




    void loginnow() {
        username.sendKeys("standard_user");
        verifierusername();
        password.sendKeys("secret_sauce");
        verifierpassword();
        myboutton.click();
        testverify();

    }

    void verifierusername() {
        String username1 = username.getAttribute("value");
        assertTrue(username1.contains("standard_user"));

    }

    void verifierpassword() {

        String password1 = password.getAttribute("value");
        assertTrue(password1.contains("secret_sauce"));
    }

    boolean verifyvaluetable() {

        for (WebElement jelist : mylist) {
            if (jelist.getText().contains("Sauce Labs Fleece Jacket")) {
                return true;}
        }
        return false;
    }

   void  testverify(){
        boolean tryit=verifyvaluetable();
        assertEquals(true,tryit);
    }
}