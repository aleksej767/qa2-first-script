package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FirstSeleniumTest {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");
    private final By COOKIE_ACCEPT = By.xpath(".//a[contains(@id , 'AllowAll')]");
    private final By HOME_PAGE_LOGO = By.xpath(".//a[@class = 'logo']");
    private final By RIGHT_SUBMENU_BTN = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");
    private final By ORDER_INFO_BTN = By.xpath(".//a[contains(@href, 'search')]");
    private final By SEARCH_BTN = By.xpath(".//button[contains(@class, 'search')]");
    private final By WELCOME_BANNER = By.id("welcome-carousel");
    private final By FAVORITE_BTN = By.xpath(".//i[contains(@class, 'items__icon icon-svg')]");
    private final By LV_BTN = By.xpath(".//a[@hreflang = 'lv']");
    private final By RU_BTN = By.xpath(".//a[@hreflang = 'ru']");
    private WebDriver driver;

    @Test
    public void openWebPage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(HOME_PAGE_URL);

        wait.until(ExpectedConditions.elementToBeClickable(COOKIE_ACCEPT));
        driver.findElement(COOKIE_ACCEPT).click();

        //WebElement homeLogo = driver.findElement(HOME_PAGE_LOGO);
        // driver.findElement(HOME_PAGE_LOGO).click(); // pocemu ne klikajet?

        List<WebElement> subMenuBtn = driver.findElements(RIGHT_SUBMENU_BTN);

     //   subMenuBtn.get(0).click();



//        driver.findElement(SEARCH_INPUT_FIELD);
//
//        WebElement searchField = driver.findElement(SEARCH_INPUT_FIELD);
//        searchField.sendKeys("Apple");
//        searchField.sendKeys(Keys.ENTER);


        // Najti lokatar serdecka na 1a.lv

        //lokatar menju s levo
        //lokator knopki poisk
        // lokatar cookies
        //lokatori jazika
        //lokator zeljonoj knopki sverhu
        //lokator glavnogo banera po centru


//        Setting path where driver is stored
//         System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//        Opening browser window
//         WebDriver browser = new ChromeDriver();
//         browser.manage().window().maximize();
//         browser.get("http://www.tvnet.lv/");
//         By acceptButton = By.id(""); // jEsli jest nado delat refres ctob ubeditsja cto on ne randomno generirovanij
//        By acceptButton1 = By.name(""); // ne vsegda jest
//        By acceptButton2 = By.className(" css-47sehv"); // jesli net ne ID ne class
//         xpath eto universalnij lokator right - clic on element / copy / copy xpath
//        *[@id="qc-cmp2-ui"]/div[2]/div/button[2] // - auto xpath
//        button[@mode = "primary"] - poisk mo modu
//        button[@class = " css-47sehv"]
//        div[contains(@class, '47se')] poiks lokatora po cjasticnomu sovpodeniju
//
//         By xpathButton = By.xpath(".//button[@class = ' css-47sehv']");
//         browser.findElement(xpathButton).click();


    }
//    @AfterEach
//    public void closeBrowser() {
//        driver.close();

 //   }
}
