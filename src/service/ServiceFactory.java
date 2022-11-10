package service;

/**
 * The class returns references to the object which class implements {@link ApplianceService}
 */
public final class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() { }

    /**
     * Gets the value of a reference to the object that implements {@link ApplianceService}
     * @return an object which class implements {@link ApplianceService}
     */
    public ApplianceService getApplianceService() {    	
        return this.applianceService;
    }

    /**
     * Gets object {@link ServiceFactory}
     * @return the only instance of class {@link ServiceFactory}
     */
    public static ServiceFactory getInstance() {
        return instance;
    }
}
