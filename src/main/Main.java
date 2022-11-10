package main;

import facilities.*;
import service.*;

import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
		ApplianceService service = ServiceFactory.getInstance().getApplianceService();

        List<Appliance> kettles = service.findByApplianceType(Kettle.class);
        List<Appliance> cheapest = service.findTheCheapestAppliance();

        PrintInfo.print(kettles);
        System.out.println("***");
        PrintInfo.print(cheapest);
	}
}
