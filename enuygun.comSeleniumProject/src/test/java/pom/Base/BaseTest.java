package pom.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pom.Factory.DriverManager;
import pom.Pages.FlightListPage;
import pom.Pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    public HomePage homePage;
    public FlightListPage flightListPage;

    @BeforeClass
    public void setup(){
        driver = new DriverManager().initializeDriver();
        homePage = new HomePage(driver);
        flightListPage = new FlightListPage(driver);
    }

    @BeforeMethod
    public void initializeDriver() {
        driver = new DriverManager().initializeDriver();
    }

//  @AfterMethod
//  public void quitDriver() {
//       driver.quit();
//   }
}
