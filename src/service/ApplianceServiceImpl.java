package service;

import dao.*;
import facilities.Appliance;

import java.util.ArrayList;

/**
 * Implements an interface {@link ApplianceService} for data access in DAO
 */
public class ApplianceServiceImpl implements ApplianceService{
	
	public ApplianceServiceImpl() { }
	
	/**
     * Finds all appliance of selected type in DAO
     * @param applianceType - Appliance type to search
     * @return List of appliances
     */
	public ArrayList<Appliance> findByApplianceType(Class applianceType) {
		
        if (applianceType.getSuperclass() == Appliance.class) {
            ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
            return applianceDAO.findByApplianceType(applianceType);
        }
        else {
            return null;
        }
    }
	
	 /**
     * Finds the cheapest appliance of any type in DAO
     * @return List of appliances
     */
	public ArrayList<Appliance> findTheCheapestAppliance() {
		
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        return applianceDAO.findTheCheapestAppliance();
    }

	/**
     * Finds the most expensive appliance of any type in DAO
     * @return List of appliances
     */
    public ArrayList<Appliance> findTheMostExpensiveAppliance() {
    	
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        return applianceDAO.findTheMostExpensiveAppliance();
    }
}
