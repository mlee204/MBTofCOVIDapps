package protectscotland.testcode;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class AddTestCode {

    AndroidDriver<WebElement> driver;

    public AddTestCode(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }
    private final By bookATestButton = MobileBy.AccessibilityId("Book a Test");
    private final By addATestCodeButton = MobileBy.AccessibilityId("Add Test Code");
    private final By moreAboutSelfIsolation = MobileBy.AccessibilityId("I’ve tested positive, Tell me more about self-isolation");


    public void checkInAddTestCodePage() {
        System.out.println("Check for elements in Add Test Code Page");
        new WebDriverWaits(driver).checkElementVisible(addATestCodeButton, 10);
    }


    public void clickAddATestCode() {
        System.out.println("Click Add a test code Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(addATestCodeButton, 10);
        driver.findElement(addATestCodeButton).click();
    }

    public void clickBookATestButton() {
        System.out.println("Click Book a Test  Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(bookATestButton, 10);
        driver.findElement(bookATestButton).click();
    }

    public void clickTellMeMoreAboutSelfIsolation() {
        System.out.println("Click Tell MeMore About Self Isolation");
        new WebDriverWaits(driver).waitForElementToBeClickable(moreAboutSelfIsolation, 10);
        driver.findElement(moreAboutSelfIsolation).click();
    }


}
