package medicineorderingservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MedicineOrderingServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("Start medicine ordering publisher.....");
		MedicineOrderingServicePublisher publishService = new MedicineOrderingServicePublisherImpl();
		publishServiceRegistration = bundleContext.registerService(MedicineOrderingServicePublisher.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Stop medicine ordering publisher...");
		publishServiceRegistration.unregister();
	}

}
