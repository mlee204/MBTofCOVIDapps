package protectscotland.tracing;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.utilities.UIActionHelper;
import qub.vg05.webdriver.WebDriverWaits;

public class PauseTracing {
    AndroidDriver<WebElement> driver;

    public PauseTracing(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By pauseTracingTracingTitle = new UIActionHelper(driver).findElementTextExact("Pause Tracing");

    private final By pauseTracingTracingButtonText= new UIActionHelper(driver).findElementTextExact("Pause Tracing now");

    private final By restartTracingButtonText = new UIActionHelper(driver).findElementTextExact("Restart Tracing");

    public void clickPauseTracingNow() {
        System.out.println("Click Pause Tracing Pausing now");
        new WebDriverWaits(driver).waitForElementToBeClickable(pauseTracingTracingButtonText, 10);
        driver.findElement(pauseTracingTracingButtonText).click();
    }

    public void clickRestartTracing() {
        System.out.println("Click Restart Tracing ");
        new WebDriverWaits(driver).waitForElementToBeClickable(restartTracingButtonText, 10);
        driver.findElement(restartTracingButtonText).click();
    }

    public void checkForPauseTracingPageTitle() {
        new WebDriverWaits(driver).checkElementVisible(pauseTracingTracingTitle, 10);
    }

    public void checkForRestartTracingButton() {
        new WebDriverWaits(driver).checkElementVisible(restartTracingButtonText, 10);
    }

}
