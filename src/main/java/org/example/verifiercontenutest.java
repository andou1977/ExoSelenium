package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class verifiercontenutest {

    WebDriver webdriver;
    Verifycontennu verifycontennu;

    @BeforeEach
    void setup() {
        String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document";
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", downloadPath);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,application/octet-stream");
        profile.setPreference("pdfjs.disabled", true);
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        WebDriverManager.firefoxdriver().setup();
        webdriver = new FirefoxDriver(options);
        verifycontennu = new Verifycontennu(webdriver);
        verifycontennu = new Verifycontennu(webdriver);
        webdriver.get("https://the-internet.herokuapp.com/download");

    }


void verify(){

    String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\bb.txt";
    File folder = new File(downloadPath);

    try (BufferedReader lecteur = new BufferedReader(new FileReader(folder))) {
        String ligne;
        while ((ligne = lecteur.readLine()) != null) {
            System.out.println(ligne);
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    Assertions.assertTrue(folder.isFile());
    Assertions.assertTrue(folder.exists());
}









    @Test
    void senddownload(){
        verifycontennu.downloadfile();
verify();

    }
}
