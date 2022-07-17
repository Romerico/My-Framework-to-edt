package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends DriverBase {
    //const
    public SearchPage(WebDriver driver) {
        super(driver);
    }


    //locator
    By price = By.xpath("(//p[text() = 'iPhone 12 mini']//following::div[1]//p[contains(text(),'Full Price')])");
    By price2 = By.xpath("(//p[text() = 'iPhone 12 mini']//following::div[1]//p[contains(text(),'Full Price')])[2]");

    //    String priceSingle = "(//p[text() = 'iPhone 12 mini']//following::div[1]//p[contains(text(),'Full Price')])['$$']";
    //find out how to loop over singular elements
//    By pricePrintPrice = By.xpath("//p[text() = 'iPhone 12 mini']//following::div[1]//p[contains(text(),'Full Price')]");
    By dropdown = By.xpath("//span[text()='Shop']");

    //methods
    public void printPrice() {

        List<WebElement> elements = driver.findElements(price);
        System.out.println(elements);
    }

//    public void goToPhonePage(int index) {
//        WebElement indexDropdown = driver.findElement(dropdown);
//        Select select = new Select(indexDropdown);
//        select.selectByIndex(index);
//    }

    public void printPrice2() {
        List<String> phonePrice = new ArrayList<>();
        List<WebElement> text = driver.findElements(price);

        for (int i = 0; i < text.size(); i++) {
            phonePrice.add(text.get(i).getText());
            text.get(i).getText();


            //*********************
//        List<WebElement> text = driver.findElements(price);
//        int i;
//
//        for (i = 0; i <= text.size(); i++) {
//
//            driver.findElement(By.xpath(priceSingle.replace("$$", i ))).getText();
//        }

        }
    }
}







