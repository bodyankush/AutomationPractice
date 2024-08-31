package Web.TestCases.Login;
import org.testng.annotations.Test;
import Pages.Login.LoginElementsPage;
import static com.codeborne.selenide.Selenide.open;

public class NeomUserCanBeSuccessfullyLoggedIn {
    @Test
    public void loginFlow(){
        open("https://mysecuritytest.neom.com/");
        LoginElementsPage.emailField.setValue("Quality.Automation@neom.com");
        LoginElementsPage.nextButton.click();
        LoginElementsPage.passwordField.setValue("Welcome@2024");
        LoginElementsPage.signInButton.click();
        LoginElementsPage.staySignInNoButton.click();
    }
}
