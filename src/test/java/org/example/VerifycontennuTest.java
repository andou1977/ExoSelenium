package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VerifycontennuTest {

    WebDriver webdriver;
    Verifycontennu verifycontennu;

    @BeforeEach
    void setup() {
        String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document";


        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("plugins.always_open_pdf_externally", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);


        WebDriverManager.chromedriver().setup();
        WebDriver webdriver = new ChromeDriver(options);



        verifycontennu = new Verifycontennu(webdriver);
        verifycontennu = new Verifycontennu(webdriver);
        webdriver.get("https://the-internet.herokuapp.com/download");

    }


    void verify(){

        String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document\\tests.txt";
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
    @XrayTest(key = "FIR-1")
    void senddownload(){
        verifycontennu.downloadfile();
        verify();

    }
}