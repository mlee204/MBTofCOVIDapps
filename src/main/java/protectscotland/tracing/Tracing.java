package protectscotland.tracing;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class Tracing {
    AndroidDriver<WebElement> driver;

    public Tracing(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By turnOn = MobileBy.AccessibilityId("Turn on, Turn on COVID-19 Exposure Notifications");
    private final By pauseTracingButton = new UIActionHelper(driver).findElementText("I want to pause Tracing");
    private final By faqsLink = new UIActionHelper(driver).findElementText("FAQs");
    private final By tracingPageInfoText = new UIActionHelper(driver).findElementText("If you are in close contact");


    public void clickTurnOnTracing() {
        System.out.println("Click Restrictions In Your Area");
        new WebDriverWaits(driver).waitForElementToBeClickable(turnOn, 10);
        driver.findElement(turnOn).click();
    }

    public void clickFAQS() {
        System.out.println("Click FAQs");
        new WebDriverWaits(driver).waitForElementToBeClickable(faqsLink, 10);
        driver.findElement(faqsLink).click();
    }

    public void clickPauseTracing() {
        System.out.println("Click I want to pause Tracing");
        new WebDriverWaits(driver).waitForElementToBeClickable(pauseTracingButton, 10);
        driver.findElement(pauseTracingButton).click();
    }

    public void checkForTracingPageInfo() {
        new WebDriverWaits(driver).checkElementVisible(tracingPageInfoText, 10);
    }


    public void checkInTracingInactivePage() {
        new WebDriverWaits(driver).checkElementVisible(turnOn, 10);
    }

    public void checkInTracingActivePage() {
        new WebDriverWaits(driver).checkElementVisible(pauseTracingButton, 10);
    }
}
