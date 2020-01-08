package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlidersPage {

    private WebDriver driver;
    private By slider = By.xpath("/html/body/div[2]/div/div/div/input");
    private By range = By.id("range");

    public HorizontalSlidersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLevel(int index) {
        for (int i = 0; i <= index; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRange() {
        return driver.findElement(range).getText();
    }
}
