package facilities;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Fridge extends Appliance{
	
	private int doorQu;
	private int compressorQu;
	
	public Fridge() {
		
		this.doorQu = 0;
		this.compressorQu = 0;
	}
	
	public Fridge(Fridge fridge) {
		
		super(fridge.getPrice(), fridge.getPowerConsumption(), fridge.getColor());
		this.doorQu = fridge.getDoorQu();
		this.compressorQu = fridge.getCompressorQu();
	}
	
	public Fridge(Appliance appliance, int doorQu, int compressorQu) {
		super(appliance);
		this.doorQu = doorQu;
		this.compressorQu = compressorQu;
	}
	
	public Fridge(int price, int powerConsumption, String color, int doorQu, int compressorQu) {
		
		super(price, powerConsumption, color);
		this.doorQu = doorQu;
		this.compressorQu = compressorQu;
	}
	
	public Fridge(Node appliance) {
        super(appliance);
        NodeList nodes = appliance.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            String field = nodes.item(i).getNodeName();
            String value = nodes.item(i).getTextContent();

            switch (field) {
                case "doorQu" -> doorQu = Integer.parseInt(value);
                case "compressorQu" -> compressorQu = Integer.parseInt(value);
            }
        }
    }
	
	public int getDoorQu() {
        return this.doorQu;
    }
	
	public int getCompressorQu() {
		return this.compressorQu;
	}
	
	@Override
    public String toString() {		
        return "Fridge:\n" + super.toString() + "doorQu=" + doorQu + "\n" + "compressorQu=" + compressorQu + "\n";
    }
}
