package protectscotland.hometour;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class AboutThisAbout {
    AndroidDriver<WebElement> driver;

    public AboutThisAbout(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By homeTourStepThree = MobileBy.AccessibilityId("Dashboard tour - About this App");

    public void checkHomeTourStepThreePageVisibility() {
        System.out.println("Check On Home Tour (Active) stage three element is Visible");
        new WebDriverWaits(driver).checkElementVisible(homeTourStepThree, 10);
    }
}
