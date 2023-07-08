package lenkevich.edostavka.tests;

import lenkevich.edostavka.pages.RegistrationPage;
import lenkevich.edostavka.steps.EdostavkaStep;
import lenkevich.edostavka.pages.HomePage;
import lenkevich.edostavka.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestsEdostavka {
    ChromeDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    EdostavkaStep edostavkaStep;
    RegistrationPage registrationPage;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://edostavka.by/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        edostavkaStep = new EdostavkaStep(driver);
        registrationPage = new RegistrationPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

  @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
