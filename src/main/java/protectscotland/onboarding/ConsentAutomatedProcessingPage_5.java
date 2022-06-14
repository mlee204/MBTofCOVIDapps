package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class ConsentAutomatedProcessingPage_5 {
    AndroidDriver<WebElement> driver;

    public ConsentAutomatedProcessingPage_5(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By onBoardingStage5 = MobileBy.AccessibilityId("Onboarding stage 5 of 8");
    private final By yesButton = MobileBy.AndroidUIAutomator("new UiSelector()" +
            ".className(\"android.widget.TextView\")." + "text(\"Yes\")");

    public void checkIfInAutomatedProcessingPage() {
        System.out.println("Check if in Consent Automated Processing Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage5, 10);
    }

    public void clickYes() {
        System.out.println("Click Yes");
        new WebDriverWaits(driver).waitForElementToBeClickable(yesButton, 10);
        driver.findElement(yesButton).click();
    }


}
