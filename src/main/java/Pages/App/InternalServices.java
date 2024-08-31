package Pages.App;
import Pages.Services.InternalServices.InternalServicesPage;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.NewDigitalIdRequestPage;

public class InternalServices extends InternalServicesPage {
    public NewDigitalIdRequestPage newDigitalIdRequest;

    public InternalServices() {
        newDigitalIdRequest = new NewDigitalIdRequest();
    }
}
