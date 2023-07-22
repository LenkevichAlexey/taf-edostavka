package lenkevich.edostavka.tests;

import lenkevich.edostavka.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EdostavkaTest extends BaseTestsEdostavka {

    @Test
    public void testPhoneInputFieldPlaceholderText() {

        edostavkaStep.phoneInputFieldPlaceholderText();
        String actualResult = loginPage.getPhoneInputFieldPlaceholderText();
        Assertions.assertEquals(" (__) ___-__-__", actualResult);
    }

    @Test
    public void testPasswordInputFieldPlaceholderText() {

        edostavkaStep.passwordInputFieldPlaceholderText();
        String actualResult = loginPage.getResultTextInPasswordInputField();
        Assertions.assertEquals("Пароль", actualResult);
    }

    @Test
    public void testOnlyEmptyPhoneField() {

        edostavkaStep.emptyPhoneField();
        String actualResult = loginPage.getResultTextUsingIncorrectPhoneForLogin();
        Assertions.assertEquals("Ошибка\n" +
                "Пожалуйста, убедитесь, что правильно ввели телефон", actualResult);
    }

    @Test
    public void tesCorrectPhoneFieldAndEmptyPasswordField() {
        edostavkaStep.fillCorrectPhoneAndEmptyPassword(Util.generatePhone());
        String actualResult = loginPage.getResultTextUsingOnlyPhoneField();
        Assertions.assertEquals("Ошибка\n" +
                "Неверный логин или пароль", actualResult);
    }

    @Test
    public void testIncorrectPhoneAndPasswordFields() {

        edostavkaStep.fillIncorrectPhoneAndPassword(Util.generatePhone(), Util.generatePassword());
        String actualResult = loginPage.getResultTextUsingIncorrectDataForLogin();
        Assertions.assertEquals("Ошибка\n" +
                "Неверный логин или пароль", actualResult);
    }

    @Test
    public void testCorrectPasswordFieldAndEmptyPhoneFieldPassword() {

        edostavkaStep.fillCorrectPasswordAndEmptyPhone(Util.generatePassword());
        String actualResult = loginPage.getResultTextUsingOnlyPasswordField();
        Assertions.assertEquals("Ошибка\n" +
                "Неверный логин или пароль", actualResult);
    }

    @Test
    public void testEyeIconToShowPassword() {
        edostavkaStep.clickEyeIconToShowPassword(Util.generatePhone(), Util.generatePassword());
        String actualResult = loginPage.getVisiblePasswordViaEyeIcon();
        Assertions.assertEquals("text", actualResult);
    }

    @Test
    public void testEyeIconToHidePassword() {
        edostavkaStep.clickEyeIconToHidePassword(Util.generatePhone(), Util.generatePassword());
        String actualResult = loginPage.getInvisiblePasswordViaEyeIcon();
        Assertions.assertEquals("password", actualResult);
    }

    @Test
    public void testIncorrectLogInViaGetCodeButton() {
        edostavkaStep.logInWithGetCodeButton(Util.generatePhone());
        String actualResult = loginPage.getResultTextUsingOnlyIncorrectPhone();
        Assertions.assertEquals("Ошибка\n" +
                "Пожалуйста, убедитесь, что правильно ввели телефон", actualResult);
    }

    @Test
    public void testForgotPasswordFunctionality() {
        edostavkaStep.forgotPasswordButton(Util.generatePhone(), Util.generateLastName());
        String actualResult = loginPage.getResultTextUsingIncorrectDataForgotPassword();
        Assertions.assertEquals("Ошибка\n" +
                "Пожалуйста, убедитесь, что правильно ввели фамилию и телефон", actualResult);
    }

    @Test
    public void testClickStockMenuItem() {
        edostavkaStep.clickStocksMenuItem();
        String actualResult = homePage.getResultTextStockPage();
        Assertions.assertEquals("Акции", actualResult);
    }

    @Test
    public void testClickProductsMenuItem() {
        edostavkaStep.clickProductsMenuItem();
        String actualResult = homePage.getResultTextProductsPage();
        Assertions.assertEquals("Товары удачи. Тур 181", actualResult);
    }

    @Test
    public void testClickRecipesMenuItem() {
        edostavkaStep.clickRecipesMenuItem();
        String actualResult = homePage.getResultTextRecipesPage();
        Assertions.assertEquals("Рецепты", actualResult);
    }

    @Test
    public void testClickFruitMenuItem() {
        edostavkaStep.clickFruitMenuItem();
        String actualResult = homePage.getResultTextFruitPage();
        Assertions.assertEquals("Фрукты", actualResult);
    }

    @Test
    public void testClickCheeseMenuItem() {
        edostavkaStep.clickCheeseMenuItem();
        String actualResult = homePage.getResultTextCheesePage();
        Assertions.assertEquals("Сыры", actualResult);
    }

    @Test
    public void testClickMeatsMenuItem() {
        edostavkaStep.clickMeatsMenuItem();
        String actualResult = homePage.getResultTextMeatsPage();
        Assertions.assertEquals("Фермерские продукты", actualResult);
    }

    @Test
    public void testClickVeganMenuItem() {
        edostavkaStep.clickVeganMenuItem();
        String actualResult = homePage.getResultTextVeganPage();
        Assertions.assertEquals("Для вегетарианцев", actualResult);
    }

    @Test
    public void testClickBabyFoodMenuItem() {
        edostavkaStep.clickBabyFoodMenuItem();
        String actualResult = homePage.getResultTextBabyFoodPage();
        Assertions.assertEquals("Смеси, каши", actualResult);
    }

    @Test
    public void testClickDiapersMenuItem() {
        edostavkaStep.clickDiapersItem();
        String actualResult = homePage.getResultTextDiapersPage();
        Assertions.assertEquals("Подгузники", actualResult);
    }

    @Test
    public void testSearchFunctionality() {
        edostavkaStep.findItemInSearchField();
        String actualResult = homePage.getResultTextSearchField();
        Assertions.assertEquals("По запросу «Молоко» найдено 218 товаров", actualResult);

    }

    @Test
    public void testAddingItemToCart() {
        edostavkaStep.findAndClickPlusForAddingItemToCart();
        String actualResult = homePage.getResultTextMilkInCart();
        Assertions.assertEquals("Молоко «#Можно» без\u00ADлак\u00ADтоз\u00ADное, 3.2% 930 мл", actualResult);
    }

    @Test
    public void testAddingItemToCartViaPlus() {
        edostavkaStep.addItemToCartAndMultiply();
        String actualResult = homePage.getResultTextAddMilkUsingPlusInCart();
        Assertions.assertEquals("1,23 р. за шт", actualResult);
    }

    @Test
    public void testExpandCatalogMenu() {
        edostavkaStep.expandCatalogMenu();
        String actualResult = homePage.getExpandedCatalogMenu();
        Assertions.assertEquals("catalog_burger__blBLE catalog_burger__open__vbBg4", actualResult);
    }

    @Test
    public void testCreateAccountUsingIncorrectPhone() {
        edostavkaStep.createAccountUsingIncorrectPhone(Util.generatePhone());
        String actualResult = registrationPage.getResultTextUsingIncorrectPhoneInRegistrationFlow();
        Assertions.assertEquals("Ошибка\n" +
                "Мобильный телефон заполнен некорректно", actualResult);
    }

    @Test
    public void testCreateAccountUsingInvalidCharactersInNameField() {
        edostavkaStep.createAccountUsingInvalidCharactersInNameField(Util.generatePhone());
        String actualResult = registrationPage.getResultTextUsingInvalidCharactersInRegistrationFlow();
        Assertions.assertEquals("Ошибка\n" +
                "Cодержит недопустимые символы", actualResult);
    }

    @Test
    public void testCreateAccountUsingInvalidCharactersInLastNameField() {
        edostavkaStep.createAccountUsingInvalidCharactersInLastNameField(Util.generatePhone());
        String actualResult = registrationPage.getResultTextUsingInvalidCharactersInRegistrationFlow();
        Assertions.assertEquals("Ошибка\n" +
                "Cодержит недопустимые символы", actualResult);
    }

    @Test
    public void testDisabledCreateAccountButtonWhenNameFieldEmpty() {
        edostavkaStep.createAccountUsingEmptyNameField(Util.generatePhone());
        String actualResult = registrationPage.confirmDisabledCreateAccountButton();
        Assertions.assertEquals("true", actualResult);
    }

    @Test
    public void testDisabledCreateAccountButtonWhenLastNameFieldEmpty() {
        edostavkaStep.createAccountUsingEmptyLastNameField(Util.generatePhone());
        String actualResult = registrationPage.confirmDisabledCreateAccountButton();
        Assertions.assertEquals("true", actualResult);
    }

    @Test
    public void testDisabledCreateAccountButtonWhenPhoneFieldEmpty() {
        edostavkaStep.createAccountUsingEmptyPhoneField();
        String actualResult = registrationPage.confirmDisabledCreateAccountButton();
        Assertions.assertEquals("true", actualResult);
    }

    @Test
    public void testDisabledCreateAccountButtonWhenPasswordFieldEmpty() {
        edostavkaStep.createAccountUsingEmptyPasswordField(Util.generatePhone());
        String actualResult = registrationPage.confirmDisabledCreateAccountButton();
        Assertions.assertEquals("true", actualResult);
    }

    @Test
    public void testDisabledCreateAccountButtonWhenRepeatPasswordFieldEmpty() {
        edostavkaStep.createAccountUsingEmptyRepeatPasswordField(Util.generatePhone());
        String actualResult = registrationPage.confirmDisabledCreateAccountButton();
        Assertions.assertEquals("true", actualResult);
    }
}

