package nhs.onboarding;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qub.vg05.webdriver.WebDriverWaits;

public class PostcodePage_3 {
    AndroidDriver<WebElement> driver;

    public PostcodePage_3(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    private final By postcodeContainer = MobileBy.id("uk.nhs.covid19.production:id/postCodeContainer");
    private final By invalidPostcodeErrorMessage = MobileBy.id("uk.nhs.covid19.production:id/errorTextTitle");
    private final By postCodeEditTextButton = MobileBy.id("uk.nhs.covid19.production:id/postCodeEditText");
    private final By postCodeContinueButton = MobileBy.id("uk.nhs.covid19.production:id/postCodeContinue");

    public void checkPostcodeContainer() {
        System.out.println("Check in Postcode Page");
        new WebDriverWaits(driver).checkElementVisible(postcodeContainer, 10);
    }

    public void checkPostcodeErrorMessage() {
        System.out.println("Check for invalid postcode message");
        new WebDriverWaits(driver).checkElementVisible(invalidPostcodeErrorMessage, 10);
    }

    public void clickContinuePostcode() {
        System.out.println("Click Continue");
        new WebDriverWaits(driver).waitForElementToBeClickable(postCodeContinueButton, 10);
        driver.findElement(postCodeContinueButton).click();
    }

    public void enterInvalidPostcode() {

        System.out.println("Enter Invalid Postcode");
        new WebDriverWaits(driver).waitForElementToBeClickable(postCodeEditTextButton, 10);
        driver.findElement(postCodeEditTextButton).clear();
        driver.findElement(postCodeEditTextButton).sendKeys("");
    }

    public void enterValidPostcode() {

        System.out.println("Enter Valid Postcode");
        new WebDriverWaits(driver).waitForElementToBeClickable(postCodeEditTextButton, 10);
        driver.findElement(postCodeEditTextButton).clear();
        driver.findElement(postCodeEditTextButton).sendKeys("L2");
    }

}
