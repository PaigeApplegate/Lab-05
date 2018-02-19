import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        //variable
        double MPG, rawRange, percentage, tankCapacity;
        int rawRange2;


        Scanner scnr = new Scanner(System.in);

        //ask user
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        MPG = scnr.nextDouble();

        if (MPG<=0){
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        }
        else {

            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            tankCapacity = scnr.nextDouble();

            if (tankCapacity <= 0) {
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }
            else {

                System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
                percentage = scnr.nextDouble();

                if (percentage > 100 || percentage < 0) {
                    System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100" +
                            "(INCLUSIVE)!!!");
                }
                else {

                    //formula
                    rawRange = MPG * tankCapacity * (percentage * 0.01);

                    //round rawRange
                    rawRange2 = (int) rawRange;


                    //result
                    if (rawRange <= 25) {
                        System.out.print("Attention! Your current estimated range is running low: " + rawRange2 +
                                " miles left!!!");
                    } else if (rawRange > 25) {
                        System.out.print("Keep driving! Your current estimated range is: " + rawRange2 + " miles!");
                    }
                }
            }
        }
    }
}
