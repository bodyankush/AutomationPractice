package Pages.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType;

import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$x;

public class IdTypeStepPage {
    public final SelenideElement stepNaming = $x("//div[contains(@class, \"title\") and text()=\"ID type\"]");
    public final SelenideElement titleNaming = $x("//*[@id=\"digitalIdForm\"]/div[1]/div/h3");
    public final SelenideElement subTitleNaming = $x("//*[@id=\"digitalIdForm\"]/div[1]/div/p");
    public final SelenideElement idTypeDropdown = $x("//div[@role='combobox' and contains(@class, 'ng-input')]");
    public final SelenideElement backButton = $x("//*[@id=\"digitalIdForm\"]/div[3]/div[1]/button");
    public final SelenideElement nextButton = $x("//*[@id=\"digitalIdForm\"]/div[3]/div[2]/button");

    //Пробовал сделать метод hasOptions по инструкции с чата ГПТ
    public boolean hasOptions(String... expectedOptions) {
        return $x("//div[@role='combobox' and contains(@class, 'ng-input')]").text().contains(Arrays.asList(expectedOptions));
    }
}
