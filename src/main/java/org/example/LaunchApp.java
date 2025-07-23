package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.nio.file.Paths;

public class LaunchApp {

    WebDriver webdriver;
   SearchProduct searchProduct;
   DownloadFile downloadFile;
    String downloadPath = "C:\\Users\\GENIUS\\IdeaProjects\\ExoSelenium\\src\\main\\resources\\document";

    @Before
    public void setup(){


        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2); // 2 = chemin personnalisé
        profile.setPreference("browser.download.dir", downloadPath);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,application/octet-stream"); // adapte MIME type si besoin
        profile.setPreference("pdfjs.disabled", true); // désactive le lecteur PDF intégré
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);
        WebDriverManager.firefoxdriver().setup();
        webdriver=new FirefoxDriver(options);
        searchProduct=new SearchProduct(webdriver);
        downloadFile=new DownloadFile(webdriver);
      //  webdriver.get("https://automationexercise.com/products");
        webdriver.get("https://the-internet.herokuapp.com/download");
    }

    @Test
    public void launchapp(){
      // searchProduct.searchproduct();
        downloadFile.downloadfile();


        File folder = new File(downloadPath);
        File[] files = folder.listFiles();

// Vérifie que le dossier existe et qu’il contient au moins un fichier
        Assertions.assertTrue(folder.exists() && folder.isDirectory(), "Le dossier n'existe pas !");
        Assertions.assertTrue(files != null && files.length > 0, "Aucun fichier trouvé dans le dossier !");
    }
}
