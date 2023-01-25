package webTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class authorizationPage extends WebElements {
    static WebDriver driver;

    @BeforeAll
    public static void createObject() {
        driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.manage().window().maximize();
        //WebElements webElement = new WebElements();
    }

    @Test
    public void firstNameFieldTest() {
        WebElement firstNameField = driver.findElement(By.xpath("//p/input[@name='name']"));
        firstNameField.sendKeys("Sergey");
        //getWebElement(driver.findElement(By.xpath("//p/input[@name='name']"))).sendKeys("Sergey");
    }

    @Test
    public void lastNameFieldTest() {
        WebElement lastNameField = driver.findElement(By.cssSelector("#register_form > fieldset:nth-child(1) > p:nth-child(2) > input[type=text]"));
        lastNameField.click();
        lastNameField.sendKeys("Sotnichenko");
    }

    @Test
    public void radioButtonsTest() {
        WebElement radioButton = driver.findElement(By.xpath("//*[contains(text(), 'Divorced')]"));
        radioButton.click();
    }


    @Test
    public void checkBoxTest() {
        WebElement checkBox = driver.findElement(By.xpath("//*[contains(text(), 'Reading')]"));
        checkBox.click();
    }

    @Test
    public void countryDropDownTest() {
        WebElement dropDown = driver.findElement(By.xpath("//select/option[@value='India']"));
        dropDown.click();
        driver.findElement(By.xpath("//select[not(@name='country')]/option[text()='India' and not(contains(@selected, 'selected'))]")).click();
    }

    @Test
    public void dateOfBirthDropdownsTest() {
        Select dropDownMonth = new Select(driver.findElement(By.xpath("(//div/select[@name][@id])[1]")));
        dropDownMonth.selectByValue("1");

        Select dropDownDay = new Select(driver.findElement(By.xpath("(//div/select[@name][@id])[2]")));
        dropDownDay.selectByValue("1");

        Select dropDownYear = new Select(driver.findElement(By.xpath("(//div/select[@name][@id])[3]")));
        dropDownYear.selectByValue("2014");

    }

    @Test
    public void phoneNumberFieldTest() {
        WebElement phoneNumberField = driver.findElement(By.xpath("//fieldset[@class='fieldset']/input[@name='phone']"));
        phoneNumberField.click();
        phoneNumberField.sendKeys("882346759");
    }

    @Test
    public void userNameFieldTest(){
        WebElement userNameField = driver.findElement(By.xpath("//fieldset[@class='fieldset']/input[@name='username']"));
        userNameField.click();
        userNameField.sendKeys("TylerTyler");
    }

    @Test
    public void emailFieldTest(){
        WebElement emailField = driver.findElement(By.xpath("//fieldset[@class='fieldset']/input[@name='email']"));
        emailField.click();
        emailField.sendKeys("onetwothree@gmail.com");
    }

    @Test
    public void uploadFileTest(){
        WebElement uploadFileInput = driver.findElement(By.xpath("//fieldset/input[@type='file']"));
        uploadFileInput.sendKeys("C:\\\\Sergeys\\Progs\\Photo.png");
    }

    @Test
    public void aboutYourselfAreaTest(){
        WebElement yourselfArea = driver.findElement(By.xpath("//fieldset/textarea"));
        yourselfArea.click();
        yourselfArea.sendKeys("There is gonna be some text and no one fucking cares what it is - it's just used for filling the form in so I can test it, barely... \n But at the same time" +
                " I am thinking what exactly to type in here and have no thoughts at all. An actually id doesn't matter - I hope so.");
    }

    @Test
    public void passwordFieldTest(){
        WebElement password = driver.findElement(By.xpath("//fieldset/input[ @name='password']"));
        password.click();
        password.sendKeys("12345OneTwoThree!");
    }

    @Test
    public void confirmPasswordFieldTest(){
        WebElement confirmPasswordField = driver.findElement(By.xpath("//fieldset/input[ @name='c_password']"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys("12345OneTwoThree!");
    }

    @Disabled
    public static void submitButtonTest(){
        WebElement submitButton = driver.findElement(By.xpath("//fieldset/input[ @type='submit']"));
        submitButton.click();
    }
}
