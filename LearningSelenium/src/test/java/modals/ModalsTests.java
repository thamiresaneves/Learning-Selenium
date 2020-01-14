package modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class ModalsTests extends BaseTests {

    private String modalText = "It's commonly used to encourage a user to take an action (e.g., give their e-mail " +
            "address to sign up for something or disable their ad blocker).";

    @Test
    public void testModal() throws InterruptedException {
        var entryAdPage = homepage.clickEntryAd();
        sleep(2000);
        assertEquals(entryAdPage.getModalTitle(), "THIS IS A MODAL WINDOW", "Title incorrect");
        assertEquals(entryAdPage.getModalText(), modalText, "Text incorrect");
        entryAdPage.clickCloseButton();
    }
}
