package Web.SiteTree.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class IdTypeStep {
    public final SelenideElement stepNaming = $x("/html/body/app-root/div/div/div/app-services-new-digital-id/div[2]/div/app-action-steps/div/div/div[1]/div");
    public final SelenideElement titleNaming = $x("//*[@id=\"digitalIdForm\"]/div[1]/div/h3");
    public final SelenideElement subTitleNaming = $x("//*[@id=\"digitalIdForm\"]/div[1]/div/p");
    public final SelenideElement idTypeDropdown = $x("//*[@id=\"digitalIdForm\"]/div[2]/div[1]/ng-select/div/div/div[2]");
    public final SelenideElement backButton = $x("//*[@id=\"digitalIdForm\"]/div[3]/div[1]/button");
    public final SelenideElement nextButton = $x("//*[@id=\"digitalIdForm\"]/div[3]/div[2]/button");
}
