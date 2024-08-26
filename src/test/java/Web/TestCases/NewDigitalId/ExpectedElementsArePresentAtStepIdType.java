package Web.TestCases.NewDigitalId;

import Web.SiteTree.Services.InternalServices.DigitalIdRequests.NewId.NewDigitalIdRequest;
import Web.SiteTree.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType.IdTypeStep;
import Web.SiteTree.Services.InternalServices.InternalServices;
import Web.TestCases.Login.NeomUserCanBeSuccessfullyLoggedIn;
import Web.SiteTree.Services.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ExpectedElementsArePresentAtStepIdType extends NeomUserCanBeSuccessfullyLoggedIn {
    @Test
    public void expectedElementsArePresentAtStepIdType(){
        loginFlow();

        Services services = new Services();
        InternalServices internalServices = new InternalServices();
        NewDigitalIdRequest newDigitalIdRequest = new NewDigitalIdRequest();
        IdTypeStep idTypeStep = new IdTypeStep();

        services.servicesButton.click();
        internalServices.digitalIdRequestsButton.click();
        newDigitalIdRequest.newDigitalIdRequestsButton.click();

        idTypeStep.stepNaming.shouldHave(text("ID type"));
        idTypeStep.titleNaming.shouldHave(text("Select ID type"));
        idTypeStep.subTitleNaming.shouldHave(text("Please select desired ID type from the list. Your choice will be applied to all people for whom you are requesting ID."));
        idTypeStep.idTypeDropdown.shouldBe(visible);
        //idTypeStep.idTypeDropdown.shouldBe(Condition.visible, Duration.ofSeconds(10));
        idTypeStep.backButton.shouldBe(visible, enabled);
        idTypeStep.nextButton.shouldBe(visible, disabled);
    }
    @Test
    public void expectedValuesArePresentAtIdTypeDropdown(){
        loginFlow();

        Services services = new Services();
        InternalServices internalServices = new InternalServices();
        NewDigitalIdRequest newDigitalIdRequest = new NewDigitalIdRequest();
        IdTypeStep idTypeStep = new IdTypeStep();

        services.servicesButton.click();
        internalServices.digitalIdRequestsButton.click();
        newDigitalIdRequest.newDigitalIdRequestsButton.click();

        idTypeStep.idTypeDropdown.shouldBe(visible);
        idTypeStep.idTypeDropdown.click();
        ElementsCollection idTypeDropdownValues = $$x("//*[@id=\"digitalIdForm\"]/div[2]/div[1]/ng-select/div/div/div[2]");
        List<String> expectedValues = Arrays.asList("Contractor", "SMP", "Consultant", "Business Partner", "Hospital Staff");
        for (String value : expectedValues) {
            idTypeDropdownValues.findBy(text(value)).shouldBe(visible);
        }

    }

}
