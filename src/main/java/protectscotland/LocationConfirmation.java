package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class LocationConfirmation
{
    AndroidDriver<WebElement> driver;

    public LocationConfirmation(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By yesButton = MobileBy.AccessibilityId("Yes");
    private final By noButton = MobileBy.AccessibilityId("No");
    private final By locationContainer = MobileBy.AccessibilityId("Please confirm your location");

    private final By LocationWarningOk = MobileBy.id("android:id/button1");
    private final By invalidLocationPopup = MobileBy.id("android:id/parentPanel");

    public void clickYes() {
        System.out.println("Click Yes");
        new WebDriverWaits(driver).waitForElementToBeClickable(yesButton, 10);
        driver.findElement(yesButton).click();
    }

    public void clickNo() {
        System.out.println("Click No");
        new WebDriverWaits(driver).waitForElementToBeClickable(noButton, 10);
        driver.findElement(noButton).click();
    }

    public void clickOkToWarningMessage() {
        System.out.println("Click Okay");
        new WebDriverWaits(driver).waitForElementToBeClickable(LocationWarningOk, 10);
        driver.findElement(LocationWarningOk).click();
    }

    public void checkLocationPageVisibility() {
        System.out.println("Check For location page container");
        new WebDriverWaits(driver).checkElementVisible(locationContainer, 10);
    }

    public void checkForInvalidLocationPopup() {
        System.out.println("Check For Invalid Location popup Message");
        new WebDriverWaits(driver).checkElementVisible(invalidLocationPopup, 10);
    }
}
