import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Base.BaseTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tests extends BaseTest {

    @Test(priority = 1)
    @Description("Enuygun Flight go to home page")
    public void checkHomePage() {
        log.info("--> Page loading");
        homePage.loadPage();
        log.info("--> Page loaded");
        Assert.assertEquals(driver.getTitle(), "Uçak Bileti Bul, Ucuz Uçak Bileti Fiyatları | ENUYGUN");
        log.info(driver.getTitle() + "--> on the HomePage");
    }

    @Test(priority = 2)
    @Description("Parametric city name is entered")
    public void checkTextOriginInput() {
        homePage.clickOriginInput();
        log.info("--> Origin input box clicked");
        homePage.textOriginInput();
        log.info("--> Origin info written in the origin input box");
        Assert.assertEquals(homePage.getOrigin(), homePage.assertTextOriginInput());
    }

    @Test(priority = 3)
    @Description("Click on the first of the results")
    public void checkSelectOriginListFirstElement() {
        homePage.selectOriginListFirstElement();
        log.info("--> Origin list select first element");

    }

    @Test(priority = 4)
    @Description("Parametric abroad city name is entered")
    public void checkTextDestinationInput() {
        homePage.clickDestinationInput();
        log.info("--> Destination input box clicked");
        homePage.textDestinationInput();
        log.info("--> Destination info written in the destination input box");
    }

    @Test(priority = 5)
    @Description("Click on the first of the results")
    public void checkSelectDestinationListFirstElement() {
        homePage.selectDestinationListFirstElement();
        log.info("--> Destination list select first element");
    }

    @Test(priority = 6)
    @Description("Parametric departure date input")
    public void checkDateInput() {
        homePage.dateInput();
        log.info("--> Click on the Departure Date input field");
    }

    @Test(priority = 7)
    @Description("Departure date information selected")
    public void checkDepartureDate() {
        homePage.departureDate(homePage.getDepartureDate());
        log.info("--> Departure date information selected");
    }

    @Test(priority = 8)
    @Description("Parametric return date input")
    public void checkDateOut() {
        homePage.dateOut();
        log.info("--> Click on the Return Date input field");
    }

    @Test(priority = 9)
    @Description("Return date information selected")
    public void checkDateOutClick() {
        homePage.departureDate(homePage.getReturnDate());
        log.info("--> Return date information selected");
    }

    @Test(priority = 10)
    @Description("Click transit flight button")
    public void checkTransitFilterCheckBox(){
        homePage.clickTransitFilterCheckBox(homePage.isDirect());
        log.info("--> Click transit flight button");
    }

    @Test(priority = 11)
    @Description("Click on find cheap ticket button")
    public void checkFindCheapBtnClick() {
        homePage.clickFindCheapTicketsBtn();
        log.info("--> Click on find cheap ticket button");
    }

    @Test(priority = 12)
    @Description("non-stop flights selected")
    public void checkFilterTransfer() {
        flightListPage.filterTransfer();
        log.info("--> non-stop flights selected");

    }

    @Test(priority = 13)
    @Description("Departure flight selected")
    public void checkSelectDepartureFlight() {
        flightListPage.selectDepartureFlight();
        log.info("--> Departure flight selected");
    }

    @Test(priority = 14)
    @Description("Return flight selected")
    public void checkSelectReturnFlight(){
        flightListPage.selectReturnFlight();
        log.info("--> Return flight selected");
    }

    @Test(priority = 15)
    @Description("Choose button clicked")
    public void checkSelectChooseButton(){
        flightListPage.selectChooseButton();
        log.info("--> Choose button clicked");
        Assert.assertTrue(flightListPage.assertChooseButton());
    }

}
