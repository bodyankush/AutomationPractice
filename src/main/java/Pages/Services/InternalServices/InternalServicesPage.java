package Pages.Services.InternalServices;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class InternalServicesPage {
    public final SelenideElement digitalIdRequestsButton = $x("//h5[contains(text(), 'Digital ID requests')]");
}
