package Web.SiteTree.Login;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.*;

public class LoginElements {
    public SelenideElement emailField = $x("//*[@id=\"i0116\"]");
    public SelenideElement nextButton = $x("//*[@id=\"idSIButton9\"]");
    public SelenideElement passwordField = $x("//*[@id=\"i0118\"]");
    public SelenideElement signInButton = $x("//*[@id=\"idSIButton9\"]");
    public SelenideElement staySignInNoButton = $x("//*[@id=\"idBtn_Back\"]");

    public void enterEmail(String email) {
        emailField.shouldBe(visible).setValue(email);
    }
    public void clickNextButton() {
        nextButton.shouldBe(visible).click();
    }
    public void enterPassword(String password) {
        passwordField.shouldBe(visible).setValue(password);
    }
    public void clickSignInButton() {
        signInButton.shouldBe(visible).click();
    }
    public void clickNoButton() {
        staySignInNoButton.shouldBe(visible).click();
    }
}
