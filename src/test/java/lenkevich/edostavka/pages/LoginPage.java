package lenkevich.edostavka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    ChromeDriver driver;

    String loginButtonLocator = "//*[@id='header__inner']/div[1]/div[2]/div[2]/div[1]/button";
    String phoneFieldLocator = "//*[@id='phone']/div/div/input";
    String loginWithPasswordButtonLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[2]/button";
    String passwordFieldLocator = "//input[@class='inputOutlined__input inputOutlined__input_size_medium inputOutlined__input_theme_light']";
    String logIntoAccountButtonLocator = "//button[@class='button button_size_large button_type_primary withPassword_button__3Fz9A']";
    String closeButtonInModalLocator = "/html/body/div[5]/div/div[2]/div/button";
    String getCodeButton = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/button";
    String eyeIconToShowLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/button/i";
    String eyeIconToHideLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/button/i";
    String forgotPasswordButtonLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/button";
    String lastNameFieldLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div[2]/div/div/input";
    String phoneFieldInForgotPasswordPageLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div[1]/div/input";
    String getCodeButtonInForgotPasswordPageLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[2]/button[1]";
    String createAccountButtonLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[2]/div[3]/a";

    String textPhoneInputLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/input";
    String textPasswordInputLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/label";
    String textResultUsingIncorrectPhone = "//*[@id='phone']/div[2]/div/div";
    String textResultUsingIncorrectDataLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/div";
    String showPasswordUsingEyeIconLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/input";
    String hidePasswordUsingEyeIconLocator = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/input";
    String textResultUsingOnlyIncorrectPhone = "//*[@id='phone']/div[2]/div/div";
    String textResultUsingIncorrectDataForgotPassword = "//*[@id='__next']/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div[3]/div/div/div";

    public LoginPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(By.xpath(loginButtonLocator)).click();
        return this;
    }

    public LoginPage sendKeysInputPhoneField(String str) {
        driver.findElement(By.xpath(phoneFieldLocator)).sendKeys(str);
        return this;
    }

    public LoginPage clickLoginWithPasswordField() {
        driver.findElement(By.xpath(loginWithPasswordButtonLocator)).click();
        return this;
    }

    public LoginPage sendKeysInputPasswordField(String str) {
        driver.findElement(By.xpath(passwordFieldLocator)).sendKeys(str);
        return this;
    }

    public LoginPage clickSubmitButton() {
        driver.findElement(By.xpath(logIntoAccountButtonLocator)).click();
        return this;
    }

    public LoginPage clickCloseButton() {
        driver.findElement(By.xpath(closeButtonInModalLocator)).click();
        return this;
    }

    public LoginPage clickGetCodeButton() {
        driver.findElement(By.xpath(getCodeButton)).click();
        return this;
    }

    public LoginPage clickEyeIconToShowPassword() {
        driver.findElement(By.xpath(eyeIconToShowLocator)).click();
        return this;
    }

    public LoginPage clickEyeIconToHidePassword() {
        driver.findElement(By.xpath(eyeIconToHideLocator)).click();
        return this;
    }

    public LoginPage clickForgotPasswordButton() {
        driver.findElement(By.xpath(forgotPasswordButtonLocator)).click();
        return this;
    }

    public LoginPage sendKeysPhoneFieldForgotPasswordPage(String str) {
        driver.findElement(By.xpath(phoneFieldInForgotPasswordPageLocator)).sendKeys(str);
        return this;
    }

    public LoginPage sendKeysLastNameField(String str) {
        driver.findElement(By.xpath(lastNameFieldLocator)).sendKeys(str);
        return this;
    }

    public LoginPage clickGetCodeButtonForgotPasswordPage() {
        driver.findElement(By.xpath(getCodeButtonInForgotPasswordPageLocator)).click();
        return this;
    }

    public LoginPage clickCreateAccountButton() {
        driver.findElement(By.xpath(createAccountButtonLocator)).click();
        return this;
    }





    public String getPhoneInputFieldPlaceholderText() {
        WebElement phoneInputField = driver.findElement(By.xpath(textPhoneInputLocator));
        return phoneInputField.getAttribute("placeholder");
    }

    public String getResultTextInPasswordInputField() {
        String passwordInputField = driver.findElement(By.xpath(textPasswordInputLocator)).getText();
        return passwordInputField;
    }

    public String getResultTextUsingIncorrectDataForLogin() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectDataLocator)).getText();
        return resultField;
    }

    public String getResultTextUsingIncorrectPhoneForLogin() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectPhone)).getText();
        return resultField;
    }

    public String getResultTextUsingOnlyPhoneField() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectDataLocator)).getText();
        return resultField;
    }

    public String getResultTextUsingOnlyPasswordField() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectDataLocator)).getText();
        return resultField;
    }

    public String getVisiblePasswordViaEyeIcon() {
        WebElement resultField = driver.findElement(By.xpath(showPasswordUsingEyeIconLocator));
        return resultField.getAttribute("type");
    }

    public String getInvisiblePasswordViaEyeIcon() {
        WebElement resultField = driver.findElement(By.xpath(hidePasswordUsingEyeIconLocator));
        return resultField.getAttribute("type");
    }

    public String getResultTextUsingOnlyIncorrectPhone() {
        String resultField = driver.findElement(By.xpath(textResultUsingOnlyIncorrectPhone)).getText();
        return resultField;
    }

    public String getResultTextUsingIncorrectDataForgotPassword() {
        String resultField = driver.findElement(By.xpath(textResultUsingIncorrectDataForgotPassword)).getText();
        return resultField;
    }
}
