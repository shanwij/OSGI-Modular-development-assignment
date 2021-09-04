package medicinedeliveryservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DeliveryServiceActivator implements BundleActivator {

	ServiceRegistration medicineDeliveryRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Medicine Delivery Publisher.!");
		MedicineDeliveryPublisher medicineDeliveryPublisherService = new MedicineDeliveryPublisherImpl();
		medicineDeliveryRegistration = context.registerService(MedicineDeliveryPublisher.class.getName(), medicineDeliveryPublisherService, null);
	
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Medicine Delivery Publisher.!");
		medicineDeliveryRegistration.unregister();
	}

}
