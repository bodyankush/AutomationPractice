package Pages.App;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.NewDigitalIdRequestPage;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType.IdTypeStepPage;

public class NewDigitalIdRequest extends NewDigitalIdRequestPage {
    public IdTypeStepPage idTypeStep;

    public NewDigitalIdRequest() {
        idTypeStep = new IdTypeStepPage();
    }
}
