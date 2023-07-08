package lenkevich.edostavka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    String searchFieldLocator = "//*[@id='main_search_field']/div/div/form/input";
    String searchButtonLocator = "//*[@id='main_search_field']/div/div/form/button[1]";
    String addItemToCartLocator = "//*[@id='__next']/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[5]/div/button";
    String catalogItemLocator = "//*[@id='header__inner']/div[1]/div[2]/div[1]/div[1]/button";
    String cityFieldInModalLocator = "//input[@id='input_city' and following-sibling::label[text()='Населенный  пункт']]";
    String confirmCityFieldInModalLocator = "//button[@id='0-simple-bar' and text()='г. Минск']";
    String streetFieldInModalLocator = "//input[@id='input_city' and following-sibling::label[text()='Улица']]";
    String confirmStreetFieldInModalLocator = "//button[@id='0-simple-bar' and text()='3 Сентября']";
    String houseFieldInModalLocator = "//input[@autocomplete='new-password' and following-sibling::label[text()='Дом']]";
    String saveAddressButtonInModalLocator = "/html/body/div[5]/div/div[2]/div/div/div[3]/button";
    String sideCartMenuLocator = "//*[@id='__next']/div[3]/div[1]/div/ul";
    String cartMenuIconLocator = "//*[@id='__next']/div[3]/div[2]/section/div[2]/button";
    String plusButtonInCartLocator = "//*[@id='__next']/div[3]/div[2]/section/div[1]/div[2]/div/div[1]/div[2]/div/div/div/ul/li/div/div/div/span/div/div/button[2]";

    String textResultStocksPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Акции']";
    String textResultProductsPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Товары удачи. Тур 181']";
    String textResultRecipesPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Рецепты']";
    String textResultFruitPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Фрукты']";
    String textResultCheesePage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Сыры']";
    String textResultMeatsPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Фермерские продукты']";
    String textResultVeganPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Для вегетарианцев']";
    String textResultBabyFoodPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Смеси, каши']";
    String textResultDiapersPage = "//h1[@class='typography typography_tag_h1 typography_weight_700 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Подгузники']";
    String textResultSearchField = "//h1[@class='typography typography_tag_h1 typography_weight_600 heading_heading__text__gP6AN heading_heading__text_level_1__7_duQ' and text()='Молоко']";
    String textResultDeliveryAddress = "/html/body/div[5]/div/div[2]/div/div/div[1]/span";
    String expandedCatalogMenu = "//*[@id='nav-icon6']";
    String textResultAddMilkToCart = "//a[@class='product_name__Ogv_q' and text()='Молоко «#Можно» без\u00ADлак\u00ADтоз\u00ADное, 3.2%']";
    String textResultAddItemViaPlus = "//*[@id='__next']/div[3]/div[2]/section/div[1]/div[2]/div/div[1]/div[2]/div/div/div/ul/li/div/div/div[2]/span/div/span";

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

    public HomePage sendKeysSearchField(String str) {
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(str);
        return this;
    }

    public HomePage clickSearchButton() {
        driver.findElement(By.xpath(searchButtonLocator)).click();
        return this;
    }

    public HomePage clickAddToCartButton() {
        driver.findElement(By.xpath(addItemToCartLocator)).click();
        return this;
    }

    public HomePage sendKeysCityFieldInModal(String str) {
        driver.findElement(By.xpath(cityFieldInModalLocator)).sendKeys(str);
        return this;
    }

    public HomePage clickConfirmCityInModal() {
        driver.findElement(By.xpath(confirmCityFieldInModalLocator)).click();
        return this;
    }

    public HomePage sendKeysStreetFieldInModal(String str) {
        driver.findElement(By.xpath(streetFieldInModalLocator)).sendKeys(str);
        return this;
    }

    public HomePage clickConfirmStreetInModal() {
        driver.findElement(By.xpath(confirmStreetFieldInModalLocator)).click();
        return this;
    }

    public HomePage sendKeysHouseFieldInModal(String str) {
        driver.findElement(By.xpath(houseFieldInModalLocator)).sendKeys(str);
        return this;
    }

    public HomePage clickSaveAddressButtonInModal() {
        driver.findElement(By.xpath(saveAddressButtonInModalLocator)).click();
        return this;
    }

    public HomePage clickSideCartMenu() {
        driver.findElement(By.xpath(sideCartMenuLocator)).click();
        return this;
    }

    public HomePage clickCartMenuIcon() {
        driver.findElement(By.xpath(cartMenuIconLocator)).click();
        return this;
    }

    public HomePage clickPlusButtonInCart() {
        driver.findElement(By.xpath(plusButtonInCartLocator)).click();
        return this;
    }

    public HomePage clickCatalogMenuItem() {
        driver.findElement(By.xpath(catalogItemLocator)).click();
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

    public String getResultTextSearchField() {
        String resultField = driver.findElement(By.xpath(textResultSearchField)).getText();
        return resultField;
    }

    public String getResultTextDeliveryAddress() {
        String resultField = driver.findElement(By.xpath(textResultDeliveryAddress)).getText();
        return resultField;
    }

    public String getExpandedCatalogMenu() {
        WebElement expandedCatalog = driver.findElement(By.xpath(expandedCatalogMenu));
        return expandedCatalog.getAttribute("class");
    }

    public String getResultTextMilkInCart() {
        String resultField = driver.findElement(By.xpath(textResultAddMilkToCart)).getText();
        return resultField;
    }

    public String getResultTextAddMilkUsingPlusInCart() {
        String resultField = driver.findElement(By.xpath(textResultAddItemViaPlus)).getText();
        return resultField;
    }
}
