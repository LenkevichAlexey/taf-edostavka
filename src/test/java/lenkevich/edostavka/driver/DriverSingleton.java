package lenkevich.edostavka.driver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static ChromeDriver driver;

    public static ChromeDriver getDriver() {
        if (driver == null){
            driver = new ChromeDriver();
            driver.get("https://edostavka.by/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        return driver;
    }

    private DriverSingleton(){

    }

    public  static void quit(){
        if(driver != null){
            driver.quit();
        }
    }
}
