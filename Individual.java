public class Individual extends Contribuinte{
    
    // Atributos
    private double healthExpenditures;

    // Construct
    public Individual(){}
    
    public Individual(String name, double anualIncome, double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    // Métodos
    public double tax(){

        double basicTax = (getHealthExpenditures() < 20000.0 ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25);

        // if(getAnualIncome() < 20000){
        //     basicTax = getAnualIncome() * 0.15;
        // } else{
        //     basicTax = getAnualIncome() * 0.25;
        // }

        basicTax -= getHealthExpenditures() * 0.5;

        if(basicTax < 0.0){
            return 0.0;
        } else{
            return basicTax;
        }
    }
    
    // Getters
    public double getHealthExpenditures(){
        return healthExpenditures;
    }

    // Setters
    public void setHealthExpenditures(double healthExpenditures){
        this.healthExpenditures = healthExpenditures;
    }




}
