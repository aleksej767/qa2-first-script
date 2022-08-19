package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.reservation.Reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.lastwork.TicketsHomePage;
import pageobject.lastwork.UserInfoPage;
import pageobject.pages.BaseFunc;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationStepDefs {
    private Reservation reservation;
    private BaseFunc baseFunc = new BaseFunc();
    private TicketsHomePage homePage;
    private UserInfoPage infoPage;


    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets";
    private final By GET_PRICE = By.xpath(".//*[text() = 'Get Price']");
    private final By BOOK = By.id("book2");
    private final By LAST_BOOK = By.id("book3");

    @Given("random client:")
    public void create_client(Map<String, String> params) {
        reservation = new Reservation("random", "random", params.get("discount"), params.get("flight_data"),
                params.get("airport_from"), params.get("airport_to"), Integer.parseInt(params.get("seat_number")),
                0, 0, 0);

        //        Reservation reservationWithSeters = new Reservation();
//        reservationWithSeters.setFirstName("Alex");
//        reservationWithSeters.setLastName("Padalko");
        //... Zapolnjajem s  pomosju Seterov

    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl(HOME_PAGE_URL);
        homePage = new TicketsHomePage(baseFunc);

    }

    @When("we are selecting airports")
    public void select_airport() {
        homePage.selectAirports(reservation);
        homePage.pressGoBtn();
        infoPage = new UserInfoPage(baseFunc);

    }

    @Then("selected airports appears on client info page")
    public void check_airports() {
        List<WebElement> airports = infoPage.getSelectedAirports();
        assertEquals(reservation.getDepartureAirport(), airports.get(0).getText(), "Incorrect departure airport");
        assertEquals(reservation.getArrivalAirport(), airports.get(1).getText(), "Incorrect departure airport");
    }

    @When("we are filling in passenger info form")
    public void fill_passenger_info_from() {
        infoPage.fillInInfoForm(reservation);
    }

    @And("we are clicking on Get Price link")
    public void click_on_get_price() {
        baseFunc.click(GET_PRICE);
    }

    @Then("passenger name appears")
    public void passenger_name_appears() {
        List<WebElement> names = infoPage.infoAppears();
        assertEquals(reservation.getFirstName(), names.get(2).getText(), "Incorrect Name");
    }

    @And("price is shown")
    public void price_is_shown() {
        List<WebElement> list = infoPage.infoAppears();
        System.out.println("Price is " + list.get(4).getText());
    }

    @When("we are pressing Book button")
    public void pressing_book_btn() {
        baseFunc.click(BOOK);

    }

    @And("Selecting seat number")
    public void select_seat_number() {
        List<WebElement> seats = infoPage.getSeatNumber();
        for (WebElement item : seats) {
            if (item.getText().equals(String.valueOf(reservation.getSeatNumber()))){
                item.click();
                break;
            }
        }

    }

    @Then("selected seat number appears")
    public void seat_number_appears() {
        WebElement element = infoPage.getWebElement();
        assertEquals(reservation.getSeatNumber(), Integer.valueOf(element.getText()), "Incorrect seat number");

    }

    @When("we are placing the order")
    public void placing_the_order() {
        baseFunc.click(LAST_BOOK);
    }


    // dodelat do "successful booking page appears"

}
