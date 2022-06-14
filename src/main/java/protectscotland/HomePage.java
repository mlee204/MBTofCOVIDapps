package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class HomePage {

    AndroidDriver<WebElement> driver;

    public HomePage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By clickClose = MobileBy.AccessibilityId("Close, Closes notification");
    private final By turnCovid = MobileBy.AccessibilityId("Turn on, Turn on COVID-19 Exposure Notifications");
    private final By homePageConfirmText = new UIActionHelper(driver).findElementText("Keep Bluetooth and Location on");
    private final By bluetoothPopupPanel = MobileBy.id("com.google.android.gms:id/parentPanel");
    private final By homePageTracingNotActiveConfirmText = new UIActionHelper(driver).findElementText("Tracing is not active, so this app won’t work");

    // declare buttons
    private final By shareAndProtectText = new UIActionHelper(driver).findElementText("Share and Protect");
    private final By aboutThisAppText = new UIActionHelper(driver).findElementText("About this App");
    private final By addTetCodeText = new UIActionHelper(driver).findElementText("Add your Test Result Code");

    // external links
    private final By notFeelingWellLink = MobileBy.AccessibilityId("Not feeling well?, Check if you have COVID-19 symptoms and book a test");
    private final By restrictionsLink = MobileBy.AccessibilityId("Restrictions, Check COVID-19 restrictions in your part of Scotland");

    // tracing links
    private final By tracingActive = new UIActionHelper(driver).findElementTextExact("Active");
    private final By tracingInactive = new UIActionHelper(driver).findElementTextExact("Not active");


    public void clickClose() {
        System.out.println("Click Close Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(clickClose, 10);
        driver.findElement(clickClose).click();
    }

    public void clickTurnOn() {
        System.out.println("Click Turn On");
        new WebDriverWaits(driver).waitForElementToBeClickable(turnCovid, 10);
        driver.findElement(turnCovid).click();
    }

    public void checkForTurnONExposureNotificationsPopup() {
        System.out.println("Check For turn on exposure notifications Popup");
        new WebDriverWaits(driver).checkElementVisible(bluetoothPopupPanel, 10);
    }

    public void checkForExposureNotifications() {
        System.out.println("Check for Exposure Notifications");
        new WebDriverWaits(driver).checkElementVisible(clickClose, 10);
    }

    public void checkInHomePage() {
        System.out.println("Check in Home page");
        new WebDriverWaits(driver).checkElementVisible(homePageConfirmText, 10);
    }

    public void checkForHomePageTracingActive() {
        System.out.println("Check in Home page (Tracing Active)");
        new WebDriverWaits(driver).checkElementVisible(tracingActive, 10);
    }

    // click buttons

    public void clickShareAndProtect() {
        System.out.println("Click Share and Protect");
        new WebDriverWaits(driver).waitForElementToBeClickable(shareAndProtectText, 10);
        driver.findElement(shareAndProtectText).click();
    }

    public void clickAboutThisApp() {
        System.out.println("Click About This App");
        new WebDriverWaits(driver).waitForElementToBeClickable(aboutThisAppText, 10);
        driver.findElement(aboutThisAppText).click();
    }

    public void clickAddTestCode() {
        System.out.println("Click Add test code");
        new WebDriverWaits(driver).waitForElementToBeClickable(addTetCodeText, 10);
        driver.findElement(addTetCodeText).click();
    }

    public void clickNotFeelingWellLink() {
        System.out.println("Click Not Feeling well link");
        new WebDriverWaits(driver).waitForElementToBeClickable(notFeelingWellLink, 10);
        driver.findElement(notFeelingWellLink).click();
    }

    public void clickRestrictionsLink() {
        System.out.println("Click restrictions link");
        new WebDriverWaits(driver).waitForElementToBeClickable(restrictionsLink, 10);
        driver.findElement(restrictionsLink).click();
    }

    public void clickTracingActive() {
        System.out.println("Click Tracing Active");
        new WebDriverWaits(driver).waitForElementToBeClickable(tracingActive, 10);
        driver.findElement(tracingActive).click();
    }

    public void clickTracingInactive() {
        System.out.println("Click Tracing Inactive");
        new WebDriverWaits(driver).waitForElementToBeClickable(tracingInactive, 10);
        driver.findElement(tracingInactive).click();
    }

}
