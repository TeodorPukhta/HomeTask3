package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private static final String SEARCH_INPUT = "//input[@id = 'input_search']";
    private static final String SEARCH_BUTTON = "//button[@class = 'button-reset search-btn']";
    private static final String SIDEBAR_1LVL_COMPUTERS_BUTTON = "//span[@class='sidebar-item-title']//*[contains(text(),'Комп')]";
    private static final String SIDEBAR_2LVL_COMPUTER_BLOCKS_BUTTON = "//*[contains(@class,'menu-lvl ')]//*[contains(@href,'gotovyie-pk') and contains(@class,'sidebar-item')]";
    private static final String SIDEBAR_3LVL_ASUS_BUTTON = "//a[contains(@href,'gotovyie-pk/proizvoditel--asus')]//div[@class='third-level-img']";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void searchByKeyword(final String keyword) {
        webDriver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        webDriver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void openAsusComputerBlockList(){
        Actions action = new Actions(webDriver);
        WebElement webElement = webDriver.findElement(By.xpath(SIDEBAR_1LVL_COMPUTERS_BUTTON));
        action.moveToElement(webElement).pause(1000)
                .moveToElement(webDriver.findElement(By.xpath(SIDEBAR_2LVL_COMPUTER_BLOCKS_BUTTON)))
                .pause(1000)
                .moveToElement(webDriver.findElement(By.xpath(SIDEBAR_3LVL_ASUS_BUTTON))).click().build().perform();
    }
}
