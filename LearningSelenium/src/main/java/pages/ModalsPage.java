package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalsPage {

    WebDriver driver;
    private By modalTitle = By.className("modal-title");
    private By modalText = By.className("modal-body");
    private By closeButton = By.className("modal-footer");

    public ModalsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getModalTitle() {
        return driver.findElement(modalTitle).getText();
    }

    public String getModalText() {
        return driver.findElement(modalText).getText();
    }

    public void clickCloseButton() {
        driver.findElement(closeButton).click();
    }


}
