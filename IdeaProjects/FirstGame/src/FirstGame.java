import java.util.Scanner;
public class FirstGame {
    public static void main(String[] args){

        //Variables
        Scanner in = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);
        String playrName, hair, eye;
        String SecondName;
        int age;

        boolean running = true;

        //Game Start
        System.out.println("");
        System.out.println("Hello. Welcome to my game.");
        GAME:
        while(running) {


            System.out.println("");
            System.out.println("(What do you ask?)");
            System.out.println("1. Who are you?");
            System.out.println("2. Where am I?");
            System.out.println("3. What is my name?");
            System.out.println("4. Good bye.");


            String input = in.nextLine();

            if (input.equals("1")) {
                System.out.println("(You asked 'Who are you?')");
                System.out.println("");

                System.out.println("I am the developer of this game." +
                        " Who else would I be?");
                System.out.println("...");
                System.out.println("Perhaps you are looking for someone?");



                //Anwser queston with a yes, no, maybe
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.println("3. Maybe...");
                String input2 = in.nextLine();

                //Next path

                if (input2.equals("1")){
                    System.out.println("(You responded quietly with 'yes')");
                    System.out.println("");
                    System.out.println("Oh, I am sorry. Maybe I can help look for them.");
                    System.out.println("Can you describe them for me?");
                    System.out.println("");
                    System.out.println("(Enter their hair color)");
                    //answer question
                    hair = scnr.next();
                    System.out.println("(You told mysterious developer that" +
                            " their hair is " + hair + ".)");
                    System.out.println("");
                    System.out.println("Ok. Do you have any other details about them?");
                    System.out.println("");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    //new path

                    String input4 = in.nextLine();

                    if (input4.equals("1")){
                        System.out.println("");
                        System.out.println("(Enter their eye color)");
                        eye = scnr.next();
                        System.out.println("(You said that their eye color is " +
                        eye + ".)");
                        System.out.println("");
                        System.out.println("(You hear the sounds of pencil writing on paper)");
                        System.out.println("");
                        System.out.println("All righty. " + hair + " hair and " +
                        eye + " eyes.");
                        System.out.println("Anything else?");
                        System.out.println("");
                        System.out.println("1. Yes");
                        System.out.println("2. No");

                        //path

                        String input5 = in.nextLine();

                        if (input5.equals("1")) {
                            System.out.println("");
                            System.out.println("(Enter their age.)");
                            age = scnr.nextInt();
                            System.out.println("(You said they are " + age + " years old.)");
                            System.out.println("");
                            System.out.println("(You hear the sound of paper ripping)");
                            System.out.println("");
                            System.out.println("Ok. Let me see if I have this right.");
                            System.out.println("So they have " + hair + " hair and " + eye +
                                    " eyes and are " + age + " years old.");
                            System.out.println("...");
                            System.out.println("Well, this is a bit problematic.");
                            System.out.println("I actually have seen many " + hair + " hair, " +
                                    eye + " eyed, " + age + " year olds.");
                            System.out.println("Do you have anything else?");
                            System.out.println("");
                            System.out.println("(Enter their name)");
                            SecondName = scnr.next();

                            System.out.println("");
                            System.out.println("... " + SecondName + "?");
                            System.out.println("(It is silent)");
                            System.out.println("(Sounds of paper getting balled up and thrown away" +
                                    " fill the area.)");
                            System.out.println("");
                            System.out.println("Sorry. Can't help you.");
                            System.out.println("");
                            System.out.println("(Say something?)");
                            System.out.println("1. No");
                            System.out.println("2. Yes");

                            String input6 = in.nextLine();

                            if (input6.equals("1")){
                                System.out.println("");
                                System.out.println("(You guess that it is best not to bother them.)");

                            }
                            if (input6.equals("2")){
                                System.out.println("");
                                System.out.println("(You ask if something is wrong)");
                                System.out.println("");
                                System.out.println("No.");
                                System.out.println("");
                                System.out.println("(You ask if they really don't know anything)");
                                System.out.println("");
                                System.out.println("...");
                            }
                        }
                        if (input5.equals("2")){
                            System.out.println("");
                            System.out.println("(You say that you can't think of anything else)");
                            System.out.println("");
                            System.out.println("Ok. Well I don't think I have enough information.");
                            System.out.println("Please do let me know if think of anything else");
                        }


                    }if (input4.equals("2")){
                        System.out.println("");
                        System.out.println("(You admit that you don't have anything else)");
                        System.out.println("");
                        System.out.println("Oh. Ok. If you come up with anything else, don't hesitate " +
                        "tell me.");
                    }



                }
                else if (input2.equals("2")){
                    System.out.println("");
                    System.out.println("(You say that you are not looking for anyone.)");
                    System.out.println("");
                    System.out.println("My mistake. But if you are I would be more than happy to try to help.");
                    System.out.println("Are there any other questions you wish to ask me?");

                }

                else if (input2.equals("3")){
                    System.out.println("");
                    System.out.println("(You say that your memory's a bit fuzzy)");
                    System.out.println("");
                    System.out.println("That's not good. Maybe you need some rest?");
                    System.out.println("Well if anything clears up, please tell me. I really do wish to help.");
                }

            } else if (input.equals("2")) {
                System.out.println("(You asked 'where am I?')");
                System.out.println("");
                System.out.println("You don't know?");
                System.out.println("(They chuckle)");
                System.out.println("Did you try looking around?");
                System.out.println("");
                System.out.println("(Look around?)");
                System.out.println("1. Yes");
                System.out.println("2. No");

                //Path
                String input3 = in.nextLine();

                if (input3.equals("1")) {
                    System.out.println("(You look around the area)");
                    System.out.println("(You notice that it is bright." +
                            " However, there is nothing else around.)");
                    System.out.println("(You tilt your head in confusion " +
                            "but the being doesn't respond)");


                } if (input3.equals("2")) {
                    System.out.println("");
                    System.out.println("Well, your stubborn aren't you?");
                }


            } else if (input.equals("3")) {
                System.out.println("(You asked 'What is my name?)");
                System.out.println("");
                System.out.println("What ever do you mean?");

                // ask another question same response either way

                System.out.println("Oh no. Did I forget to code it to " +
                        "ask your name?");
                System.out.println("Hold on a brief second.");
                System.out.println("...");
                System.out.println("There we go.");
                System.out.println("");
                System.out.println("Please Enter Your Name: ");
                playrName = scnr.next();
                System.out.println("Welcome Player " + playrName + "!");
                System.out.println("");
                System.out.println("Well then, hello " + playrName +
                        ". It's a pleasure to meet you.");
                System.out.println("Now, do you have any more questions for me?");


            }else if (input.equals("4")){
                System.out.println("Good bye! Hopefully we will meet again.");
                break;


            }else if (input.equals("6")){
                System.out.println("(You say that you wish to see them)");
                System.out.println("");
                System.out.println("...");
                System.out.println("What?");
                System.out.println("");
                System.out.println("(You repeat yourself)");
                System.out.println("");
                System.out.println("But, you are looking at me.");
                System.out.println("I am nothing more than the screen you so fondly stare at.");
                System.out.println("");
                System.out.println("(You say that you want to see their true self)");
                System.out.println("");
                System.out.println("Don't we think that we are getting a bit too ambitious there Semele?");
                break;



            } else {
                System.out.println("(Please choose one of the choices.)");



            }
        }




    }
}
