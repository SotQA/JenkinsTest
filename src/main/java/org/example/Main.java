package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Actions builder = new Actions(driver);

        driver.get("https://andersenlab.com/");

        driver.findElement(By.name("Pricing")).click();

        driver.quit();
    }
}