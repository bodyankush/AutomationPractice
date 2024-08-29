package Web.TestCases.NewDigitalId;
import Pages.App.*;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.NewDigitalIdRequestPage;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType.IdTypeStepPage;
import Pages.Services.InternalServices.InternalServicesPage;
import Pages.Services.ServicesPage;
import Web.TestCases.Login.NeomUserCanBeSuccessfullyLoggedIn;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.*;
import java.util.Arrays;
import java.util.List;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ExpectedElementsArePresentAtStepIdType extends NeomUserCanBeSuccessfullyLoggedIn {
    private App app;
    @BeforeMethod
    public void setUp(){
        app = new App();
    }
    @BeforeEach
    public void login() {
        loginFlow();
    };

    @Test
    public void expectedElementsArePresentAtStepIdType(){
        app.services.servicesButton.click();
        app.internalServices.digitalIdRequestsButton.click();
        app.newDigitalIdRequest.newDigitalIdRequestsButton.click();
        app.idTypeStep.stepNaming.shouldHave(text("ID type"));
        app.idTypeStep.titleNaming.shouldHave(text("Select ID type"));
        app.idTypeStep.subTitleNaming.shouldHave(text("Please select desired ID type from the list. Your choice will be applied to all people for whom you are requesting ID."));
        app.idTypeStep.idTypeDropdown.shouldBe(enabled);
        app.idTypeStep.backButton.shouldBe(enabled);
        app.idTypeStep.nextButton.shouldBe(disabled);
    }
    @Test
    public void expectedValuesArePresentAtIdTypeDropdown(){
        app.services.servicesButton.click();
        app.internalServices.digitalIdRequestsButton.click();
        app.newDigitalIdRequest.newDigitalIdRequestsButton.click();
        app.idTypeStep.idTypeDropdown.shouldBe(enabled);
        app.idTypeStep.idTypeDropdown.click();
//        app.idTypeStep.idTypeDropdown.hasOptions(); Ну получилось успешно сделать метод hasOptions()
    }

}
