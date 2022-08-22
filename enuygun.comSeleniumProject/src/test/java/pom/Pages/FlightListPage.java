package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.Base.BasePage;

public class FlightListPage extends BasePage {
    private final By selectDirectFlight = By.xpath("//div[2]/div[2]/div/label[1][@class='custom-control custom-checkbox']");
    private final By onlyButton = By.xpath("//label[1]/button[text()='Sadece']");
    private final By originFlightPicker = By.xpath("//div[@data-booking-provider='" + getProvider() + "']");
    private final By returnFlightPicker = By.cssSelector("[class='roundTrip return active'] [data-booking-provider='"+getProvider()+"']");
    private final By chooseButton =By.cssSelector("[class='action-select-btn active btn btn-outline-success btn-sm']");

    public FlightListPage(WebDriver driver) {
        super(driver);
    }

    public FlightListPage filterTransfer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectDirectFlight)).isEnabled();
        actions.moveToElement(driver.findElement(selectDirectFlight)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(onlyButton)).click();
        return this;
    }

    public FlightListPage selectDepartureFlight() {
        wait.until(ExpectedConditions.elementToBeClickable(originFlightPicker)).click();
        return this;
    }

    public FlightListPage selectReturnFlight() {
        wait.until(ExpectedConditions.elementToBeClickable(returnFlightPicker));
        driver.findElements(returnFlightPicker).get(0).click();
        return this;
    }

    public FlightListPage selectChooseButton(){
        wait.until(ExpectedConditions.elementToBeClickable(chooseButton)).click();
        return this;
    }


}
