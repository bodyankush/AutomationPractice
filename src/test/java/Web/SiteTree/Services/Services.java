package Web.SiteTree.Services;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Services {
    public final SelenideElement servicesButton = $x("//*[@id=\"servicesLnkId\"]/span[2]");
}
