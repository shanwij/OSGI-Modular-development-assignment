package appointmentservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import appointmentservice.AppService;
import appointmentservice.AppServiceImpl;

public class AppActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Appointment Reservation Service Publisher Start");
		AppService publisherService = new AppServiceImpl();
		publishServiceRegistration = context.registerService(AppService.class.getName(), publisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Appointment Reservation Service Publisher");
		publishServiceRegistration.unregister();
	}

}
