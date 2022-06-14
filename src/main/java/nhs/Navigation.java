package nhs;

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

    private final By backArrow = MobileBy.AccessibilityId("Go back");
    private final By closeX = MobileBy.AccessibilityId("Close");
    private final By closeChromeButton = MobileBy.id("com.android.chrome:id/close_button");
    private final By chromeUrlContainer = MobileBy.id("com.android.chrome:id/title_url_container");

    public void clickBackArrow() {
        System.out.println("Click Back Arrow");
        new WebDriverWaits(driver).waitForElementToBeClickable(backArrow, 10);
        driver.findElement(backArrow).click();
    }

    public void clickCloseX() {
        System.out.println("Click Close X");
        new WebDriverWaits(driver).waitForElementToBeClickable(closeX, 10);
        driver.findElement(closeX).click();
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



}
