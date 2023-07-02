package lenkevich.edostavka.steps;

import lenkevich.edostavka.pages.HomePage;
import lenkevich.edostavka.pages.LoginPage;
import lenkevich.edostavka.pages.RegistrationPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdostavkaStep {
    LoginPage loginPage;
    HomePage homePage;
    RegistrationPage registrationPage;

    public EdostavkaStep(ChromeDriver driver) {

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
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

    public void findItemInSearchField() {
        homePage
                .acceptCookieButton()
                .sendKeysSearchField("Молоко")
                .clickSearchButton();
    }

    public void findAndClickPlusForAdddingItemToCart() {
        homePage
                .acceptCookieButton()
                .sendKeysSearchField("Молоко")
                .clickSearchButton()
                .clickAddToCartButton();
    }

    public void expandCatalogMenu() {
        homePage
                .acceptCookieButton()
                .clickCatalogMenuItem();
    }

    public void createAccountUsingIncorrectPhone(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!")
                .clickCreateAccountButton();
    }

    public void createAccountUsingInvalidCharactersInNameField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Qwert!")
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!")
                .clickCreateAccountButton();
    }

    public void createAccountUsingInvalidCharactersInLastNameField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysLastNameField("@2123QВ")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!")
                .clickCreateAccountButton();
    }

    public void createAccountUsingEmptyNameField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!");
    }

    public void createAccountUsingEmptyLastNameField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!");
    }

    public void createAccountUsingEmptyPhoneField() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPasswordField("Qwerty1!")
                .sendKeysConfirmPasswordField("Qwerty1!");
    }

    public void createAccountUsingEmptyPasswordField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysConfirmPasswordField("Qwerty1!");
    }

    public void createAccountUsingEmptyRepeatPasswordField(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickCreateAccountButton();
        registrationPage
                .clickRegistrationOnlyOnEdostavkaButton()
                .clickCheckBox()
                .clickSecondCheckBox()
                .clickSubmitButton()
                .clickContinueRegistrationButton()
                .sendKeysFirsNameField("Василий")
                .sendKeysLastNameField("Иванов")
                .sendKeysEmailField("test@test.com")
                .sendKeysPhoneField(phone)
                .sendKeysPasswordField("Qwerty1!");
    }
}
