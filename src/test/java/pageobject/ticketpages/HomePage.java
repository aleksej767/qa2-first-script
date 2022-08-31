package pageobject.ticketpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

        private final By SEARCH_INPUT_FIELD_NAME = By.id ("name");
        private final By SEARCH_INPUT_FIELD_SURNAME = By.id ("surname");
        private final By SEARCH_INPUT_FIELD_DISCOUNT = By.id ("discount");
        private final By SEARCH_INPUT_FIELD_SOMEONE_ELSE = By.id ("adults");
        private final By SEARCH_INPUT_FIELD_CHILDER = By.id ("children");
        private final By SEARCH_INPUT_FIELD_LUGGAGE = By.id ("bugs");
        private final By SEARCH_INPUT_FIELD_FLIGHT = By.id("flight");
        private final By SEARCH_BTN_GET_PRICE = By.xpath("//*[@id=\"fullForm\"]/span[8]");
        private pageobject.ticketpages.BaseFancTickets baseFunc;

        public HomePage(BaseFancTickets baseFunc) {

                this.baseFunc = baseFunc;
        }

        public void searchForName(String textToFind) {
                baseFunc.type(SEARCH_INPUT_FIELD_NAME, textToFind);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_NAME,Keys.ENTER);
        }
        public void searchForSurname(String textToFind){
                baseFunc.type(SEARCH_INPUT_FIELD_SURNAME, textToFind);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_SURNAME,Keys.ENTER);
        }

        public void searchForDiscount(String textToFind){
                baseFunc.type(SEARCH_INPUT_FIELD_DISCOUNT, textToFind);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_DISCOUNT,Keys.ENTER);
        }

        public void searchForSomeoneElse(int count){
                baseFunc.typeCount(SEARCH_INPUT_FIELD_SOMEONE_ELSE, count);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_SOMEONE_ELSE,Keys.ENTER);
        }
        public void  searchForChildre(int count){
                baseFunc.typeCount(SEARCH_INPUT_FIELD_CHILDER, count);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_CHILDER,Keys.ENTER);
        }
        public void  searchForLuggage(int count){
                baseFunc.typeCount(SEARCH_INPUT_FIELD_LUGGAGE, count);
                baseFunc.pressKey(SEARCH_INPUT_FIELD_LUGGAGE,Keys.ENTER);
        }

        public  void searchForFlight(String textToFind) {
                baseFunc.select(SEARCH_INPUT_FIELD_FLIGHT,textToFind);

        }

        public  void clickGetPriceBtn(){
                baseFunc.click(SEARCH_BTN_GET_PRICE);
        }



}
