//subclass
public class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    // Implementation of the ShowCharacteristics method for ICEV
    @Override
    public void ShowCharacteristics() {
        Manufacture manufacturer = getManufacture();
        System.out.println(manufacturer.getName() + " is an ICEV with " + getEngine().getType() + " engine" + " which is founded on " + manufacturer.getYearOfFoundation() + " and yearly income is " + manufacturer.getYearlyIncome());
    }
    }
    
