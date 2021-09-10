package SmokeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OpenAsusComputerBlockListTest extends BaseTest {
    private final String PAGE_CATEGORY_TITLE = "//div[@class='page-title page-title-category']";
    private String COMPUTER_BLOCK_TITLE_NAME = "Системні блоки Asus";

    @Test(priority = 1)
    public void openAsusComputerBlockListFromSideBar() {
        getWebDriver().get(HOME_PAGE_URL);
        getHomePage().openAsusComputerBlockList();
        assertEquals(getWebDriver().findElement(By.xpath(PAGE_CATEGORY_TITLE)).getText(), COMPUTER_BLOCK_TITLE_NAME);
    }
}
