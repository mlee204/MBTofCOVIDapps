package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class SettingsPage {
    AndroidDriver<WebElement> driver;

    public SettingsPage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By termsAndConditionsButton = MobileBy.AccessibilityId("View the terms and conditions");
    private final By datPrivacyButton = MobileBy.AccessibilityId("View the Data Privacy Information");
    private final By leaveButton = MobileBy.AccessibilityId("Leave the application");
    private final By backButton = MobileBy.AccessibilityId("Back, Navigates to previous screen");
    private final By iWantToLeaveButton = MobileBy.AccessibilityId("I want to leave, Exits the app and deletes all data");

    private final By over16Warning = MobileBy.id("android:id/button1");


    public void clickTermsAndConditions() {
        System.out.println("Click to Navigate to Terms And Conditions");
        new WebDriverWaits(driver).waitForElementToBeClickable(termsAndConditionsButton, 10);
        driver.findElement(termsAndConditionsButton).click();
    }

    public void clickDatPrivacy() {
        System.out.println("Click to Navigate to Data Privacy Info");
        new WebDriverWaits(driver).waitForElementToBeClickable(datPrivacyButton, 10);
        driver.findElement(datPrivacyButton).click();
    }

    public void clickLeave() {
        System.out.println("Click Leave");
        new WebDriverWaits(driver).waitForElementToBeClickable(leaveButton, 10);
        driver.findElement(leaveButton).click();
    }

    public void clickIWantToLeave() {
        System.out.println("Click I Want To Leave");
        new WebDriverWaits(driver).waitForElementToBeClickable(iWantToLeaveButton, 10);
        driver.findElement(iWantToLeaveButton).click();
    }

    public void checkSettingPageVisibility() {
        new WebDriverWaits(driver).checkElementVisible(termsAndConditionsButton, 10);
    }

    public void checkTermsAndConditionsPageVisibility() {
        new WebDriverWaits(driver).checkElementVisible(backButton, 10);
    }

    public void checkDataPrivacyPageVisibility() {
        new WebDriverWaits(driver).checkElementVisible(backButton, 10);
    }

    public void checkLeavePageVisibility() {
        new WebDriverWaits(driver).checkElementVisible(backButton, 10);
    }


}
