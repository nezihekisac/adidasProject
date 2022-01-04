package com.adidas.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class adidasBasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoblaze.com/index.html");

        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("title = " + title);
        driver.close();


    }





}
