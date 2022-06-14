package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class HelpOthersPage_1 {

    AndroidDriver<WebElement> driver;

    public HelpOthersPage_1(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By onBoardingStage1 = MobileBy.AccessibilityId("Onboarding stage 1 of 8");

    public void checkInHelpOtherPage() {
        System.out.println("Check if In Help Other Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage1, 10);
    }

}
