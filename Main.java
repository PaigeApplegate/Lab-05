import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        //variables
        int placement, value2, length, power;
        char value;
        long total;
        String decimal;
         
        Scanner scnr = new Scanner(System.in);
        //set total to 0
        total=0;

        //prompt user
        System.out.print("Enter a hexadecimal number: ");
        decimal = scnr.next();
        //find the length of decimal
        length = decimal.length();
        placement = length - 1;
        power = 0;

        //while statement
        while(placement >= 0){
            //reset value2
            value2=0;

            decimal.charAt(placement);
            value = decimal.charAt(placement);

            //characters to numbers
            if ((value == 'a')||(value==  'A'))
                value2 = 10;
            if ((value == 'b')||(value ==  'B'))
                value2 = 11;
            if ((value == 'c')||(value ==  'C'))
                value2 = 12;
            if ((value == 'd')||(value ==  'D'))
                value2 = 13;
            if ((value == 'e')||(value ==  'E'))
                value2 = 14;
            if ((value == 'f')||(value ==  'F'))
                value2 = 15;
            if (value == '1')
                value2 = 1;
            if (value == '2')
                value2 = 2;
            if (value == '3')
                value2 = 3;
            if (value == '4')
                value2 = 4;
            if (value == '5')
                value2 = 5;
            if (value == '6')
                value2 = 6;
            if (value == '7')
                value2 = 7;
            if (value == '8')
                value2 = 8;
            if (value == '9')
                value2 = 9;

            //formula to calculate total
            total = (long)(value2*Math.pow(16,power) + total);
            //increase power, decrease placement
            placement = placement - 1;
            power = power + 1;
        }
        //Show results
        System.out.println("Your number is " + total + " in decimal");
    }
}
