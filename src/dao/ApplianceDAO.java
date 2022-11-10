package dao;

import facilities.Appliance;

import java.util.ArrayList;

/**
 * An interface for getting appliance by certain criteria from the source
 */
public interface ApplianceDAO {

	/**
     	* Finds all appliances of selected type
     	* @param applianceType - Appliance type to search
     	* @return List of appliances
     	*/
	ArrayList<Appliance> findByApplianceType(Class applianceType);

	/**
     	* Finds the cheapest appliance of any type
     	* @return List of appliances
     	*/
    	ArrayList<Appliance> findTheCheapestAppliance();

	/**
	* Finds the most expensive appliance of any type
	* @return List of appliances
	*/
	ArrayList<Appliance> findTheMostExpensiveAppliance();
}
