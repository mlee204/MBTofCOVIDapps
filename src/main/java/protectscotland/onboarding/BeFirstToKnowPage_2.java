package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class BeFirstToKnowPage_2 {

    AndroidDriver<WebElement> driver;


    public BeFirstToKnowPage_2(AndroidDriver<WebElement> driver ) {
        this.driver = driver;
    }

    private final By onBoardingStage2 = MobileBy.AccessibilityId("Onboarding stage 2 of 8");
    private final By whatIsCloseContactText = new UIActionHelper(driver).findElementText("What is close contact?");

    public void checkBeFirstToKnowPage() {
        System.out.println("Check if in Be first to know Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage2, 10);
    }

    public void checkForCloseContactText() {
        System.out.println("Check For an image of a close contact Text ");
        new WebDriverWaits(driver).checkElementVisible(whatIsCloseContactText, 10);
    }
}
