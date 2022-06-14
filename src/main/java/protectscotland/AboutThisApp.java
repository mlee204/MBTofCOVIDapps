package protectscotland;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class AboutThisApp {

    AndroidDriver<WebElement> driver;

    public AboutThisApp(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }
    private final By moreAboutScamsButton = MobileBy.AccessibilityId("More about avoiding scams");
    private final By moreAboutPrivacyNoticeButton = MobileBy.AccessibilityId("More about Privacy Notice");

    private final By howDoesAppWorkText = new UIActionHelper(driver).findElementText("How does this app work?");
    private final By moreAboutThisAppText = new UIActionHelper(driver).findElementText("Read more about this app and the technology used");

    public void checkABoutThisAppPageVisibility() {
        System.out.println("Check On Home Tour (Active) stage three element is Visible");
        new WebDriverWaits(driver).checkElementVisible(howDoesAppWorkText, 10);
    }

    public void clickAvoidingScam() {
        System.out.println("Click Avoid Scams Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(moreAboutScamsButton, 10);
        driver.findElement(moreAboutScamsButton).click();
    }

    public void clickPrivacyNotice() {
        System.out.println("Click Privacy Notice Button");
        new WebDriverWaits(driver).waitForElementToBeClickable(moreAboutPrivacyNoticeButton, 10);
        driver.findElement(moreAboutPrivacyNoticeButton).click();
    }

    public void clickMoreAppThisApp() {
        System.out.println("Click more about this app");
        new WebDriverWaits(driver).waitForElementToBeClickable(moreAboutThisAppText, 10);
        driver.findElement(moreAboutThisAppText).click();
    }


}
