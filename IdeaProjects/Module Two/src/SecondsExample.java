import java.util.Scanner;
public class SecondsExample
{
    public static void main(String[] args) {
        //Variable
        int minutes, seconds, totalSeconds;
        Scanner input = new Scanner(System.in);

        //Obtain total seconds
        System.out.print("Enter an integer for seconds:  ");
        totalSeconds = input.nextInt();

        //Calculate minutes, seconds
        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;


        //Display results
        System.out.println(totalSeconds + " seconds is "
                + minutes + " minutes and " + seconds + " seconds.");
    }
}
