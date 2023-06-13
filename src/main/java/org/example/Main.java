package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MajaNastassjaDvorako\\selenium_java\\chromedriver.exe");

        //urcuji typ webdriveru + se nastartuje browser
        WebDriver chrome = new ChromeDriver();

        Thread.sleep(2000);

        chrome.navigate().to("https://www.google.com/");


        chrome.manage().window().maximize();
        Thread.sleep(2000);

        chrome.quit();




    }
}