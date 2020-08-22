package com.techProed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hp/Desktop/IT Kurs/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http:google.com");
        
        System.out.println("Git'den Merhaba");

    }
}
