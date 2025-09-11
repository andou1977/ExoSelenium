//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class RechercherFiltreTest {
//
//
//    WebDriver webDriver;
//    RechercherFiltre rechercherFiltre;
//
//
//
//    @BeforeEach
//    public void setup(){
//        WebDriverManager.firefoxdriver().setup();
//        webDriver=new FirefoxDriver();
//        rechercherFiltre=new RechercherFiltre(webDriver);
//        webDriver.get("https://www.aliexpress.us/item/1005007793232089.html?ug_edm_item_id=3256807606917337&pdp_npi=4%40dis%21USD%21%249.99%21%243.38%21%21%21%21%21%402102e05317419974897551240d79a2%2112000042221169331%21edm%21%21%21&edm_click_module=alg_product_head_recommend_products_one_three_8247582900&headRecoBannerUrl=https%3A%2F%2Fae01.alicdn.com%2Fkf%2FSd35bcd54548a4cbeaa72d797efb98f65R.png&creative_img_ind=2&edm_log_data=gmod-head-recommended-products-one-three-columns.track-head-recommended-products-one-three-columns-log-link&tracelog=rowan&rowan_id1=aeug_edm_86493_1_en_US_2025-03-14&rowan_msg_id=andoCOWS_86493_%24dcc380f8e8b640dc849c55b224cb7ed1&ck=in_edm_other&gatewayAdapt=4itemAdapt");
//
//    }
//
//    @Test
//    public void launchfilter(){
//        rechercherFiltre.searchfilter();
//    }
//
//
//
//
//}