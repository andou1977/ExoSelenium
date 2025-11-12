package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class DownloadFile2Test {
    WebDriver webDriver;
    DownloadFile2 downloadFile2;



    @BeforeEach
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


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");

        try {
            webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

//        webDriver=new FirefoxDriver(options);
        downloadFile2=new DownloadFile2(webDriver);
        downloadFile2=new DownloadFile2(webDriver);

        webDriver.get("https://the-internet.herokuapp.com/download");

    }



    @Test
    public void launchdownload(){
        downloadFile2.download();
        File file=new File("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\some-file.txt");
        Assertions.assertEquals(15,file.length());

    }

}