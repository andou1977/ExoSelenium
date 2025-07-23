package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {


    @FindBy(xpath="//input[@id='search_product']")
   private WebElement searchproduct;

    @FindBy(xpath="//button[@class='fc-button fc-cta-consent fc-primary-button']")
    private WebElement clickerautoriser;

    @FindBy(xpath="//button[@id='submit_search']")
    private WebElement searchclick;


    WebDriver webdriver;

    public SearchProduct(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver,this);
    }

    void searchproduct(){
        clickerautoriser.click();
        searchproduct.sendKeys("T-shirt");
        searchclick.click();
    }
}
