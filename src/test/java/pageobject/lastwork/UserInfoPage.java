package pageobject.lastwork;

import model.reservation.Reservation;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.pages.BaseFunc;

import java.util.List;

public class UserInfoPage {

    private final By AIRPORTS = By.xpath(".//span[@class = 'bTxt']");
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By SOMEONE_ELSE = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick = 'setLang();']");
    private final By INFO_APPEARS = By.xpath(".//span[@class = 'bTxt']");
    private final By GET_PRICE_RESPONSE = By.id("response");
    private final By SEAT_NUMBER = By.xpath(".//div[@class = 'seat']");
    private final By SEAT = By.xpath(".//div[@class = 'line']");


    private BaseFunc baseFunc;

    public UserInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public List<WebElement> getSelectedAirports() {
        return baseFunc.findElements(AIRPORTS);
    }

    public void fillInInfoForm(Reservation reservation) {

        baseFunc.type(NAME, reservation.getFirstName());
        baseFunc.type(SURNAME, reservation.getLastName());
        baseFunc.type(DISCOUNT, reservation.getDiscount());
        baseFunc.type(SOMEONE_ELSE, reservation.getAdultsCount());
        baseFunc.type(CHILDREN, reservation.getChildCount());
        baseFunc.type(LUGGAGE, reservation.getBagCount());
        baseFunc.select(FLIGHT, reservation.getFlightDate());

    }

    public void clickOnGetPrice() {
        baseFunc.click(GET_PRICE_BTN);
    }

    public String getPassengereName() {
        String responseText = baseFunc.findElement(GET_PRICE_RESPONSE).getText();
        return StringUtils.substringBetween(responseText, "Mr/Ms ", "!");

    }

    public int getPrice() {
        String responseText = baseFunc.findElement(GET_PRICE_RESPONSE).getText();
        return Integer.parseInt(StringUtils.substringBetween(responseText, "from to for ", " EUR"));

    }


    public List<WebElement> infoAppears() {
        return baseFunc.findElements(INFO_APPEARS);
    }
//    public void clickOnBook(){
//        baseFunc.click(BOOK);
//    }

    public List<WebElement> getSeatNumber() {
        return baseFunc.findElements(SEAT_NUMBER);
    }

    public WebElement getWebElement() {
        return baseFunc.findElement(SEAT);
    }


}
