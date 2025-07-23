package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RechercherFiltre {


    WebDriver webDriver;
    @FindBy(xpath = "//input[@id='search-words']")
    private WebElement filtrevalue;

    @FindBy(xpath = "//input[@class='search--submit--2VTbd-T search--newSubmit--3BlVRKw']")
    private WebElement clicknow;
    @FindBy(xpath = "//a[@style='display: block; position: absolute; right: 0px; top: 0px; height: 52px; line-height: 52px; padding: 0px 20px; color: rgb(153, 153, 153);']")
    private WebElement shitclick;

    @FindBy(xpath = "//h3[@class='kr_j0']")
    private List<WebElement> mylist;


    public RechercherFiltre(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

       boolean tcheclist(){
        for(WebElement thelist:mylist){
            if(thelist.getText().contains("Essager 240W USB Type C To USB C Cable 100W PD 3.1 ")){
                return true;
            }

        }
        return false;
       }




    void searchfilter(){
        filtrevalue.sendKeys("usb");
        shitclick.click();
        clicknow.click();
        tcheclist();

    }
}
