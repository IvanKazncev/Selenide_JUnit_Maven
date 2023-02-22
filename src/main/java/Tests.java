import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;

public class Tests extends BaseTest {
    private static final String MAIN_URL ="https://www.open.ru/";
    private static final String CORRECT_CITY = "Санкт-Петербург";
    MainPage mainPage = new MainPage();

    @Test
    public void smokeTest(){
        mainPage.startPage(MAIN_URL);
        mainPage.clickOnHomeButton();
        Assert.assertTrue($x("//div[@class=\"open-ui-title-wrapper\"]").isDisplayed());

    }
    @Test
    public void checkSlideMenuSecondSlide(){
        mainPage.startPage(MAIN_URL);
        mainPage.clickSlideMenuButton();
        mainPage.clickBuyButton();
        Assert.assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains("/credits/cash"));

    }
    @Test
    public void cityCheck(){
        mainPage.startPage(MAIN_URL);
        mainPage.cityChooseMenu();
        mainPage.citySelect();
        Selenide.sleep(50);
        Assert.assertEquals(mainPage.getCity(),CORRECT_CITY);

    }


}
