package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    WebDriver driver;
    private By contextArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContextArea() {
        Actions actions = new Actions(driver);

        WebElement contextBox = driver.findElement(contextArea);
        actions.contextClick(contextBox).perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_accept() {
        driver.switchTo().alert().accept();
    }
}
