import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpTest {

    WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman Yarmolenko\\IdeaProjects\\Selen1um\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.fido.ca/phones");


    }
    public void tearDown(){
        driver.quit();

    }

}
