package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homepage.clickFileUpload();
        uploadPage.uploadFile("/home/thamires/Documents/LearningSelenium/LearningSelenium/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFilesText(), "chromedriver", "Uploaded file incorrect");
    }
}
