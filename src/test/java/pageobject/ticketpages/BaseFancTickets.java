package pageobject.ticketpages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BaseFancTickets {

    private WebDriver driver;
    private WebDriverWait wait;


    public BaseFancTickets() {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {

            url = "http://" + url;

        }
        driver.get(url);
    }


    public void click(By locator) {
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));

        try {
            we.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Can't be clickable first time!!!");
            we.click();
        }


    }

    public void type(By locator, String text) {
        WebElement we = driver.findElement(locator);

        we.clear();
        we.sendKeys(text);

    }

    public void typeCount(By locator, int text) {
        WebElement we = driver.findElement(locator);
        String count = Integer.toString(text);
        we.clear();
        we.sendKeys(count);

    }

    public void pressKey(By locator, Keys key) {
        findElement(locator).sendKeys(key);

//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        WebElement we = driver.findElement(locator);
//
//        we.sendKeys(key);
        //driver.findElement(By.tagName("body")).sendKeys(key);

    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        // WebElement we = driver.findElement(locator);
        // return driver.findElement(locator);

    }


    public List<WebElement> findElements(By parent, By child) {
        WebElement menu = driver.findElement(parent);
        return menu.findElements(child);

    }

    public void select(By locator,String text){
        Select select = new Select(findElement(locator));
        select.selectByVisibleText(text);
    }

}
