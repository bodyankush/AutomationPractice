package Web.TestCases.Login;

import org.testng.annotations.Test;
import Pages.Login.LoginElementsPage;
import static com.codeborne.selenide.Selenide.open;

public class NeomUserCanBeSuccessfullyLoggedIn {

    @Test
    public void loginFlow(){
        open("https://mysecuritytest.neom.com/");

        LoginElementsPage loginElements = new LoginElementsPage();

       loginElements.emailField.setValue("Quality.Automation@neom.com");
       loginElements.nextButton.click();
       loginElements.passwordField.setValue("Welcome@2024");
       loginElements.signInButton.click();
       loginElements.staySignInNoButton.click();

    }
}
