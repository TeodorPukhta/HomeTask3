package SmokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AsusComputerBlockListPage;
import pages.HomePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver webDriver;
    public static final String HOME_PAGE_URL = "https://avic.ua/ua";

    @BeforeTest
    public void profileSetup() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetup() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        webDriver.close();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public HomePage getHomePage() {
        return new HomePage(getWebDriver());
    }

    public AsusComputerBlockListPage getAsusComputerBlockListPage() {
        return new AsusComputerBlockListPage(getWebDriver());
    }
}
