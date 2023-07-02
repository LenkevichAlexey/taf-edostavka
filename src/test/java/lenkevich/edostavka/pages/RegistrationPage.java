package lenkevich.edostavka.pages;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
    ChromeDriver driver;
    String registrationOnlyOnEdostavkaLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[3]/button";
    String checkBoxLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/label/span";
    String secondCheckBoxLocator = "//*[@id='checkbox']/label/span[1]";
    String submitButtonLocator = "//*[@id='wrapperModal']/div[3]/div/button[2]";
    String continueRegistrationButtonLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[3]/button";
    String nameFieldLocator = "//input[@name='firstname']";
    String surnameFieldLocator = "//input[@name='lastname']";
    String emailFieldLocator = "//input[@name='email']";
    String phoneFieldLocator = "//input[@name='phone']";
    String passwordFieldLocator = "//input[@type='password' and @placeholder=' ' and @value='' and @class='inputOutlined__input inputOutlined__input_size_medium inputOutlined__input_theme_light' and following-sibling::label[@class='inputOutlined__label' and text()='Пароль *']]";
    String confirmPasswordFieldLocator = "//input[@type='password' and @placeholder=' ' and @value='' and @class='inputOutlined__input inputOutlined__input_size_medium inputOutlined__input_theme_light' and following-sibling::label[@class='inputOutlined__label' and text()='Повторите пароль *']]";
    String createAccountButtonLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[3]/button";


    String textResultUsingIncorrectPhone = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[2]/div[3]/div";
    String textResultUsingInvalidCharacters = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div[2]/div[3]/div/div";

    public RegistrationPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public RegistrationPage clickRegistrationOnlyOnEdostavkaButton() {
        driver.findElement(By.xpath(registrationOnlyOnEdostavkaLocator)).click();
        return this;
    }

    public RegistrationPage clickCheckBox() {
        driver.findElement(By.xpath(checkBoxLocator)).click();
        return this;
    }

    public RegistrationPage clickSecondCheckBox() {
        driver.findElement(By.xpath(secondCheckBoxLocator)).click();
        return this;
    }

    public RegistrationPage clickSubmitButton() {
        driver.findElement(By.xpath(submitButtonLocator)).click();
        return this;
    }

    public RegistrationPage clickContinueRegistrationButton() {
        driver.findElement(By.xpath(continueRegistrationButtonLocator)).click();
        return this;
    }

    public RegistrationPage sendKeysFirsNameField(String str) {
        driver.findElement(By.xpath(nameFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage sendKeysLastNameField(String str) {
        driver.findElement(By.xpath(surnameFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage sendKeysEmailField(String str) {
        driver.findElement(By.xpath(emailFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage sendKeysPhoneField(String str) {
        driver.findElement(By.xpath(phoneFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage sendKeysPasswordField(String str) {
        driver.findElement(By.xpath(passwordFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage sendKeysConfirmPasswordField(String str) {
        driver.findElement(By.xpath(confirmPasswordFieldLocator)).sendKeys(str);
        return this;
    }

    public RegistrationPage clickCreateAccountButton() {
        driver.findElement(By.xpath(createAccountButtonLocator)).click();
        return this;
    }




    public String getResultTextUsingIncorrectPhoneInRegistrationFlow() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectPhone)).getText();
        return resultField;
    }

    public String getResultTextUsingInvalidCharactersInRegistrationFlow() {
        String resultField = driver.findElement(By.xpath(textResultUsingInvalidCharacters)).getText();
        return resultField;
    }

    public String confirmDisabledCreateAccountButton() {
        WebElement expandedCatalog = driver.findElement(By.xpath(createAccountButtonLocator));
        return expandedCatalog.getAttribute("disabled");
    }
}
