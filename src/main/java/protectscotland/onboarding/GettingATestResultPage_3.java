package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class GettingATestResultPage_3 {

    AndroidDriver<WebElement> driver;

    public GettingATestResultPage_3(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By howDoIAddMyResult = MobileBy.AccessibilityId("Shows details about how to add test result");
    private final By onBoardingStage3 = MobileBy.AccessibilityId("Onboarding stage 3 of 8");
    private final By positiveTestResultImage = MobileBy.AccessibilityId("Illustration of example message on phone showing that you tested positive for COVID-19.");

    public void checkIfInGettingATestResultPage() {
        System.out.println("Check if in getting a test result Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage3, 10);
    }

    public void checkForForPositiveTestResultImage() {
        System.out.println("Check if in how do i add my result Page");
        new WebDriverWaits(driver).checkElementVisible(positiveTestResultImage, 10);
    }

    public void clickHowToAddMyTestResult() {
        System.out.println("Click Terms And Conditions");
        new WebDriverWaits(driver).waitForElementToBeClickable(howDoIAddMyResult, 10);
        driver.findElement(howDoIAddMyResult).click();
    }
}
