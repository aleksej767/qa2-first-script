package home_work;


import org.junit.jupiter.api.Test;
import pageobject.pages.BaseFunc;
import pageobject.ticketpages.BaseFancTickets;
import pageobject.ticketpages.HomePage;

public class tickets {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";

    @Test
    public void ticket_order(){
        BaseFancTickets baseFunc = new BaseFancTickets();
        baseFunc.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.searchForName("Alex");
        homePage.searchForSurname("Padalko");
        homePage.searchForDiscount("Students");
        homePage.searchForSomeoneElse(1);
        homePage.searchForChildre(1);
        homePage.searchForLuggage(3);
        homePage.searchForFlight("12-05-2018");
        homePage.clickGetPriceBtn();

    }

}
