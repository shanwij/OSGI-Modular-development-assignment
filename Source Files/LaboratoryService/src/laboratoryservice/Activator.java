package laboratoryservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start publisher.....");
		LaboratoryServicePublish publishService = new LaboratoryServicePublishImpl();
		publishServiceRegistration = bundleContext.registerService(LaboratoryServicePublish.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop publisher...");
		publishServiceRegistration.unregister();
	}

}
