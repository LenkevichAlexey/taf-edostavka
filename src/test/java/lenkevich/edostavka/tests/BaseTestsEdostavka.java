package lenkevich.edostavka.tests;

import lenkevich.edostavka.driver.DriverSingleton;
import lenkevich.edostavka.pages.HomePage;
import lenkevich.edostavka.pages.LoginPage;
import lenkevich.edostavka.pages.RegistrationPage;
import lenkevich.edostavka.steps.EdostavkaStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestsEdostavka {
    LoginPage loginPage;
    HomePage homePage;
    EdostavkaStep edostavkaStep;
    RegistrationPage registrationPage;

    @BeforeEach
    public void warmUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        edostavkaStep = new EdostavkaStep();
        registrationPage = new RegistrationPage();
    }

    @AfterEach
    public void tearsDown() {
        DriverSingleton.quit();
    }
}
