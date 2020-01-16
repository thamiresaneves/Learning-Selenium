package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private String leftArea = "/frame_left";
    private String bottomArea = "/frame_bottom";

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftAreaText() {
        switchToLeftArea();
        String text = driver.findElement(By.xpath("/html/frameset/frame[1]")).getText();
        switchToMainArea();
        return text;
    }

    public String getBottomAreaText() {
        switchToBottomArea();
        String text = driver.findElement(By.xpath("/html/frameset/frame[2]")).getText();
        switchToMainArea();
        return text;
    }

    public void clickNestedFrames() {
        driver.findElement(By.linkText("Nested Frames")).click();
    }

    private void switchToLeftArea() {
        driver.switchTo().frame(leftArea);
    }

    private void switchToBottomArea() {
        driver.switchTo().frame(bottomArea);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
