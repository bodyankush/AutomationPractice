package Pages.App;
import Pages.Services.ServicesPage;
import Pages.Services.InternalServices.InternalServicesPage;

public class Services extends ServicesPage {
    public InternalServicesPage internalServices;

    public Services() {
        internalServices = new InternalServices();
    }
}
