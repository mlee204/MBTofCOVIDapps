package protectscotland.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class BluetoothPermissionPage_7 {
    AndroidDriver<WebElement> driver;

    public BluetoothPermissionPage_7(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By onBoardingStage7 = MobileBy.AccessibilityId("Onboarding stage 7 of 8");
    private final By bluetoothPopupPanel = MobileBy.id("com.google.android.gms:id/parentPanel");

    public void checkIfInBluetoothPermissionsPage() {
        System.out.println("Check if in Bluetooth permissions Page");
        new WebDriverWaits(driver).checkElementVisible(onBoardingStage7, 10);
    }

    public void checkForTurnONExposureNotificationsPopup() {
        System.out.println("Check For turn on exposure notifications Popup");
        new WebDriverWaits(driver).checkElementVisible(bluetoothPopupPanel, 10);
    }

}
