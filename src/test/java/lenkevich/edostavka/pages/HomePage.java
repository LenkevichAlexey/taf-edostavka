package lenkevich.edostavka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;
    String acceptCookieLocator = "/html/body/div[5]/div/div[2]/div/div[2]/button[2]";
    String stocksMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Акции']";
    String goodLuckProductsMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Товары удачи']";
    String recipesMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Рецепты']";
    String fruitMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Фрукты']";
    String cheeseMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Сыр']";
    String farmMeatsMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Фермерское мясо']";
    String veganMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Vegan']";
    String babyFoodMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Детское питание']";
    String diapersMenuLocator = "//a[@class='links_links__a__NX2VY' and text()='Подгузники']";


    String textResultStocksPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Акции']";
    String textResultProductsPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Товары удачи. Тур 180']";
    String textResultRecipesPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Рецепты']";
    String textResultFruitPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Фрукты']";
    String textResultCheesePage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Сыры']";
    String textResultMeatsPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Фермерские продукты']";
    String textResultVeganPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Для вегетарианцев']";
    String textResultBabyFoodPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Смеси, каши']";
    String textResultDiapersPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Подгузники']";




    public HomePage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public HomePage acceptCookieButton() {
        driver.findElement(By.xpath(acceptCookieLocator)).click();
        return this;
    }

    public HomePage clickStocksMenuItem() {
        driver.findElement(By.xpath(stocksMenuLocator)).click();
        return this;
    }

    public HomePage clickGoodLuckProductsMenuItem() {
        driver.findElement(By.xpath(goodLuckProductsMenuLocator)).click();
        return this;
    }

    public HomePage clickRecipesMenuItem() {
        driver.findElement(By.xpath(recipesMenuLocator)).click();
        return this;
    }

    public HomePage clickFruitMenuItem() {
        driver.findElement(By.xpath(fruitMenuLocator)).click();
        return this;
    }

    public HomePage clickCheeseMenuItem() {
        driver.findElement(By.xpath(cheeseMenuLocator)).click();
        return this;
    }

    public HomePage clickFarmMeatsMenuItem() {
        driver.findElement(By.xpath(farmMeatsMenuLocator)).click();
        return this;
    }

    public HomePage clickVeganMenuItem() {
        driver.findElement(By.xpath(veganMenuLocator)).click();
        return this;
    }

    public HomePage clickBabyFoodMenuItem() {
        driver.findElement(By.xpath(babyFoodMenuLocator)).click();
        return this;
    }

    public HomePage clickDiapersMenuItem() {
        driver.findElement(By.xpath(diapersMenuLocator)).click();
        return this;
    }




    public String getResultTextStockPage() {
        String resultField = driver.findElement(By.xpath(textResultStocksPage)).getText();
        return resultField;
    }

    public String getResultTextProductsPage() {
        String resultField = driver.findElement(By.xpath(textResultProductsPage)).getText();
        return resultField;
    }

    public String getResultTextRecipesPage() {
        String resultField = driver.findElement(By.xpath(textResultRecipesPage)).getText();
        return resultField;
    }

    public String getResultTextFruitPage() {
        String resultField = driver.findElement(By.xpath(textResultFruitPage)).getText();
        return resultField;
    }

    public String getResultTextCheesePage() {
        String resultField = driver.findElement(By.xpath(textResultCheesePage)).getText();
        return resultField;
    }

    public String getResultTextMeatsPage() {
        String resultField = driver.findElement(By.xpath(textResultMeatsPage)).getText();
        return resultField;
    }

    public String getResultTextVeganPage() {
        String resultField = driver.findElement(By.xpath(textResultVeganPage)).getText();
        return resultField;
    }

    public String getResultTextBabyFoodPage() {
        String resultField = driver.findElement(By.xpath(textResultBabyFoodPage)).getText();
        return resultField;
    }

    public String getResultTextDiapersPage() {
        String resultField = driver.findElement(By.xpath(textResultDiapersPage)).getText();
        return resultField;
    }
}
