import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    
   public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int numberOfTaxpayers = sc.nextInt();

        List<Contribuinte> taxpayers = new ArrayList<>();

        for(int i = 0; i < numberOfTaxpayers; i++){

            System.out.println("Taxpayer #" + (i + 1) + " data:");

            System.out.print("Individual or company: (i/c)? ");
            char typeOfTaxpayer = sc.next().charAt(0);

            System.out.print("Name: ");
            String nameOfTaxpayer = sc.next();

            System.out.print("Anual Income: ");
            double anualIncomeOfTaxpayer = sc.nextDouble();

            switch(typeOfTaxpayer){
                case 'i':
                    System.out.print("Health Expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    Individual pessoaFisica = new Individual(nameOfTaxpayer, anualIncomeOfTaxpayer, healthExpenditures);

                    taxpayers.add(pessoaFisica);

                    break;

                case 'c':
                    System.out.print("Number of Employees: ");
                    int numberOfEmployee = sc.nextInt();
                    Company pessoaJuridica = new Company(nameOfTaxpayer, anualIncomeOfTaxpayer, numberOfEmployee);
                    
                    taxpayers.add(pessoaJuridica);

                    break;

                default:
                    System.out.println("Error!");
            }
        }

        System.out.println();
        System.out.println("Taxes Paid:");

        for(Contribuinte cb: taxpayers){
            System.out.println(cb.getName() + ": R$" + String.format("%.2f", cb.tax()));
        }

        System.out.println();

        double sum = 0.0;

        for(Contribuinte cb: taxpayers){
            sum += cb.tax();
        }

        System.out.println("Total Taxes: R$" + String.format("%.2f", sum));


        sc.close();

   }

}
