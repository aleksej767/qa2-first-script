package pageobject.pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage {

        private final By ACCEPT_COKKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
        private final By SEARCH_INPUT_FIELD = By.id ("");

        private BaseFunc baseFunc;

        public HomePage(BaseFunc baseFunc) {

                this.baseFunc = baseFunc;
        }

        public void acceptCookies() {
              baseFunc.click(ACCEPT_COKKIES_BTN);

        }
        public void searchFor(String textToFind) {
                baseFunc.type(SEARCH_INPUT_FIELD, textToFind);
            //    baseFunc.pressKey(Keys.ENTER);
        }
}
