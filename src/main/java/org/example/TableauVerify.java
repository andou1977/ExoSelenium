//package org.example;
//
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//
//public class TableauVerify {
//
//    @FindBy(xpath = "//button[@class='fast-cmp-button-primary']")
//      private WebElement clicker;
//
//    @FindBy(xpath = "//table/tbody/tr[5]/td[1]")
//    private WebElement company;
//    @FindBy(xpath = "//table/tbody/tr[5]/td[2]")
//    private WebElement contact;
//    WebDriver webDriver;
//
//    public TableauVerify(WebDriver webDriver) {
//        this.webDriver = webDriver;
//        PageFactory.initElements(webDriver,this);
//    }
//
//
//    void mylaunch(){
//
//        // Localiser l'iframe (par exemple par index ou attribut)
//        WebElement iframe = webDriver.findElement(By.cssSelector("iframe[src*='consent']")); // à adapter selon le site
//
//// Passer dans l'iframe
//      webDriver.switchTo().frame(iframe);
//
//// Attendre et cliquer sur le bouton
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//button[contains(text(),'Accept')]")
//        ));
//        acceptButton.click();
//
//// Revenir au contexte principal
//        webDriver.switchTo().defaultContent();
//
//
//
//        Assertions.assertEquals("Island Trading",company.getText());
//        Assertions.assertEquals("Helen Bennett",contact.getText());
//    }
//}
