package home_work;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.pages.BaseFunc;
import pageobject.pages.HomePage;

import java.time.Duration;
import java.util.List;

public class A18lesson {



    private final String HOME_PAGE_URL = "1a.lv";
    private final By ACCEPT_COKKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"); //.//*[contains(@id, 'AllowAll' -nerabotajet NO nahodit
    private final By LEFT_BAR_ELEMENTS = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");
    private final By MENU = By.xpath(".//div[@class = 'submenu-lvl1 submenu-lvl1--invisible submenu-lvl1--index']");
    private final By SUB_MENU = By.xpath(".//ul[@class = 'menu product-categories-menu']");
    private final By SUB_MENU_ELEMENTS = By.xpath(".//a[contains(@href, 'https://www.1a.lv/c/turisma-preces/')]");
    //.//ul[contains(@class, 'menu product-categories-menu')]
    private final By SUB_MENU_ELEMETNS = By.xpath(".//li/a[contains(@href, 'https://www.1a.lv/c/turisma-preces/')]");
    private final By TEST = By.xpath(".//a[@href = 'https://www.1a.lv/c/turisma-preces/turisma-apgerbs-un-apavi/3nd']");
    private final By LEFT_MENU3 = By.xpath(".//ul[@class = 'din-list new-cat-list']");
    private final By LEFT_BAR_ELEMENTS_3PAGE = By.xpath(".//li[@class = 'new-cat-item']");

    private final By CATALOG_ITEM = By.xpath(".//div[contains(@class, 'atalog-taxons-product--grid-view')]");

    private final String ITEM_TO_OPEN_1_PAGE = "Tūrisma preces";
    private final String ITEM_TO_OPEN_2_PAGE = "Tūrisms un ceļošana";
    private final String ITEM_TO_OPEN_3_PAGE = "Mugursomas ceļošanai, citas somas";


    private final String CATALOG_URL = "https://www.1a.lv/c/turisma-preces/turisma-apgerbs-un-apavi/mugursomas-celosanai-citas-somas/3xf";
    private final By CATALOG_ITEM_NAME = By.xpath(".//a[@class = 'catalog-taxons-product__name']");
    private final By PRODUCT_NAME = new By.ByTagName("h1");
    private final By PRICE = By.xpath(".//span[@class = 'price']");


    @Test
    public void product_order() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);


        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();

        //TODO ne klikajet na cookies..slitajet

       // SearchResultPage resulPage = new SearchResultPage;


//        List<WebElement> leftMenuItems = browser.findElement(MENU).findElements(LEFT_BAR_ELEMENTS);
//        for (WebElement item : leftMenuItems) {
//            if (item.getText().equals(ITEM_TO_OPEN_1_PAGE)) {
//                item.click();
//                break;
//            }
//        }
//
//        wait.until(ExpectedConditions.elementToBeClickable(TEST));
//        List<WebElement> subMenuItems = browser.findElements(TEST);
//
//        //zavjazka na HREF - ne luciji variant no rabotajet
//        System.out.println(subMenuItems.get(0).getText());
//        wait.until(ExpectedConditions.elementToBeClickable(subMenuItems.get(0)));
//        subMenuItems.get(0).click();
//
//
//        //___________________________WORKS______________________
//
//        List<WebElement> leftMenuItems1 = browser.findElement(LEFT_MENU3).findElements(LEFT_BAR_ELEMENTS_3PAGE);
//        for (WebElement item : leftMenuItems1) {
//            if (item.getText().equals(ITEM_TO_OPEN_3_PAGE)) {
//                System.out.println(item.getText());
////                try {
////                    item.click();
////                } catch (ElementClickInterceptedException e) {
////                    item.click();
////                }
////                item.click();
//                break;
//            }
//        }
//
//
//        browser.get(CATALOG_URL);
//
//        List<WebElement> catalogItems = browser.findElements(CATALOG_ITEM);
//
//        try {
//            catalogItems.get(14).click();
//        } catch (ElementClickInterceptedException e) {
//            catalogItems.get(14).click();
//        }
//
//        catalogItems.get(14).findElement(CATALOG_ITEM_NAME).click();
//        List<WebElement> prices = browser.findElements(PRICE);
//        System.out.println(browser.findElement(PRODUCT_NAME).getText());
//        System.out.println(prices.get(0).getText());

        // wait.until(ExpectedConditions.elementToBeClickable(TEST));
        //browser.findElement(TEST).click();

//        for (WebElement item: subMenuItems
//             ) {
//            System.out.println(item.getText());
//
//
//        }

//        List<WebElement> subMenuTEST = browser.findElement(SUB_MENU).findElements(SUB_MENU_ELEMENTS);
//        for (WebElement item : subMenuTEST) {
//            if (item.getText().equals(ITEM_TO_OPEN_2_PAGE))
//                System.out.println(item.getText());
//            wait.until(ExpectedConditions.elementToBeClickable(item));
//            item.click();
//
//            break;
//        }


//        for (WebElement item : subMenuItems) {
//            if (item.getText().equals(ITEM_TO_OPEN_2_PAGE))
//                System.out.println(item.getText());
//            wait.until(ExpectedConditions.elementToBeClickable(item));
//            item.click();
//
//            break;


        //     }
//        wait.until(ExpectedConditions.elementToBeClickable(TEST));
//        browser.findElement(TEST).click();

    }
}




