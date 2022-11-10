package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Stove extends Appliance{

	private String typeE; //gas, electric
	private int burnerQu;
	
	public Stove() { 
		
		this.typeE = "";
		this.burnerQu = 0;
	}
	
	public Stove(Stove stove) {
		
		super(stove.getPrice(), stove.getPowerConsumption(), stove.getColor());
		this.typeE = stove.getType();
		this.burnerQu = stove.getBurnerQu();
	}
	
	public Stove(Appliance appliance, String typeE, int burnerQu) {
		
		super(appliance);
		this.typeE = typeE;
		this.burnerQu = burnerQu;
	}
	
	public Stove(int price, int powerConsumption, String color, String typeE, int burnerQu) {
		
		super(price, powerConsumption, color);
		this.typeE = typeE;
		this.burnerQu = burnerQu;
	}
	
	public Stove(Node appliance) {
    	
        super(appliance);
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "typeE" -> typeE = value;
                case "burnerQu" -> burnerQu = Integer.parseInt(value);
            }
        }
    }
	
	public String getType() {
		return this.typeE;
	}
	
	public int getBurnerQu() {
		return this.burnerQu;
	}
	
	@Override
    public String toString() {   	
        return "Stove:\n" + super.toString() + "typeE=" + typeE + "\n" + "burnerQu=" + burnerQu + "\n";
    }
}
