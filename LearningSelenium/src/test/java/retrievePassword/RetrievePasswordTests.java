package retrievePassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class RetrievePasswordTests extends BaseTests {

    @Test
    public void retrievePasswordSuccess() {
        ForgotPasswordPage forgotPasswordPage = homepage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getEmailSentText().contains("Your e-mail's been sent!"),
                "Recover password success text is incorrect" );
    }
}
