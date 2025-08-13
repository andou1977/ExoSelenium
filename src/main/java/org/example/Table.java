package org.example;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Table {
    WebDriver webDriver;

    @FindBy(xpath ="//table/tbody/tr")
    private List<WebElement> mytable;
    @FindBy(xpath ="//table/tbody/tr[1]/td[1]")
    private List<WebElement> mytable2;

    public Table(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


   boolean testtable(){
        for(WebElement mylist:mytable){
            if(mylist.getText().contains("4G LTE")){
                return true;
            }
        }
        return false;
    }

    void launchvalue(){
        for(WebElement  testlaunch:mytable2){
            System.out.println(testlaunch.getText());
        }
    }

    void launchtable(){
        boolean mytest=testtable();
        Assertions.assertTrue(mytest);
        launchvalue();
    }
}
