package SmokeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ProductReportAvailabilityTest extends BaseTest {
    private static final String ASUS_COMPUTER_BLOCKS_LIST_PAGE_URL = "https://avic.ua/ua/gotovyie-pk/proizvoditel--asus";
    private static final String USER_EMAIL = "test@test.com";
    private static final String SUCCESSFUL_VALIDATION_POPUP_WINDOW = "//div[@class='ttl js_title']";

    @Test(priority = 1)
    public void checkReportAvailabilityButton() {
        getWebDriver().get(ASUS_COMPUTER_BLOCKS_LIST_PAGE_URL);
        getAsusComputerBlockListPage().checkReportAvailabilityButton(USER_EMAIL);
        assertTrue(getWebDriver().findElement(By.xpath(SUCCESSFUL_VALIDATION_POPUP_WINDOW)).isDisplayed());
    }

}
