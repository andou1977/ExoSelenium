package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertionEtTest {

    WebDriver webDriver;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement fullname;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='subject']")
    private WebElement subject;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;


    @FindBy(xpath = "//div[@id='form-message-warning']")
    private WebElement messagesuccess;


    @FindBy(xpath = "//label[@id='name-error']")
    private WebElement labelfailed;

    @FindBy(xpath = "//label[@id='email-error']")
    private WebElement labelemailfailed;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement sendbouton;



    public InsertionEtTest(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

  void messagesuccess(){
        fullname.sendKeys("andou");
        email.sendKeys("andouemmanuel@gmail.com");
        subject.sendKeys("Votre candidature au poste de Responsable Modélisation Stress-Tests (F/H) m'est bien parvenue !");
        message.sendKeys("Dans cette attente, n'hésitez pas à vous rendre sur notre site mobilité" +
                " où vous retrouverez toutes les informations et conseils pour vous accompagner dans votre démarche.");
        sendbouton.click();

        Assertions.assertEquals("Something went wrong. Please try again.",messagesuccess.getText());

    }

    void messageempty(){
        sendbouton.click();
        Assertions.assertEquals("Please enter your name",labelfailed.getText());
      Assertions.assertEquals("Please enter a valid email address",labelemailfailed.getText());
    }


}
