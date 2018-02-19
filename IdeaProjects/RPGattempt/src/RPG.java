import java.util.Random;
import java.util.Scanner;
public class RPG {
    public static void main(String[] args){
        //variables
        String playrName;

        Scanner in = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        //game
        System.out.println("");
        System.out.print("Enter Player Name: ");
        playrName = scnr.next();

        System.out.println("Welcome Player " + playrName + "!");
        System.out.println("");
        System.out.println("You are at the entrance of a dark cave.");
        System.out.println("It's too dark to see inside.");
        System.out.println("You can sense something is after you.");
        System.out.println("However when you look behind you, you don't see anything.");
        System.out.println("");
        System.out.println("          What Do You Do?");
        System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~         ");
        System.out.println("       1. Run blind into the cave");
        System.out.println("       2. Stand around");
        System.out.println("       3. Hide in a bush");
        System.out.println("");

        String input = in.nextLine();
        if (input.equals("1")) {
            System.out.println("You run head first into the cave.");
            System.out.println("Your foot steps echo off the walls of the cave.");
            System.out.println("Once you are sure you are completely hidden in the");
            System.out.println("you stop to catch your breath.");
            System.out.println("");
            System.out.println("          What Do You Do?");
            System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~         ");
            System.out.println("       1. Search the cave");
            System.out.println("       2. Keep walking");
            System.out.println("");

            String input2 = in.next();
            if (input2.equals("1")){

            }
            else if (input2.equals("2")){

            }
        }
        else if (input.equals("2")) {
            System.out.println("You stand outside the cave.");
            System.out.println("The darkness of the cave unsettles you.");
            System.out.println("That feeling has to be false right?");
            System.out.println("After all no one is behind you... right?");
            System.out.println("");
            System.out.println("You hear the sound of leaves rustling behind you.");
            System.out.println("A chill runs up your spine.");
            System.out.println("");
            System.out.println("          What Do You Do?");
            System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~         ");
            System.out.println("       1. Turn around");
            System.out.println("       2. Stay still");
            System.out.println("");

            String input3 = in.next();
            if (input3.equals("1")) {

            }
            else if (input3.equals("2")) {

            }
        }
        else if (input.equals("3")) {
            System.out.println("You decide not to take a chance with the cave");
            System.out.println("or with what ever was following you.");
            System.out.println("You dive into a nearby bush and wait.");
            System.out.println("You count the seconds as they slowly pass by.");
            System.out.println("1...");
            System.out.println("2...");
            System.out.println("3...");
            System.out.println("...");
            System.out.println("You hear the sounds of quiet foot steps.");
            System.out.println("Then a barely audible low hum.");
        }


    }
}
