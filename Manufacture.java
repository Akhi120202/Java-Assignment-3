public class Manufacture {

    private String name;
    private int yearOfFoundation;
    private double yearlyIncome; 
    

    //constructor
    public Manufacture(String name, int yearOfFoundation, double yearlyIncome) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.yearlyIncome = yearlyIncome; 
        
    }

    //getmethod
    public String getName() {
        return name;
    }

    //setmethod
    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

   
}
