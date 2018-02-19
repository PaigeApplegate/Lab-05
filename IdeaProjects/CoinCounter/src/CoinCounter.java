import java.util.Scanner;
public class CoinCounter {
    public static void main(String[] args){
        //Variables
        double oneDollar, fiveDollar, tenDollar, twentyDollar;
        int penniesE, oneDollarE, fiveDollarE, tenDollarE, twentyDollarE, dimesE, nickelsE, quarterE;
        Double dimes, nickels, pennies, quarters, totalPennies, totalDimes, totalNickels, totalQuarters, totalOneDollar;
        Double totalFiveDollar, totalTenDollar, totalTwentyDollar, totalAmount;
        Scanner input = new Scanner(System.in);

        //Value
        oneDollar = 1;
        fiveDollar = 5;
        tenDollar = 10;
        twentyDollar = 20;
        dimes = 0.1;
        nickels = 0.05;
        pennies = 0.01;
        quarters = 0.25;

        //Prompt user
        System.out.println("Enter number of pennies: ");
        penniesE = input.nextInt();
        System.out.println("Enter number of nickels: ");
        nickelsE = input.nextInt();
        System.out.println("Enter number of dimes: ");
        dimesE = input.nextInt();
        System.out.println("Enter number of quarters: ");
        quarterE = input.nextInt();
        System.out.println("Enter number of one dollar bills: ");
        oneDollarE = input.nextInt();
        System.out.println("Enter number of five dollar bills: ");
        fiveDollarE = input.nextInt();
        System.out.println("Enter number of ten dollar bills: ");
        tenDollarE = input.nextInt();
        System.out.println("Enter number of twenty dollar bills: ");
        twentyDollarE = input.nextInt();


        //Variables 2
        totalPennies = pennies * penniesE;
        totalDimes = dimes * dimesE;
        totalNickels = nickels * nickelsE;
        totalQuarters = quarters * quarterE;
        totalOneDollar = oneDollar * oneDollarE;
        totalFiveDollar = fiveDollar * fiveDollarE;
        totalTenDollar = tenDollar * tenDollarE;
        totalTwentyDollar = twentyDollar * twentyDollarE;
        totalAmount = totalPennies + totalDimes + totalNickels + totalQuarters +
                totalOneDollar + totalFiveDollar + totalTenDollar + totalTwentyDollar;

        System.out.println("You have $" + totalAmount + "!");

        double innn;
        innn = 10.0 * Math.pow(2.0, 3.0);
        System.out.print(innn);
        System.out.println(totalAmount + 89.98);




    }


}
