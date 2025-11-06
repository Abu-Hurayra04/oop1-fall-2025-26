import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Morgagecalculator {
    public static void main(String[] args){
        Locale bdlocale = Locale.of("en","BD");
        System.out.println("==Mortgage Calculator==");
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
         if (salary>=40000) {
            System.out.println("Next");
        }
        else{System.out.println("You are not elegible for loan.");}
        
        
        System.out.print("Enter your cridet score: ");
        double credit = sc.nextDouble();
        if(credit>=300 || credit==500){
            System.out.println("Next");
        }
        else{System.out.println("You are not elegible for loan.");}


        System.out.println("Criminal record: ");
        boolean record = sc.nextBoolean();
        if(record == true || record != false ){
            System.out.println("You are not elegible for loan.");
        }
         else {
        System.out.println("Next");
    }





        
        System.out.print("Enter Loan Amount(BDT): ");
        int p = sc.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        float R = sc.nextFloat();
        System.out.print("Enter Loan Period: " );
        int n = sc.nextInt();

        double r = R/100;
        double M =p+ p*(r*Math.pow((1+(r)),n))/(Math.pow( (1+(r)) , n)-1);
        double Monthly = (M) /(n*12);
        double I = M-p;
         




        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdlocale);
        
        String formattedValue = currencyFormatter.format(p);
        System.out.println("Loan Amount: "+formattedValue);

        String formattedMonthly = currencyFormatter.format(Monthly);
        System.out.println("Monthly: "+formattedMonthly);

        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String percentValue = percentFormatter.format(r);
        System.out.println("Interest Rate: "+percentValue);

        NumberFormat integerFormatter = NumberFormat.getIntegerInstance();
        String intValue = integerFormatter.format(n);
        System.out.println("loan Period: "+intValue);

        String formattedInterest = currencyFormatter.format(I);
        System.out.println("Total Interest Amount: "+formattedInterest);

        String formattedTotalamount = currencyFormatter.format(M);
        System.out.println("Total Amount: "+formattedTotalamount);



    }
}
