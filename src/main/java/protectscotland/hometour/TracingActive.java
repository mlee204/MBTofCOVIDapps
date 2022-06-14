package protectscotland.hometour;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class TracingActive {
    AndroidDriver<WebElement> driver;
    public TracingActive(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By homeTourStepOne = MobileBy.AccessibilityId("Dashboard tour - Tracing");
    private final By tracingNotActiveText = new UIActionHelper(driver).findElementText("Not active");
    private final By tracingActiveText = new UIActionHelper(driver).findElementText("The app is all set up and tracing is on");

    public void checkHomeTourStepOnePageVisibility() {
        System.out.println("Check On Home Tour (Active) stage one element is Visible");
        new WebDriverWaits(driver).checkElementVisible(homeTourStepOne, 10);
    }

    public void checkHomeTourStartTracingNotActive() {
        System.out.println("Check in Home Tour (Tracing Not Active)");
        new WebDriverWaits(driver).checkElementVisible(tracingNotActiveText, 10);
    }

    public void checkHomeTourStartTracingActive() {
        System.out.println("Check in Home Tour (Tracing Active)");
        new WebDriverWaits(driver).checkElementVisible(tracingActiveText, 10);
    }

}
