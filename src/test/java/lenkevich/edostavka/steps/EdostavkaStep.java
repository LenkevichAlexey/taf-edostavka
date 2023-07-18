package lenkevich.edostavka.steps;

import lenkevich.edostavka.pages.HomePage;
import lenkevich.edostavka.pages.LoginPage;
import lenkevich.edostavka.pages.RegistrationPage;

public class EdostavkaStep {
    LoginPage loginPage;
    HomePage homePage;
    RegistrationPage registrationPage;

    public EdostavkaStep() {

        loginPage = new LoginPage();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
    }

    public void phoneInputFieldPlaceholderText() {
        homePage.acceptCookieButton();
        loginPage.clickLoginButton();
    }

    public void passwordInputFieldPlaceholderText() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField();
    }

    public void emptyPhoneField() {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickGetCodeButton();
    }

    public void fillIncorrectPhoneAndPassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickSubmitButton();
    }

    public void fillCorrectPhoneAndEmptyPassword(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .clickSubmitButton();
    }

    public void fillCorrectPasswordAndEmptyPhone(String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickSubmitButton();
    }

    public void clickEyeIconToShowPassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickEyeIconToShowPassword();
    }

    public void clickEyeIconToHidePassword(String phone, String password) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickLoginWithPasswordField()
                .sendKeysInputPasswordField(password)
                .clickEyeIconToShowPassword()
                .clickEyeIconToHidePassword();
    }

    public void logInWithGetCodeButton(String phone) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .sendKeysInputPhoneField(phone)
                .clickGetCodeButton();
    }

    public void forgotPasswordButton(String phone, String lastName) {
        homePage.acceptCookieButton();
        loginPage
                .clickLoginButton()
                .clickLoginWithPasswordField()
                .clickForgotPasswordButton()
                .sendKeysPhoneFieldForgotPasswordPage(phone)
                .sendKeysLastNameField(lastName)
                .clickGetCodeButtonForgotPasswordPage();
    }

    public void clickStocksMenuItem() {
        homePage
                .acceptCookieButton()
                .clickStocksMenuItem();
    }

    public void clickProductsMenuItem() {
        homePage
                .acceptCookieButton()
                .clickGoodLuckProductsMenuItem();
    }

    public void clickRecipesMenuItem() {
        homePage
                .acceptCookieButton()
                .clickRecipesMenuItem();
    }

    public void clickFruitMenuItem() {
        homePage
                .acceptCookieButton()
                .clickFruitMenuItem();
    }

    public void clickCheeseMenuItem() {
        homePage
                .acceptCookieButton()
                .clickCheeseMenuItem();
    }

    public void clickMeatsMenuItem() {
        homePage
                .acceptCookieButton()
                .clickFarmMeatsMenuItem();
    }

    public void clickVeganMenuItem() {
        homePage
                .acceptCookieButton()
                .clickVeganMenuItem();
    }

    public void clickBabyFoodMenuItem() {
        homePage
                .acceptCookieButton()
                .clickBabyFoodMenuItem();
    }

    public void clickDiapersItem() {
        homePage
                .acceptCookieButton()
                .clickDiapersMenuItem();
    }

    public void findItemInSearchField() {
        homePage
                .acceptCookieButton()
                .sendKeysSearchField("Молоко")
                .clickSearchButton();
    }

    public void findAndClickPlusForAddingItemToCart() {
        homePage
                .acceptCookieButton()
                .sendKeysSearchField("Молоко")
                .clickSearchButton()
                .clickAddToCartButton()
                .sendKeysCityFieldInModal("г. Минск ")
                .clickConfirmCityInModal()
                .sendKeysStreetFieldInModal("3 Сентября")
                .clickConfirmStreetInModal()
                .sendKeysHouseFieldInModal("12")
                .clickSaveAddressButtonInModal()
                .clickSideCartMenu()
                .clickCartMenuIcon();
    }

    public void addItemToCartAndMultiply() {
        homePage
                .acceptCookieButton()
                .sendKeysSearchField("Молоко")
                .clickSearchButton()
                .clickAddToCartButton()
                .sendKeysCityFieldInModal("г. Минск ")
                .clickConfirmCityInModal()
                .sendKeysStreetFieldInModal("3 Сентября")
                .clickConfirmStreetInModal()
                .sendKeysHouseFieldInModal("12")
                .clickSaveAddressButtonInModal()
                .clickSideCartMenu()
                .clickPlusButtonInCart();
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
