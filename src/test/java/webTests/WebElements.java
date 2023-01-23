package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

    static WebDriver driver = new ChromeDriver();

    private WebElement webElement;

    public WebElement getWebElement(WebElement element) {
        return webElement;
    }
}
