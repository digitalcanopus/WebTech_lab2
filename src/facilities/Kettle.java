package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Kettle extends Appliance {

	private int volume;
	private String material;
	
	public Kettle() {
        this.volume = 0;
        this.material = "";
    }

    public Kettle(Kettle kettle) {
    	
        super(kettle.getPrice(), kettle.getPowerConsumption(), kettle.getColor());
        this.volume = kettle.getVolume();
        this.material = kettle.getMaterial();
    }

    public Kettle(Appliance appliance, int volume, String material) {
    	
        super(appliance);
        this.volume = volume;
        this.material = material;
    }

    public Kettle(int price, int powerConsumption, String color, int volume, String material) {
    	
        super(price, powerConsumption, color);
        this.volume = volume;
        this.material = material;
    }

    public Kettle(Node appliance) {
    	
        super(appliance);
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "volume" -> volume = Integer.parseInt(value);
                case "material" -> material = value;
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {   	
        return "Kettle:\n" + super.toString() + "volume=" + volume + "\n" + "material=" + material + "\n";
    }
}
