
## Java-Assignment-3
## Matriculation number: 7213389
## Enviroment: Visual Studio code

## Engine class
The Engine class represents different types of engines for vehicles. It has the following attributes and methods:

1. private String type: This attribute stores the type of engine.

2. public Engine(String type): This constructor initialized the engine type when an Engine object is created.

3. public String getType(): This getter method returns the engine type.

4. public void setType(String type): This setter method allowed to set the engine type.



## CombustionEngine Class (Subclass of Engine)
The CombustionEngine class is a subclass of Engine representing a combustion engine. It inherits the attributes and methods from the parent Engine class.

1. public CombustionEngine(String type): This constructor initializes a combustion engine with a specified engine type.


## ElectricEngine Class (Subclass of Engine)
The ElectricEngine class is a subclass of Engine representing an electric engine. Like CombustionEngine, it inherits the attributes and methods from the parent Engine class.

1. public ElectricEngine(String type): This constructor initializes an electric engine with a specified engine type.


## HybridEngine Class (Subclass of Engine)
The HybridEngine class is a subclass of Engine representing a hybrid engine. It inherits the attributes and methods from the parent Engine class.

1. public HybridEngine(String type): This constructor initializes a hybrid engine with a specified engine type.



## Manufacture Class
The Manufacture class stores information about the manufacturer of vehicles. It has the following attributes and methods:

1. private String name, private int yearOfFoundation; private double yearlyIncome;: This attribute stores the name, year of foundation and yearly income of the manufacturer.

2. public Manufacture(String name, string year of foundation, string yearly income): This constructor initializes the manufacturer's name,year of foundation and yearly income when a Manufacture object is created.

3. public String getName(): This getter method returns the manufacturer's name.

4. public void setName(String name): This setter method allows to set the manufacturer's name.

5. public String getYearoffoundation(): This getter method returns the manufacturer's year of foundation.

6. public String setYearoffoundation(): This getter method allows to set the manufacturer's year of foundation.

7. public String getYearoffoundation(): This getter method returns the manufacturer's year of foundation.

8. public String setYearoffoundation(): This setter method set the manufacturer's year of foundation.



## Vehicle Class (Abstract)
The Vehicle class is an abstract class that represents super class vehicle. It has the following attributes and methods:

1. private Manufacture manufacture: This attribute represents the manufacturer of the vehicle.

2. private Engine engine: This attribute represents the engine of the vehicle.

3. public Vehicle(Manufacture manufacture, Engine engine): This constructor initializes the manufacture and engine of the vehicle when a Vehicle object is created.

4. public Manufacture getManufacture(): This getter method returns the manufacturer of the vehicle.

5. public void setManufacture(Manufacture manufacture): This setter method allows to set the manufacturer of the vehicle.

6. public Engine getEngine(): This getter method returns the engine of the vehicle.

7. public void setEngine(Engine engine): This setter method allows to set the engine of the vehicle.

8. public abstract void ShowCharacteristics(): This abstract method is implemented by subclasses. It shows the characteristics of the vehicle.


## ICEV Class (Subclass of Vehicle)
1. The ICEV class is a subclass of Vehicle representing ICEV. It inherits attributes and methods from the parent Vehicle class.

2. public ICEV(Manufacture manufacture, Engine engine): This constructor initializes an ICEV with a specified manufacture and engine.

3. public void ShowCharacteristics(): This method is implemented to display the characteristics of an ICEV, including the manufacturer's name, vehicle type, and engine type.


## BEV Class (Subclass of Vehicle)
1. The BEV class is a subclass of Vehicle representing BEV. Like ICEV, it inherits attributes and methods from the parent Vehicle class.

2. public BEV(Manufacture manufacture, Engine engine): This constructor initializes a BEV with a specified manufacture and engine.

3. public void ShowCharacteristics(): This method is implemented to display the characteristics of a BEV, including the manufacturer's name, vehicle type, and engine type.


## HybridV Class (Subclass of Vehicle)
1. The HybridV class is a subclass of Vehicle representing HybridV. It inherits attributes and methods from the parent Vehicle class.

2. public HybridV(Manufacture manufacture, Engine engine): This constructor initializes a HybridV with a specified manufacture and engine.

3. public void ShowCharacteristics(): This method is implemented to display the characteristics of a HybridV, including the manufacturer's name, vehicle type, and engine type.


## Main Class
public static void main(String[] args): Here in the main method, created instances of manufacturers, engines, and vehicles, and then displayed the characteristics of each vehicle.
