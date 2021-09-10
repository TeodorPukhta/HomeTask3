package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AsusComputerBlockListPage extends BasePage{
    private static final String NOTIFY_ABOUT_AVAILABILITY_BUTTON = "//div[@class='prod-cart height']//*[contains(@class,'orange')]";
    private static final String EMAIL_INPUT = "//div[contains(@class,'availableProductNotification')]//input[@class='validate']";
    private static final String SUBMIT_EMAIL_BUTTON = "//*[@id='js_availableProductNotification']//button[@type='submit']";
    public AsusComputerBlockListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkReportAvailabilityButton(final String email){
        webDriver.findElement(By.xpath(NOTIFY_ABOUT_AVAILABILITY_BUTTON)).click();
        webDriver.findElement(By.xpath(EMAIL_INPUT)).sendKeys(email);
        webDriver.findElement(By.xpath(SUBMIT_EMAIL_BUTTON)).click();
    }


}
