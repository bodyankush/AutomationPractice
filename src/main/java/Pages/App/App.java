package Pages.App;

import Pages.Services.InternalServices.DigitalIdRequests.NewId.NewDigitalIdRequestPage;
import Pages.Services.InternalServices.DigitalIdRequests.NewId.Steper.IdType.IdTypeStepPage;
import Pages.Services.InternalServices.InternalServicesPage;
import Pages.Services.ServicesPage;

public class App {
    public ServicesPage services;
    public InternalServicesPage internalServices;
    public NewDigitalIdRequestPage newDigitalIdRequest;
    public IdTypeStepPage idTypeStep;

    public App() {
        services = new Services();
        internalServices = new InternalServices();
        newDigitalIdRequest = new NewDigitalIdRequest();
        idTypeStep = new IdTypeStep();
    }
}
