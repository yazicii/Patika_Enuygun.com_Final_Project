package pom.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pom.model.Features;
import java.time.Duration;

public class BasePage extends Features {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert softAssert;
    protected Actions actions;
    protected JavascriptExecutor jse;

    public BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
        jse = (JavascriptExecutor) driver;
        this.driver = driver;
        softAssert = new SoftAssert();
    }

    public void loadPage(String endPoint) {
        driver.get("https://www.enuygun.com/" + endPoint);
    }

    public void forDate(int a) {
        for (int i = 1; i <= a; i++) {
            WebElement ele = driver.findElement(By.xpath("//*/div[2][@role=\"button\"]"));
            ele.click();
        }
    }





}
