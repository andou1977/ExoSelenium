package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;
import java.util.HashMap;
import java.util.Map;


class DownloadFile2Test {
    WebDriver webDriver;
    DownloadFile2 downloadFile2;



    @BeforeEach
    void setup(){
        String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document";

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath); // chemin personnalisé
        prefs.put("download.prompt_for_download", false);      // pas de popup
        prefs.put("plugins.always_open_pdf_externally", true); // désactive lecteur PDF intégré


        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().setup();

// cest pour le docker
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setBrowserName("firefox");
//
//        try {
//            webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }

        webDriver=new ChromeDriver(options);


        downloadFile2=new DownloadFile2(webDriver);
        downloadFile2=new DownloadFile2(webDriver);

        webDriver.get("https://the-internet.herokuapp.com/download");

    }



    @Test
    @XrayTest(key = "FIR-1")
    void launchdownload(){
        downloadFile2.download();
        File file=new File("C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\some-file.txt");
        Assertions.assertEquals(16,file.length());

    }

}