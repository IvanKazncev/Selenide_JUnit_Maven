import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement HOME_BUTTON = $x("//div[@id='headerMenuBlockId']");
    private final SelenideElement SLIDE_MENU_BUTTON = $x("//span[@class=\"swiper-pagination-bullet\"][2]");
    private final SelenideElement BUY_BUTTON = $x("//SPAN[@class='open-ui-button-text'][text()='Успей оформить']");
    private final SelenideElement CHOOSE_CITY_MENU = $(".HeaderTopBlock_current-city-name__MPH2d");
    private final SelenideElement CITY_SELECT = $$(".City_city-title__F8zgx").get(12);
    private final SelenideElement ACTUAL_CITY = $(".HeaderTopBlock_current-city__p90cG");
    static final SelenideElement LOGO = $x("//div[@class=\"open-ui-title-wrapper\"]");
    static final String MAIN_URL ="https://www.open.ru/";
    static final String CORRECT_CITY = "Санкт-Петербург";

    public void clickOnHomeButton() {
        HOME_BUTTON.click();
    }

    public void startPage(String url) {
        Selenide.open(url);

    }

    public void clickSlideMenuButton() {
        SLIDE_MENU_BUTTON.click();
    }

    public void clickBuyButton() {
        BUY_BUTTON.click();
    }

    public void cityChooseMenu() {
        CHOOSE_CITY_MENU.click();
    }

    public void citySelect() {
        CITY_SELECT.click();
    }
    public String getCity(){
       var text = ACTUAL_CITY.getText();
        return text;
    }
}

