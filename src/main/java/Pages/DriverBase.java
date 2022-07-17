package Pages;

import org.openqa.selenium.WebDriver;

public class DriverBase {

    WebDriver driver;

    DriverBase(WebDriver driver){
        this.driver = driver;
    }


    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

}
