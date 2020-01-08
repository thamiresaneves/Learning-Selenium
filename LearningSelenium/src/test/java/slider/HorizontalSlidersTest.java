package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSlidersTest extends BaseTests {

    @Test
    public void testSlider() {
        var slider = homepage.clickHorizontalSlides();
        slider.goToLevel(7);
        assertEquals(slider.getRange(), "4", "Range Incorrect");
    }
}
