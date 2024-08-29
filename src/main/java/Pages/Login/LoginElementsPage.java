package Pages.Login;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElementsPage {
    public SelenideElement emailField = $x("//*[@id=\"i0116\"]");
    public SelenideElement nextButton = $x("//*[@id=\"idSIButton9\"]");
    public SelenideElement passwordField = $x("//*[@id=\"i0118\"]");
    public SelenideElement signInButton = $x("//*[@id=\"idSIButton9\"]");
    public SelenideElement staySignInNoButton = $x("//*[@id=\"idBtn_Back\"]");

}