package home_work;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Lesson7DelfiTest {


    private final String HOME_PAGE_URL = "http://www.delfi.lv";
    private final By ACCEPT_COKKIES_BTN = By.xpath(".//*[@id='qc-cmp2-ui']/div[2]/div/button[2]");
    private final By REJECT_SPAM = By.id("onesignal-slidedown-cancel-button");
    private final By ARTICLE_TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By NEWS_ARTICLE = By.xpath(".//div[contains(@class, 'article-title')]");
    private final By HOME_PAGE = By.xpath(".//a[contains(@class, 'C-header__logo')] ");
    private WebDriver browser;

    @Test
    public void tittleCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize(); // otkrivajet browser i razvjortivajet okno.
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10)); // opredelenije zaderzki dlja klika na nuznoje okno
        browser.get(HOME_PAGE_URL);

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COKKIES_BTN));
        browser.findElement(ACCEPT_COKKIES_BTN).click(); // accept cookies


        wait.until(ExpectedConditions.elementToBeClickable(REJECT_SPAM));
        browser.findElement(REJECT_SPAM).click(); // reject spam

        List<WebElement> titles = browser.findElements(ARTICLE_TITLE);
        System.out.println(titles.get(0).getText()); //first tittle

        String firstTitle = titles.get(0).getText(); // sohronenije nazvanije pervoj statji

        titles.get(0).click(); // clicknul na 1 sliku iz vseh


        System.out.println();

        System.out.println(browser.findElement(NEWS_ARTICLE).getText()); // nazvanije statji

        String secondTitle = browser.findElement(NEWS_ARTICLE).getText(); // sohranenije nazvanije staji na stranice statji

        wait.until(ExpectedConditions.elementToBeClickable(HOME_PAGE));
        browser.findElement(HOME_PAGE).click(); // vozrasenije na home cerez LOGO

        List<WebElement> titles1 = browser.findElements(ARTICLE_TITLE);

        System.out.println("Teksta salīdzināšana");

        //______________Compare_Titles________________

        if (firstTitle == secondTitle) {
            System.out.println(firstTitle);
            System.out.println(secondTitle);
            System.out.println("Teksti ir vienadi");
        }
        else {
            System.out.println(firstTitle);
            System.out.println(secondTitle);
            System.out.println("Teksti nav vienadi");
        }
        //_____________________________________________
        System.out.println();
        //________________Displaying_List_____________________
        int listValue = titles1.size();

        for (int i = 0; i < listValue; i++ ){

            System.out.println(titles1.get(i).getText());
        }
    }

    @AfterEach
    public void browserClose() {
        browser.close();
    }

}
