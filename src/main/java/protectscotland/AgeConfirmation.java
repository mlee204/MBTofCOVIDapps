package protectscotland;

import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AgeConfirmation {

    AndroidDriver<WebElement> driver;

    public AgeConfirmation(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By over16Button = MobileBy.AccessibilityId("I am 16 or older, Confirms you are 16 or older");
    private final By under12Button = MobileBy.AccessibilityId("I am under 12, Confirms you are under 12");
    private final By age12And15Button = MobileBy.AccessibilityId("I am 12 - 15, Confirms you are 12 to 15 years old");

    private final By ageConfirmationContainer = MobileBy.AccessibilityId("Please confirm your age");
    private final By parentRequiredContainer = MobileBy.AccessibilityId("Age Sorting for age group under 12");
    private final By parentOptionalContainer = MobileBy.AccessibilityId("Age Sorting for age group 12 - 15");
    private final By secondarySchoolContainer = MobileBy.AccessibilityId("Please confirm if you have left primary school");
    private final By confirmAgePopup = MobileBy.id("android:id/parentPanel");

    private final By over16Warning = MobileBy.id("android:id/button1");


    public void clickOver16() {
        System.out.println("Click to Navigate to click over");
        new WebDriverWaits(driver).waitForElementToBeClickable(over16Button, 10);
        driver.findElement(over16Button).click();
    }

    public void clickUnder12() {
        System.out.println("Click to Navigate to click under");
        new WebDriverWaits(driver).waitForElementToBeClickable(under12Button, 10);
        driver.findElement(under12Button).click();
    }

    public void clickAgeBetween12And15() {
        new WebDriverWaits(driver).waitForElementToBeClickable(age12And15Button, 10);
        driver.findElement(age12And15Button).click();
    }

    public void clickOkToWarningMessage() {
        System.out.println("Click Okay");
        new WebDriverWaits(driver).waitForElementToBeClickable(over16Warning, 10);
        driver.findElement(over16Warning).click();
    }

    public void checkUnder12ButtonVisibility() {
        System.out.println("CHeck Button Is Visible");
        new WebDriverWaits(driver).checkElementVisible(under12Button, 10);
    }

    public void checkAgeConformation() {
        System.out.println("Check for age confirmation container");
        new WebDriverWaits(driver).checkElementVisible(ageConfirmationContainer, 10);
    }

    public void checkForAgeConfirmationPopup() {
        System.out.println("Check age confirm popup");
        new WebDriverWaits(driver).checkElementVisible(confirmAgePopup, 10);
    }

    public void checkIfInParentRequiredPage() {
        System.out.println("Check For Parent required container");
        new WebDriverWaits(driver).checkElementVisible(parentRequiredContainer, 10);
    }

    public void checkIfInParentsOptionalPage() {
        System.out.println("Check For Parent optional container");
        new WebDriverWaits(driver).checkElementVisible(parentOptionalContainer, 10);
    }

    public void checkForSecondarySchoolConfirmationContainer() {
        System.out.println("Check For Secondary School Confirmation Container");
        new WebDriverWaits(driver).checkElementVisible(secondarySchoolContainer, 10);
    }

}
