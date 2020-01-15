package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homepage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        editorPage.setTextArea(text1);
        editorPage.clickDecreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text incorrect");
    }

    //Exercise from FramesPage
    @Test
    public void testFramesAreas() throws InterruptedException {
        var framesPage = homepage.clickFrames();
        framesPage.clickNestedFrames();
        sleep(5000);

        assertEquals(framesPage.getLeftAreaText(), "LEFT", "Text incorrect");
        assertEquals(framesPage.getBottomAreaText(), "BOTTOM", "Text incorrect");
    }

}
