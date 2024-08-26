package Web.TestCases.Login;

import org.testng.annotations.Test;
import Web.SiteTree.Login.LoginElements;
import static com.codeborne.selenide.Selenide.open;

public class NeomUserCanBeSuccessfullyLoggedIn {

    @Test
    public void loginFlow(){
        open("https://mysecuritytest.neom.com/");

        LoginElements loginElements = new LoginElements();

        loginElements.enterEmail("Quality.Automation@neom.com");
        loginElements.clickNextButton();
        loginElements.enterPassword("Welcome@2024");
        loginElements.clickSignInButton();
        loginElements.clickNoButton();
    }
}
