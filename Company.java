public class Company extends Contribuinte{
    
    // Atributos
    private int numberOfEmployee;

    // Construct
    public Company(){}

    public Company(String name, double anualIncome, int numberOfEmployee){
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    // Metodos
    public double tax(){

        double basicTax = (getNumberOfEmployee() > 10 ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16);

        if(basicTax < 0){
            return 0.0;
        } else{
            return basicTax;
        }

    }

    // Getters
    public int getNumberOfEmployee(){
        return this.numberOfEmployee;
    }
    // Setters
    public void setNumberOfEmployee(int numberOfEmployee){
        this.numberOfEmployee = numberOfEmployee;
    }
        

}
