package dao;

/**
 * The class returns references to the object which class implements {@link ApplianceDAO}
 */
public final class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory() { }

    /**
     * Gets the value of a reference to the object that implements {@link ApplianceDAO}
     * @return an object which class implements {@link ApplianceDAO}
     */
    public ApplianceDAO getApplianceDAO() {    	
        return this.applianceDAO;
    }

    /**
     * Gets object {@link DAOFactory}
     * @return the only instance of class {@link DAOFactory}
     */
    public static DAOFactory getInstance() {   	
        return instance;
    }
}
