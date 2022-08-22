package pom.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.Base.BasePage;
import java.util.List;

public class HomePage extends BasePage {

    private final By originInput = By.xpath("//input[@id='OriginInput']");
    private final By originInputSection = By.id("react-autowhatever-OriginInput-section-0-item-0");
    private final By destinationInput = By.id("DestinationInput");
    private final By destinationInputSection = By.id("react-autowhatever-DestinationInput-section-0-item-0");
    private final By dateInputLocator = By.xpath("//*[@id=\"DepartureDate\"]");
    private final By dateOutLocator = By.xpath("//*[@id=\"ReturnDate\"]");
    private final By transitFilterCheckBox=By.xpath("//input[@id='transitFilter']");
    private final By findCheapTicketsBtnLocator = By.xpath("//*[@class='primary-btn block']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage loadPage() {
        loadPage("ucak-bileti/");
        return this;
    }

    public HomePage clickOriginInput() {
        wait.until(ExpectedConditions.elementToBeClickable(originInput)).click();
        return this;
    }

    public boolean assertOriginInput() {
        boolean assertOriginInput = wait.until(ExpectedConditions.elementToBeClickable(originInput)).isEnabled();
        return assertOriginInput;
    }

    public HomePage textOriginInput() {
        wait.until(ExpectedConditions.elementToBeClickable(originInput)).sendKeys(getOrigin());
        return this;
    }

    public String assertTextOriginInput(){
        String origintext= wait.until(ExpectedConditions.elementToBeClickable(originInput)).getAttribute("value");

        return origintext;
    }

    public HomePage selectOriginListFirstElement() {
        wait.until(ExpectedConditions.elementToBeClickable(originInputSection)).click();
        driver.findElement(originInput).getText();
        return this;
    }

    public HomePage clickDestinationInput() {
        wait.until(ExpectedConditions.elementToBeClickable(destinationInput)).click();
        return this;
    }

    public HomePage textDestinationInput() {
        wait.until(ExpectedConditions.elementToBeClickable(destinationInput)).sendKeys(getDestination());
        return this;
    }

    public HomePage selectDestinationListFirstElement() {
        wait.until(ExpectedConditions.elementToBeClickable(destinationInputSection)).click();
        return this;
    }

    public HomePage dateInput() {
        wait.until(ExpectedConditions.elementToBeClickable(dateInputLocator)).click();
        return this;
    }

    public HomePage departureDate(int day) {
        if (day <= 73) {
            forDate(day/35);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 102) {
            forDate(day/35);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 12);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 164) {
            forDate(day/35);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 73);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 223) {
            forDate(6);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 134);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 253) {
            forDate(7);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 165);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 284) {
            forDate(8);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 193);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 314) {
            forDate(9);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 224);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        } else if (day <= 345) {

            forDate(10);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 254);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        }else {
            forDate(11);
            List<WebElement> elements = driver.findElements(By.xpath("//div/table/tbody/tr/td[@aria-disabled='false']"));
            WebElement client = elements.get(day - 285);
            wait.until(ExpectedConditions.elementToBeClickable(client)).click();
        }

        return this;
    }

    public HomePage dateOut() {
        wait.until(ExpectedConditions.elementToBeClickable(dateOutLocator)).click();
        return this;
    }

    public boolean clickTransitFilterCheckBox(boolean isDirect){
        if (isDirect){
            wait.until(ExpectedConditions.elementToBeClickable(transitFilterCheckBox)).click();
        }else {}
        return isDirect;
    }

    public HomePage clickFindCheapTicketsBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(findCheapTicketsBtnLocator)).click();
        return this;
    }


}
