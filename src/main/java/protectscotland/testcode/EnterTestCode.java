package protectscotland.testcode;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class EnterTestCode {
    AndroidDriver<WebElement> driver;

    public EnterTestCode(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By enterTestCodeTextBox = MobileBy.AccessibilityId("Test Code input, Insert Test Code");

    private final By invalidCodeMessage = new UIActionHelper(driver).findElementText("Invalid code");

    public void checkInEnterTestCodePage() {
        System.out.println("Check for elements in Enter Test Code Text Box");
        new WebDriverWaits(driver).checkElementVisible(enterTestCodeTextBox, 10);
    }

    public void checkForInvalidCodeMessage() {
        System.out.println("Check For invalid code message");
        new WebDriverWaits(driver).checkElementVisible(invalidCodeMessage, 10);
    }

    public void enterTestCodeInvalid() {
        System.out.println("Enter Invalid Test code");
        new WebDriverWaits(driver).waitForElementToBeClickable(enterTestCodeTextBox, 10);
        driver.findElement(enterTestCodeTextBox).sendKeys("555555");
    }

    public void clearTextBox() {
        System.out.println("Clear Text Box");
        new WebDriverWaits(driver).waitForElementToBeClickable(enterTestCodeTextBox, 10);
        driver.findElement(enterTestCodeTextBox).clear();
    }

}
