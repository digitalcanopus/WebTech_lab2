package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Microwave extends Appliance{

	private int volume; 
	private String doorOpening; //handle, button
	
	public Microwave() {
		
		this.volume = 0;
		this.doorOpening = "";
	}
	
	public Microwave(Microwave microwave) {
		
		super(microwave.getPrice(), microwave.getPowerConsumption(), microwave.getColor());
		this.volume = microwave.getVolume();
		this.doorOpening = microwave.getDoorOpening();
	}
	
	public Microwave(Appliance appliance, int volume, String doorOpening) {
		
		super(appliance);
		this.volume = volume;
		this.doorOpening = doorOpening;
	}
	
	public Microwave(int price, int powerConsumption, String color, int volume, String doorOpening) {
		super(price, powerConsumption, color);
		this.volume = volume;
		this.doorOpening = doorOpening;
	}
	
	public Microwave(Node appliance) {
    	
        super(appliance);
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "volume" -> volume = Integer.parseInt(value);
                case "doorOpening" -> doorOpening = value;
            }
        }
    }
	
	public int getVolume() {
		return this.volume;
	}
	
	public String getDoorOpening() {
		return this.doorOpening;
	}
	
	@Override
    public String toString() {   	
        return "Microwave:\n" + super.toString() + "volume=" + volume + "\n" + "doorOpening=" + doorOpening + "\n";
    }
}
