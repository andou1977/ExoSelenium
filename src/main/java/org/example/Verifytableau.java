package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Verifytableau {


    WebDriver webDriver;

    @FindBy(xpath = "//input[@class='p-component p-inputtext']")
    private WebElement search;

  //  @FindBy(xpath = "//table/tbody/td")
  @FindBy(xpath = "//table[@id='pn_id_2-table']")
    private List<WebElement> mylist;

    public Verifytableau(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this );
    }

    boolean list(){
        for(WebElement mywebelement : mylist
        ){
            if(mywebelement.getText().contains("Lenna Paprocki")){
                return true;
            }
        }
        return false;
    }


    void search(){
        search.sendKeys("Lenna Paprocki");
        boolean mytest=list();
    Assertions.assertTrue(mytest);
    }

}
