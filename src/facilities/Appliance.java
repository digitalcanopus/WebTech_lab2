package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Appliance {

	private int price;
	private int powerConsumption;
	private String color;
	
	public Appliance() {
		
        this.price = 0;
        this.powerConsumption = 0;
        this.color = "";
    }
	
	public Appliance(Appliance appliance) {
		
        this.price = appliance.getPrice();
        this.powerConsumption = appliance.getPowerConsumption();
        this.color = appliance.getColor();
    }

    public Appliance(int price, int powerConsumption, String color) {
    	
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.color = color;
    }

    public Appliance(Node appliance) {
    	
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "price" -> price = Integer.parseInt(value);
                case "powerConsumption" -> powerConsumption = Integer.parseInt(value);
                case "color" -> color = value;
            }
        }
    }

    public int getPrice() {  	
        return this.price;
    }

    public int getPowerConsumption() {
        return this.powerConsumption;
    }

    public String getColor() {    	
        return this.color;
    }

    @Override
    public String toString() {
    	
        return "price=" + price + "\n" + "powerConsumption=" + powerConsumption + "\n" + "color=" + color + "\n";
    }
}
