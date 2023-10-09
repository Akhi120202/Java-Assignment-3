//subclass
public class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    // Implementation of the ShowCharacteristics method for HybridV
    @Override
    public void ShowCharacteristics() {

        Manufacture manufacturer = getManufacture();
        System.out.println(manufacturer.getName() + " is an HybridV with " + getEngine().getType() + " engine " + " which is founded on " + manufacturer.getYearOfFoundation() + " and yearly income is " + manufacturer.getYearlyIncome());
    }
    }
    
