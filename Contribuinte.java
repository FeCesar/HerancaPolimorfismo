public abstract class Contribuinte{
    
    // Atributos
    private String name;
    private double anualIncome;


    // Construct
    public Contribuinte(){}

    public Contribuinte(String name, double anualIncome){
        super();
        this.name = name;
        this.anualIncome = anualIncome;
    }

    // Métodos
    public abstract double tax();


    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAnualIncome(double anualIncome){
        this.anualIncome = anualIncome;
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public double getAnualIncome(){
        return this.anualIncome;
    }

}