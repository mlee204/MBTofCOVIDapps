package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class T_CPage_6 {
    AndroidDriver<WebElement> driver;

    public T_CPage_6(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By onBoardingStage6 = MobileBy.AccessibilityId("Onboarding stage 6 of 8");

    public void checkIfInTCPage() {
        System.out.println("Check if in TC Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage6, 10);
    }



}
