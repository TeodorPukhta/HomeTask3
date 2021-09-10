package SmokeTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTest extends BaseTest {
    private String SEARCH_KEYWORD = "Samsung";
    private String SEARCH_QUERY = "query=Samsung";


    @Test(priority = 1)
    public void checkThatUrlContainsSearchWords() {
        getWebDriver().get(HOME_PAGE_URL);
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getWebDriver().getCurrentUrl().contains(SEARCH_QUERY));
    }
}
