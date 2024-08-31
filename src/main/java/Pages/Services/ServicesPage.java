package Pages.Services;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ServicesPage {
    public final SelenideElement servicesButton = $x("//*[@id=\"servicesLnkId\"]/span[2]");
}
