package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        var largeAndDeepDomPage = homepage.clickLargeAndDeepDom();
        largeAndDeepDomPage.scrollToTable();
        assertEquals(largeAndDeepDomPage.getTableTitle(), "Table", "Title incorrect");
    }

    @Test
    public void testScrollToFifthParagraph() {
        homepage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testSelectedOption() {
        var dropDownPage = homepage.clickDropDown();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
