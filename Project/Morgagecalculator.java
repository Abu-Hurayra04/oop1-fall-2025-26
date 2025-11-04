import java.text.NumberFormat;
import java.util.Scanner;

public class Morgagecalculator {
    public static void main(String[] args){
        System.out.println("==Mortgage Calculator==");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan Amount: ");
        int p = input.nextInt();
        System.out.println("Enter Annual Interest Rate: ");
        float r = input.nextFloat();
        System.out.println("Enter Loan Period: " );
        int n = input.nextInt();


        double M = p*(r*Math.pow((1+r),n))/(Math.pow( (1+r) , n)-1);
        double Monthly = M /(n*12);
        double I = M-p;





        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
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



    }
}
