// Abstract Vehicle class with a Manufacture and Engine

abstract class Vehicle {

    private Manufacture manufacture;
    private Engine engine;

    //constructor
    public Vehicle(Manufacture manufacture, Engine engine) {

        this.manufacture = manufacture;
        this.engine = engine;
    }

    //getmethod manufacture
    public Manufacture getManufacture() {
        return manufacture;
    }

    //setmethod manufature
    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }
    
    //getmethod engine
    public Engine getEngine() {
        return engine;
    }

    
    //setmethod engine
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Abstract method to show characteristics of the vehicle
    public abstract void ShowCharacteristics();
    
}
