package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class PrivacyInfoPage_4 {
    AndroidDriver<WebElement> driver;

    public PrivacyInfoPage_4(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By onBoardingStage4 = MobileBy.AccessibilityId("Onboarding stage 4 of 8");

    public void checkIfInPrivacyInfoPage() {
        System.out.println("Check if in Privacy Info Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage4, 10);
    }

}
