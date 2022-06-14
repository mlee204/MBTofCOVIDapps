package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class ShareAndProtect {
    AndroidDriver<WebElement> driver;

    public ShareAndProtect(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By shareThisAppButton = MobileBy.AccessibilityId("Share this App");
    private final By restrictionsInYourAreaText = new UIActionHelper(driver).findElementText("Restrictions in your area");


    public void clickShareThisAppButton() {
        System.out.println("Click I Want To Leave");
        new WebDriverWaits(driver).waitForElementToBeClickable(shareThisAppButton, 10);
        driver.findElement(shareThisAppButton).click();
    }

    public void clickRestrictionsInYourArea() {
        System.out.println("Click Restrictions In Your Area");
        new WebDriverWaits(driver).waitForElementToBeClickable(restrictionsInYourAreaText, 10);
        driver.findElement(restrictionsInYourAreaText).click();
    }

    public void checkInShareAndProtectPageVisibility() {
        new WebDriverWaits(driver).checkElementVisible(shareThisAppButton, 10);
    }

}
