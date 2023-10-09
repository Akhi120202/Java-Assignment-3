//subclass 
public class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    // Implementation of the ShowCharacteristics method for BEV
    @Override
    public void ShowCharacteristics() {

        Manufacture manufacturer = getManufacture();
        System.out.println(manufacturer.getName() + " is a BEV with " + getEngine().getType() + " engine " + " which is founded on " + manufacturer.getYearOfFoundation() + " and yearly income is " + manufacturer.getYearlyIncome());
    }
    }

    
