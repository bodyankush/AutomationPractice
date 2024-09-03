package Pages.Login;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElementsPage {
    public static SelenideElement emailField = $x("//*[@id=\"i0116\"]");
    public static SelenideElement nextButton = $x("//*[@id=\"idSIButton9\"]");
    public static SelenideElement passwordField = $x("//*[@id=\"i0118\"]");
    public static SelenideElement signInButton = $x("//*[@id=\"idSIButton9\"]");
    public static SelenideElement staySignInNoButton = $x("//*[@id=\"idBtn_Back\"]");
}