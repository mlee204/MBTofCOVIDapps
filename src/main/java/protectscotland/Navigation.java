package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class Navigation {
    AndroidDriver<WebElement> driver;

    public Navigation(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By backArrow = MobileBy.AccessibilityId("Back, Navigates to previous screen");
    private final By nextButton = MobileBy.AccessibilityId("Navigate to the next screen");
    private final By closeButton = MobileBy.AccessibilityId("Close, Navigates to dashboard");
    private final By settingsButton = MobileBy.AccessibilityId("Settings, Navigates to app settings");
    private final By closeChromeButton = MobileBy.id("com.android.chrome:id/close_button");
    private final By chromeUrlContainer = MobileBy.id("com.android.chrome:id/title_url_container");
    private final By chromeViewHolder = MobileBy.id("com.android.chrome:id/compositor_view_holder");


    public void clickBackArrow() {
        System.out.println("Click Back Arrow");
        new WebDriverWaits(driver).waitForElementToBeClickable(backArrow, 10);
        driver.findElement(backArrow).click();
    }

    public void clickNext() {
        System.out.println("Click Next");
        new WebDriverWaits(driver).waitForElementToBeClickable(nextButton, 10);
        driver.findElement(nextButton).click();

    }

    public void clickClose() {
        System.out.println("Click Close");
        new WebDriverWaits(driver).waitForElementToBeClickable(closeButton, 10);
        driver.findElement(closeButton).click();

    }

    public void clickSettings() {
        System.out.println("Click Settings");
        new WebDriverWaits(driver).waitForElementToBeClickable(settingsButton, 10);
        driver.findElement(settingsButton).click();

    }

    public void clickCloseWebButton() {
        System.out.println("Click Close Chrome Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(closeChromeButton, 10);
        driver.findElement(closeChromeButton).click();
    }

    public void checkInChromeWebBrowser () {
        System.out.println("Check Chrome URl View");
        new WebDriverWaits(driver).checkElementVisible(chromeUrlContainer, 10);
    }

    public void checkInChromeExternalWebBrowser () {
        System.out.println("Check Chrome External URl View");
        new WebDriverWaits(driver).checkElementVisible(chromeViewHolder, 10);
    }

}
