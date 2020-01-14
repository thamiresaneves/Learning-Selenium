package contextArea;

import base.BaseTests;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class ContextAreaTests extends BaseTests {

    @Test
    public void testContextArea() throws InterruptedException {
        var contextAreaPage = homepage.clickContextMenu();
        contextAreaPage.clickContextArea();

        assertEquals(contextAreaPage.alert_getText(), "You selected a context menu", "Message incorrect");
    }
}
