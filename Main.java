public class Main {
    public static void main(String[] args) {

        // Create manufacturer objects
        Manufacture toyota = new Manufacture("Toyota",1937, 295000000);
        Manufacture tesla = new Manufacture("Tesla",1934, 235000000);
        Manufacture ford = new Manufacture("Ford",1930, 275000000);

        // Create engine objects for different engine types
        Engine combustionEngine = new CombustionEngine("Petrol");
        Engine electricEngine = new ElectricEngine("Electric");
        Engine hybridEngine = new HybridEngine("Hybrid");

        // Create an array of vehicles, each with a specific type and engine
        Vehicle[] vehicles = {
            new ICEV(toyota, combustionEngine),
            new BEV(tesla, electricEngine),
            new HybridV(ford, hybridEngine)
        };

        // Iterate through the vehicles and display their characteristics
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}
