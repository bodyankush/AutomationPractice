package Web.NewDigitalId;
import Pages.App.*;
import Web.Login.NeomUserCanBeSuccessfullyLoggedIn;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.*;
import static com.codeborne.selenide.Condition.*;

public class ExpectedElementsArePresentAtStepIdType extends NeomUserCanBeSuccessfullyLoggedIn {
    private App app;
    private InternalServices internalServices; 
    private NewDigitalIdRequest newDigitalIdRequest;
       
    @BeforeEach
    public void login() {
        loginFlow();
    };

    @Test
    public void expectedElementsArePresentAtStepIdType(){
        app.services.servicesButton.click();
        internalServices.digitalIdRequestsButton.click();
        newDigitalIdRequest.newDigitalIdRequestsButton.click();
        newDigitalIdRequest.idTypeStep.stepNaming.shouldHave(text("ID type"));
        newDigitalIdRequest.idTypeStep.titleNaming.shouldHave(text("Select ID type"));
        newDigitalIdRequest.idTypeStep.subTitleNaming.shouldHave(text("Please select desired ID type from the list. Your choice will be applied to all people for whom you are requesting ID."));
        newDigitalIdRequest.idTypeStep.idTypeDropdown.shouldBe(enabled);
        newDigitalIdRequest.idTypeStep.backButton.shouldBe(enabled);
        newDigitalIdRequest.idTypeStep.nextButton.shouldBe(disabled);
        newDigitalIdRequest.idTypeStep.stepNaming.shouldHave(text("ID type"));
        newDigitalIdRequest.idTypeStep.stepNaming.shouldHave(text("ID type"));
    }

//     @Test
//     public void expectedValuesArePresentAtIdTypeDropdown(){
//         app.services.servicesButton.click();
//         app.internalServices.digitalIdRequestsButton.click();
//         app.newDigitalIdRequest.newDigitalIdRequestsButton.click();
//         newDigitalIdRequest.idTypeDropdown.shouldBe(enabled);
//         newDigitalIdRequest.idTypeStep.idTypeDropdown.click();
// //        app.idTypeStep.idTypeDropdown.hasOptions(); Ну получилось успешно сделать метод hasOptions()
//     }

}