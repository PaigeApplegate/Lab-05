import java.util.Scanner;
public class MonthlyPayments {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        double anualInterest, monthlyInterest, loneAmount, monthlyPayment, TotalPayment;
        int years;

        //Obtain yearly interest rate
        System.out.print("Enter yearly interest rate, such as 8.5:" );
        anualInterest = input.nextDouble();
        //obtain number of years
        System.out.print("Enter the number of years as an integer:" );
        years = input.nextInt();
        //obtain total amount
        System.out.print("Enter the total loan amount, such as 12000.35: ");
        loneAmount = input.nextDouble();

        //Calculate monthly interest
        monthlyInterest = anualInterest / 1200;

        //Calculate monthly payment
        monthlyPayment = (loneAmount * monthlyInterest) /
                (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));

        //Calculate total payment
        TotalPayment = monthlyPayment * years * 12;

        //Display monthly and total payments
        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int)(TotalPayment * 100) / 100.0);
    }
}
