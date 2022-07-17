import Pages.SearchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends SetUpTest {

    SearchPage searchPage;

    @BeforeMethod
   public void goToTargetPage(){
        setUp();
        searchPage = new SearchPage(driver);
    }

    @AfterMethod
    public void shutDown(){
        tearDown();
    }


//   @Test
//   public void printPrice(){
//       searchPage.printPrice();

//   }

    @Test
    public void printPriceList(){
        searchPage.printPrice2();
    }

}
