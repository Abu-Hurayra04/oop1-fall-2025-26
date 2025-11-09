import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Morgagecalculator {
    public static void main(String[] args){
        Locale bdlocale = Locale.of("en","BD");
        System.out.println("==Mortgage Calculator==");
        Scanner sc = new Scanner(System.in);
        
        double salary = 0;
        while (true){
        System.out.print("Enter Salary: ");
        if(sc.hasNextDouble()){
        salary = sc.nextDouble();
        break;
        }else{
            System.out.println("Invalid input.Please enter a numeric value.");
            sc.next();
        }
        }
        
         if (salary>=40000) {
            System.out.println("Next");
        }
        else{System.out.println("You are not elegible for loan.");}
        
        double credit = 0;
        while(true){
        System.out.print("Enter your cridet score: ");
        if(sc.hasNextDouble()){
        credit = sc.nextDouble();
        if(credit >= 0 && credit <= 500){
            break;
        }else{
            System.out.println("Your credit score must be between 0 and 500");
            sc.next();
        }
    }
}

        if(credit>=300 || credit==500){
            System.out.println("Next");
        }
        else{System.out.println("You are not elegible for loan.");}
        
        boolean record = false;
        while(true){
        System.out.println("Criminal record: ");
        if(sc.hasNextBoolean()){
        record = sc.nextBoolean();
        break;
        }else{
            System.out.println("Invalid input! Please type 'true'or 'false'.");
            sc.next();
        }
    }
        if(record == true || record != false ){
          System.out.println("You are not elegible for loan.");  
        }
         else {
        System.out.println("Next");
    }




        int p = 0;
        while(true){
        System.out.print("Enter Loan Amount(BDT): ");
        if(sc.hasNextDouble()){
        p = sc.nextInt();
        
        if(p <= salary*2){
            break;
        }
        else{
         System.out.println("You are not elegible for loan.");
        }
    }else{
        System.out.println("Invalid input! Please enter numeric value.");
        sc.next();
    }
}
        float R = 0;
        while(true){
        System.out.print("Enter Annual Interest Rate: ");
        if(sc.hasNextFloat()){
        R = sc.nextFloat();
        break;
        }else{
           System.out.println("Invalid input! Please enter numeric value."); 
           sc.next();
        }
    }
    int n = 0;
    while(true){
        System.out.print("Enter Loan Period: " );
        if(sc.hasNextInt()){
        n = sc.nextInt();
        break;
        }else{
           System.out.println("Invalid input! Please enter numeric value.");
           sc.next(); 
        }
    }

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
