package lenkevich.edostavka.steps;

import lenkevich.edostavka.pages.HomePage;
import lenkevich.edostavka.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdostavkaStep {
    LoginPage loginPage;
    HomePage homePage;

    public EdostavkaStep(ChromeDriver driver) {

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    public void phoneInputFieldPlaceholderText() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCloseButton();
    }

    public void passwordInputFieldPlaceholderText() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField()
                .clickCloseButton();
    }

    public void emptyPhoneField() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickGetCodeButton()
                .clickCloseButton();
    }

    public void fillIncorrectPhoneAndPassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickSubmitButton()
                .clickCloseButton();
    }

    public void fillCorrectPhoneAndEmptyPassword(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .clickSubmitButton()
                .clickCloseButton();
    }

    public void fillCorrectPasswordAndEmptyPhone(String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickSubmitButton()
                .clickCloseButton();
    }

    public void clickEyeIconToShowPassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickEyeIconToShowPassword()
                .clickCloseButton();
    }

    public void clickEyeIconToHidePassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickEyeIconToShowPassword()
                .clickEyeIconToHidePassword()
                .clickCloseButton();
    }

    public void logInWithGetCodeButton(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickGetCodeButton()
                .clickCloseButton();
    }

    public void forgotPasswordButton(String phone, String lastName) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField()
                .clickForgotPasswordButton()
                .sendKeysPhoneFieldForgotPasswordPage(phone)
                .sendKeysLastNameField(lastName)
                .clickGetCodeButtonForgotPasswordPage()
                .clickCloseButton();
    }

    public void clickStocksMenuItem() {
        homePage
                .acceptCookieButton()
                .clickStocksMenuItem();

        loginPage.clickCloseButton();
    }

    public void clickProductsMenuItem() {
        homePage
                .acceptCookieButton()
                .clickGoodLuckProductsMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickRecipesMenuItem() {
        homePage
                .acceptCookieButton()
                .clickRecipesMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickFruitMenuItem() {
        homePage
                .acceptCookieButton()
                .clickFruitMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickCheeseMenuItem() {
        homePage
                .acceptCookieButton()
                .clickCheeseMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickMeatsMenuItem() {
        homePage
                .acceptCookieButton()
                .clickFarmMeatsMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickVeganMenuItem() {
        homePage
                .acceptCookieButton()
                .clickVeganMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickBabyFoodMenuItem() {
        homePage
                .acceptCookieButton()
                .clickBabyFoodMenuItem();
        loginPage.clickCloseButton();
    }

    public void clickDiapersItem() {
        homePage
                .acceptCookieButton()
                .clickDiapersMenuItem();
        loginPage.clickCloseButton();
    }
}
