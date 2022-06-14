package protectscotland.hometour;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class ShareAndProtect {
    AndroidDriver<WebElement> driver;

    public ShareAndProtect(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By homeTourStepTwo = MobileBy.AccessibilityId("Dashboard tour - Share and Protect");

    public void checkHomeTourStepTwoPageVisibility() {
        System.out.println("Check On Home Tour (Active) stage two element is Visible");
        new WebDriverWaits(driver).checkElementVisible(homeTourStepTwo, 10);
    }
}
