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

    @FindBy(xpath = "//h3[@class='kt_ki ']")
    private List<WebElement> mylist;



    public RechercherFiltre(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

      void tcheclist() {
           for (WebElement thelist : mylist) {
//              if(thelist.getText().contains("USB Hub 3.0 Hub USB 3 USB 2.0 Multi USB Splitter Power Adapter 4/7 Port Multiple Expander 2.0 with Switch for PC Accessories")){
//                  return true;
               System.out.println(thelist.getText());
//              }
           }
//return false;
       }

//       void testertchelist(){
//        boolean testchest=tcheclist();
//        Assertions.assertTrue(testchest);
//       }

    void searchfilter(){

        filtrevalue.sendKeys("usb");
        clicknow.click();
  //testertchelist();
tcheclist();
    }
}
