package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class launchdownloadfile2 {

    WebDriver webDriver;
   DownloadFile2 downloadFile2;



    @Before
    public void setup(){
        String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document";
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2); // 2 = chemin personnalisé
        profile.setPreference("browser.download.dir", downloadPath);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,application/octet-stream"); // adapte MIME type si besoin
        profile.setPreference("pdfjs.disabled", true); // désactive le lecteur PDF intégré
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        WebDriverManager.firefoxdriver().setup();
        webDriver=new FirefoxDriver(options);
        downloadFile2=new DownloadFile2(webDriver);
        downloadFile2=new DownloadFile2(webDriver);

        webDriver.get("https://the-internet.herokuapp.com/download");

    }

    @Test
    public void launchdownload(){
        downloadFile2.download();
        File file=new File("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\some-file.txt");
        Assertions.assertEquals(307,file.length());

    }
}
