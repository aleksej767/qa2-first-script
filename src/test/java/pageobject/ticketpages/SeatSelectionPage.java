package pageobject.ticketpages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.pages.BaseFunc;

import static org.junit.jupiter.api.Assertions.*;

public class SeatSelectionPage {
    private BaseFunc baseFunc;

    private final By SEAT_NUMBER = By.xpath(".//div[@class = 'seat']");
    private final By SEAT = By.xpath(".//div[@class = 'line']");
    private final By FINAL_TEXT = By.xpath(".//div[@class = 'finalTxt']");



    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSeat(int seatNr) {
        baseFunc.waitForElementCountAtLeast(SEAT_NUMBER, 5);

        WebElement seatToChose = null;

        for (WebElement we : baseFunc.findElements(SEAT_NUMBER)) {
            if (Integer.parseInt(we.getText()) == seatNr) {
                seatToChose = we;
                break;
            }

        }

        assertNotNull(seatToChose,"Cant find seat you dumass");
        baseFunc.click(seatToChose);

    }

    public int getSeat() {
        String responseText = baseFunc.findElement(SEAT).getText();
        return Integer.parseInt(StringUtils.substringAfter(responseText, "seat is: "));

    }

    public String finalPage(){
       return baseFunc.findElement(FINAL_TEXT).getText();
    }
}
