package protectscotland.hometour;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class AddCode {
    AndroidDriver<WebElement> driver;

    public AddCode(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By homeTourStepFour = MobileBy.AccessibilityId("Dashboard tour - Add Test Code");

    public void checkHomeTourStepFourPageVisibility() {
        System.out.println("Check On Home Tour (Active) stage Four element is Visible");
        new WebDriverWaits(driver).checkElementVisible(homeTourStepFour, 10);
    }
}
