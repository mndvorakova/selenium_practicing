package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MajaNastassjaDvorako\\selenium_java\\chromedriver.exe");

        ChromeOptions moznosti = new ChromeOptions();

        //incognito mode
        moznosti.addArguments("--incognito");

        //urcuji typ webdriveru + se nastartuje browser
        WebDriver chrome = new ChromeDriver(moznosti);

        Thread.sleep(2000);

        chrome.navigate().to("https://www.google.com/");


        chrome.manage().window().maximize();
        Thread.sleep(2000);

        //chrome.quit();



    }
}