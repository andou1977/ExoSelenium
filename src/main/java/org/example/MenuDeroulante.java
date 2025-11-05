package org.example;

import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuDeroulante {


    @FindBy(xpath = "//select[@name='my-select']")
    private WebElement menude;


    WebDriver webdriver;

    public MenuDeroulante(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver,this);
    }


    public void menu(){

menude.sendKeys("One");
        Assertions.assertEquals("1"
                ,menude.getAttribute("value"));
    }
}
