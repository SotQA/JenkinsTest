package webTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstNameFormTest extends Main {

    @BeforeEach
    public void createObject(){
        driver = new ChromeDriver();
    }

    @Test
    public void fillFirstNameTest() {
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Sergey");
        WebElement element = driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(1) > p:nth-child(2) > input[type=text]"));
        element.sendKeys("Sotnichenko");
        WebElement radioButton = driver.findElement(By.xpath("//input[@name='m_status']"));
        radioButton.click();
        WebElement checkbox = driver.findElement(By.xpath("//label[input/@name='hobby']/input[1]"));
        checkbox.click();
    }
}
