package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By emailSentText = By.id("content");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailSentText() {
        return driver.findElement(emailSentText).getText();
    }
}
