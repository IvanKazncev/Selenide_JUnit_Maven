import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

public class Tests extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void smokeTest(){
        mainPage.startPage(mainPage.MAIN_URL);
        mainPage.clickOnHomeButton();
        Assert.assertTrue((mainPage.LOGO).isDisplayed());

    }
    @Test
    public void checkSlideMenuSecondSlide(){
        mainPage.startPage(mainPage.MAIN_URL);
        mainPage.clickSlideMenuButton();
        mainPage.clickBuyButton();
        Assert.assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains("/credits/cash"));

    }
    @Test
    public void cityCheck(){
        mainPage.startPage(mainPage.MAIN_URL);
        mainPage.cityChooseMenu();
        mainPage.citySelect();
        Selenide.sleep(50);
        Assert.assertEquals(mainPage.getCity(),mainPage.CORRECT_CITY);

    }


}
