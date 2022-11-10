package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WashingMachine extends Appliance{

	private int loadWeight; 
	private String loadWay; //top-load, front-load
	
	public WashingMachine() { 
		
		this.loadWeight = 0;
		this.loadWay = "";
	}
	
	public WashingMachine(WashingMachine washingMachine) {
		
		super(washingMachine.getPrice(), washingMachine.getPowerConsumption(), washingMachine.getColor());
		this.loadWeight = washingMachine.getLoadWeight();
		this.loadWay = washingMachine.getLoadWay();
	}
	
	public WashingMachine(Appliance appliance, int loadWeight, String loadWay) {
		
		super(appliance);
		this.loadWeight = loadWeight;
		this.loadWay = loadWay;
	}
	
	public WashingMachine(int price, int powerConsumption, String color, int loadWeight, String loadWay) {
		
		super(price, powerConsumption, color);
		this.loadWeight = loadWeight;
		this.loadWay = loadWay;
	}
	
	public WashingMachine(Node appliance) {
    	
        super(appliance);
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "loadWeight" -> loadWeight = Integer.parseInt(value);
                case "loadWay" -> loadWay = value;
            }
        }
    }
	
	public int getLoadWeight() {
		return this.loadWeight;
	}
	
	public String getLoadWay() {
		return this.loadWay;
	}
	
	@Override
    public String toString() {   	
        return "WashingMachine:\n" + super.toString() + "loadWeight=" + loadWeight + "\n" + "loadWay=" + loadWay + "\n";
    }
}
