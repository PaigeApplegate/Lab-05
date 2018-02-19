import java.util.Random;
import java.util.Scanner;
public class Game2 {
    public static void main(String[] args){

        //variable

        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        int number, key;
        String playrName, write;
        boolean running = true;


        //game
        number = randGen.nextInt(2)+1;

        System.out.println("Please Enter Your Name: ");
        playrName = scnr.next();

        System.out.println("You wake up in a dark area.");
        System.out.println("You can't even see your hand in front of your face");
        System.out.println("");

        System.out.println("What do you do?");
        System.out.println("1. Look around");
        System.out.println("2. Stay where you are");

            String input = in.nextLine();

            if (input.equals("1")) {

                if (number < 2) {

                    System.out.println("You search around find a light switch!");
                    System.out.println("You flip it and the area illuminates with a bright white light.");
                    System.out.println("It appears that you are in a small room.");
                    System.out.println("It is complete with a small bed, dresser, bookcase, and desk.");
                    key = 1;
                    while (running) {
                        System.out.println("");
                        System.out.println("What do you do?");
                        System.out.println("1. Check desk");
                        System.out.println("2. Look at bookcase");
                        System.out.println("3. Sit on bed");
                        System.out.println("4. Go through dresser");
                        System.out.println("5. Open door");

                        String input2 = in.next();
                        if (input2.equals("1")) {
                            System.out.println("You check the desk.");
                            System.out.println("It looks like it's made of a dark wood and is several years old.");
                            System.out.println("Inside the drawers are a bunch of blank pieces of paper.");
                            System.out.println("There is also a pen.");
                            System.out.println("");
                            System.out.println("Write on the paper?");
                            System.out.println("1. Yes!");
                            System.out.println("2. No");
                            String input5 = in.next();

                            if (input5.equals("1")){
                                System.out.println("What do you write?");
                                System.out.println(":");
                                write = scnr.next();
                                System.out.println("You wrote " + write + " and signed with -" + playrName);
                                System.out.println("You closed the drawers, but left the note on the table.");
                            }
                            else if (input5.equals("2")){
                                System.out.println("You put the paper and pen back in their spots.");
                            }

                        } else if (input2.equals("2")) {
                            System.out.println("You looked at the bookcase thoughtfully.");
                            System.out.println("You noticed that one of the books was out of place.");
                            System.out.println("You took it out and flipped through the pages.");
                            System.out.println("A key falls out of the book.");
                            System.out.println("You obtained a key!");
                            key = 2;

                        } else if (input2.equals("3")) {
                            System.out.println("You sit on the small bed.");
                            System.out.println("It is surprisingly hard like a rock.");
                            System.out.println("The blankets feel really soft and warm, but you definitely would " +
                            "not recommend sleeping on the bed.");
                            System.out.println("That is, unless, you want to wake up with any side of the bed " +
                            "being the wrong side.");
                            System.out.println("");
                            System.out.println("Sleep on the bed?");
                            System.out.println("1. Lets do it!");
                            System.out.println("2. Nah");
                            String input6 = in.next();

                            if (input6.equals("1"))  {
                                System.out.println("You lied on the over-rated bolder and took a nap.");
                                System.out.println("...");
                                System.out.println("Just as you suspected you were extremely stiff when " +
                                "you woke up.");
                                System.out.println("So much so that you couldn't move no matter what you did.");
                                System.out.println("You stared up at the ceiling accepting that this was your life now.");
                                break;
                            }
                            else if (input6.equals("2")) {
                                System.out.println("Using your reasoning skills, you determined that sleeping on the " +
                                "bed would not benefit your health.");
                                System.out.println("You continued looking around the room.");
                            }

                        } else if (input2.equals("4")) {
                            System.out.println("You go though the dresser and find various clothes.");
                            System.out.println("They are all different colors and sizes.");
                            System.out.println("The fabric feels rough and scratchy.");
                            System.out.println("You wonder how anyone would willingly wear any of these.");
                            System.out.println("You close the dresser and look else where.");

                        } else if (input2.equals("5")) {
                            System.out.println("You tried to open the door.");
                            System.out.println("It is locked.");
                            if (key > 1) {
                                System.out.println("");
                                System.out.println("You used the key.");
                                System.out.println("The door unlocked!");
                                System.out.println("You walk through the door, escaping the room.");
                                System.out.println("You breath the free fresh air outside.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Congratulations " + playrName + "! You beat the game!");
                                System.out.println("Feel free to go back and try out different routes!");
                                break;
                            }

                        } else {
                            System.out.println("Please choose one of the numbers.");
                        }
                    }
                } else if (number > 1) {
                    System.out.println("You walk into an object and fall.");
                    System.out.println("Thankfully it was soft, so it did not do any damage.");
                    System.out.println("You attempt to get back up again and walk around" +
                            " but you run into another object.");
                    System.out.println("This one was hard and you ended up bruising your knee.");
                    System.out.println("After the two failed attempts you sit down on the floor " +
                            "and try to think of what to do next.");
                    System.out.println("");
                    System.out.println("What do you do next?");
                    System.out.println("1. Continue sitting on the floor");
                    System.out.println("2. Walk around");
                    System.out.println("3. Crawl around");

                    String input3 = in.next();

                    if (input3.equals("1")) {
                        System.out.println("You decided that you don't want to play the darkness's " +
                                "games anymore.");
                        System.out.println("The darkness doesn't control you!");
                        System.out.println("You are in control of your own destiny!");
                        System.out.println("So, you decide to wait it out.");
                        System.out.println("... and wait");
                        System.out.println("... and wait");
                        System.out.println("... and wait");
                        System.out.println("...");
                        System.out.println("You hear a noise.");
                        System.out.println("It sounds like a buzzer.");
                        System.out.println("Suddenly the room is filled with light.");
                        System.out.println("");
                        System.out.println("You appear to be in a small room.");
                        System.out.println("It is complete with a small bed, dresser, bookcase, and desk.");
                        key = 1;
                        while (running) {
                            System.out.println("");
                            System.out.println("What do you do?");
                            System.out.println("1. Check desk");
                            System.out.println("2. Look at bookcase");
                            System.out.println("3. Sit on bed");
                            System.out.println("4. Go through dresser");
                            System.out.println("5. Open door");

                            String input2 = in.next();
                            if (input2.equals("1")) {
                                System.out.println("You check the desk.");
                                System.out.println("It looks like it's made of a dark wood and is several years old.");
                                System.out.println("Inside the drawers are a bunch of blank pieces of paper.");
                                System.out.println("There is also a pen.");
                                System.out.println("");
                                System.out.println("Write on the paper?");
                                System.out.println("1. Yes!");
                                System.out.println("2. No");
                                String input5 = in.next();

                                if (input5.equals("1")){
                                    System.out.println("What do you write?");
                                    System.out.println(":");
                                    write = scnr.next();
                                    System.out.println("You wrote " + write + " and signed with -" + playrName);
                                    System.out.println("You closed the drawers, but left the note on the table.");
                                }
                                else if (input5.equals("2")){
                                    System.out.println("You put the paper and pen back in their spots.");
                                }

                            } else if (input2.equals("2")) {
                                System.out.println("You looked at the bookcase thoughtfully.");
                                System.out.println("You noticed that one of the books was out of place.");
                                System.out.println("You took it out and flipped through the pages.");
                                System.out.println("A key falls out of the book.");
                                System.out.println("You obtained a key!");
                                key = 2;

                            } else if (input2.equals("3")) {
                                System.out.println("You sit on the small bed.");
                                System.out.println("It is surprisingly hard like a rock.");
                                System.out.println("The blankets feel really soft and warm, but you definitely would " +
                                        "not recommend sleeping on the bed.");
                                System.out.println("That is, unless, you want to wake up with any side of the bed " +
                                        "being the wrong side.");
                                System.out.println("");
                                System.out.println("Sleep on the bed?");
                                System.out.println("1. Lets do it!");
                                System.out.println("2. Nah");
                                String input6 = in.next();

                                if (input6.equals("1"))  {
                                    System.out.println("You lied on the over-rated bolder and took a nap.");
                                    System.out.println("...");
                                    System.out.println("Just as you suspected you were extremely stiff when " +
                                            "you woke up.");
                                    System.out.println("So much so that you couldn't move no matter what you did.");
                                    System.out.println("You stared up at the ceiling accepting that this was your life now.");
                                    break;
                                }
                                else if (input6.equals("2")) {
                                    System.out.println("Using your reasoning skills, you determined that sleeping on the " +
                                            "bed would not benefit your health.");
                                    System.out.println("You continued looking around the room.");
                                }

                            } else if (input2.equals("4")) {
                                System.out.println("You go though the dresser and find various clothes.");
                                System.out.println("They are all different colors and sizes.");
                                System.out.println("The fabric feels rough and scratchy.");
                                System.out.println("You wonder how anyone would willingly wear any of these.");
                                System.out.println("You close the dresser and look else where.");

                            } else if (input2.equals("5")) {
                                System.out.println("You tried to open the door.");
                                System.out.println("It is locked.");
                                if (key > 1) {
                                    System.out.println("");
                                    System.out.println("You used the key.");
                                    System.out.println("The door unlocked!");
                                    System.out.println("You walk through the door, escaping the room.");
                                    System.out.println("You breath the free fresh air outside.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Congratulations " + playrName + "! You beat the game!");
                                    System.out.println("Feel free to go back and try out different routes!");
                                    break;

                                }

                            } else {
                                System.out.println("Please choose one of the numbers.");
                            }
                        }

                    } else if (input3.equals("2")) {
                        System.out.println("You tried walking around again, not learning " +
                        "from your previous experience.");
                        System.out.println("You continued to run into objects until you hear a buzzer.");
                        System.out.println("However, by then it is too late.");
                        System.out.println("You have already run into every object in the room at least " +
                        "five times and you can no longer walk.");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Fail");


                    } else if (input3.equals("3")) {
                        System.out.println("Learning from your previous mistakes, you decide to crawl around the room.");
                        System.out.println("Doing this you were able to easily avoid all the objects in your way.");
                        System.out.println("You found a light switch!");
                        System.out.println("It appears that you are in a small room.");
                        System.out.println("It is complete with a small bed, dresser, bookcase, and desk.");

                        //copy paste
                        key = 1;
                        while (running) {
                            System.out.println("");
                            System.out.println("What do you do?");
                            System.out.println("1. Check desk");
                            System.out.println("2. Look at bookcase");
                            System.out.println("3. Sit on bed");
                            System.out.println("4. Go through dresser");
                            System.out.println("5. Open door");

                            String input2 = in.next();
                            if (input2.equals("1")) {
                                System.out.println("You check the desk.");
                                System.out.println("It looks like it's made of a dark wood and is several years old.");
                                System.out.println("Inside the drawers are a bunch of blank pieces of paper.");
                                System.out.println("There is also a pen.");
                                System.out.println("");
                                System.out.println("Write on the paper?");
                                System.out.println("1. Yes!");
                                System.out.println("2. No");
                                String input5 = in.next();

                                if (input5.equals("1")){
                                    System.out.println("What do you write?");
                                    System.out.println(":");
                                    write = scnr.next();
                                    System.out.println("You wrote " + write + " and signed with -" + playrName);
                                    System.out.println("You closed the drawers, but left the note on the table.");
                                }
                                else if (input5.equals("2")){
                                    System.out.println("You put the paper and pen back in their spots.");
                                }

                            } else if (input2.equals("2")) {
                                System.out.println("You looked at the bookcase thoughtfully.");
                                System.out.println("You noticed that one of the books was out of place.");
                                System.out.println("You took it out and flipped through the pages.");
                                System.out.println("A key falls out of the book.");
                                System.out.println("You obtained a key!");
                                key = 2;

                            } else if (input2.equals("3")) {
                                System.out.println("You sit on the small bed.");
                                System.out.println("It is surprisingly hard like a rock.");
                                System.out.println("The blankets feel really soft and warm, but you definitely would " +
                                        "not recommend sleeping on the bed.");
                                System.out.println("That is, unless, you want to wake up with any side of the bed " +
                                        "being the wrong side.");
                                System.out.println("");
                                System.out.println("Sleep on the bed?");
                                System.out.println("1. Lets do it!");
                                System.out.println("2. Nah");
                                String input6 = in.next();

                                if (input6.equals("1"))  {
                                    System.out.println("You lied on the over-rated bolder and took a nap.");
                                    System.out.println("...");
                                    System.out.println("Just as you suspected you were extremely stiff when " +
                                            "you woke up.");
                                    System.out.println("So much so that you couldn't move no matter what you did.");
                                    System.out.println("You stared up at the ceiling accepting that this was your life now.");
                                    break;
                                }
                                else if (input6.equals("2")) {
                                    System.out.println("Using your reasoning skills, you determined that sleeping on the " +
                                            "bed would not benefit your health.");
                                    System.out.println("You continued looking around the room.");
                                }

                            } else if (input2.equals("4")) {
                                System.out.println("You go though the dresser and find various clothes.");
                                System.out.println("They are all different colors and sizes.");
                                System.out.println("The fabric feels rough and scratchy.");
                                System.out.println("You wonder how anyone would willingly wear any of these.");
                                System.out.println("You close the dresser and look else where.");

                            } else if (input2.equals("5")) {
                                System.out.println("You tried to open the door.");
                                System.out.println("It is locked.");
                                if (key > 1) {
                                    System.out.println("");
                                    System.out.println("You used the key.");
                                    System.out.println("The door unlocked!");
                                    System.out.println("You walk through the door, escaping the room.");
                                    System.out.println("You breath the free fresh air outside.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Congratulations " + playrName + "! You beat the game!");
                                    System.out.println("Feel free to go back and try out different routes!");
                                    break;

                                }

                            } else {
                                System.out.println("Please choose one of the numbers.");
                            }
                        }

                    } else {
                        System.out.println("Please choose one of the numbers");
                    }
                }

            } else if (input.equals("2")) {
                System.out.println("You decide to wait in the darkness.");
                System.out.println("After all, who knows what could be out there.");
                System.out.println("You are not about falling and getting hurt.");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("You start to wonder if you should have looked around.");
                System.out.println("Then the room is filled with the sound of a loud buzzer.");

                if (number < 2) {
                    System.out.println("The noise startles you and you fall over, hitting your head.");
                    System.out.println("You start to scramble back up when the lights suddenly " +
                            "turn on.");
                    System.out.println("The lights blind you for a second, which was long enough " +
                            "for you to fall over once again.");
                    System.out.println("");
                    System.out.println("What do you do?");
                    System.out.println("1. Lay on the ground");
                    System.out.println("2. Stand up");

                    String input4 = in.next();

                    if (input4.equals("1")) {
                        System.out.println("You stay on the ground, no longer having the motivation to even.");
                        System.out.println("The world around you feels like it starts to spin.");
                        System.out.println("Suddenly it feels like you can feel the universe.");
                        System.out.println("The way the world is constantly spinning around, while spinning around" +
                                " the solar system, that is a speck in the galaxy, which in it of it's self a speck" +
                                " in the expanding universe...");
                        System.out.println("You fall asleep, dreaming of the stars.");


                    } else if (input4.equals("2")) {
                        System.out.println("You get up and brace yourself on the bed so that you don't fall over again.");
                        System.out.println("You look around the room and find blurry figure one, blurry figure two...");
                        System.out.println("...wait a minute...");
                        System.out.println("You blink and see that it actually a bed, dresser, bookcase, and desk");

                        //copy paste

                        key = 1;
                        while (running) {
                            System.out.println("");
                            System.out.println("What do you do?");
                            System.out.println("1. Check desk");
                            System.out.println("2. Look at bookcase");
                            System.out.println("3. Sit on bed");
                            System.out.println("4. Go through dresser");
                            System.out.println("5. Open door");

                            String input2 = in.next();
                            if (input2.equals("1")) {
                                System.out.println("You check the desk.");
                                System.out.println("It looks like it's made of a dark wood and is several years old.");
                                System.out.println("Inside the drawers are a bunch of blank pieces of paper.");
                                System.out.println("There is also a pen.");
                                System.out.println("");
                                System.out.println("Write on the paper?");
                                System.out.println("1. Yes!");
                                System.out.println("2. No");
                                String input5 = in.next();

                                if (input5.equals("1")){
                                    System.out.println("What do you write?");
                                    System.out.println(":");
                                    write = scnr.next();
                                    System.out.println("You wrote " + write + " and signed with -" + playrName);
                                    System.out.println("You closed the drawers, but left the note on the table.");
                                }
                                else if (input5.equals("2")){
                                    System.out.println("You put the paper and pen back in their spots.");
                                }

                            } else if (input2.equals("2")) {
                                System.out.println("You looked at the bookcase thoughtfully.");
                                System.out.println("You noticed that one of the books was out of place.");
                                System.out.println("You took it out and flipped through the pages.");
                                System.out.println("A key falls out of the book.");
                                System.out.println("You obtained a key!");
                                key = 2;

                            } else if (input2.equals("3")) {
                                System.out.println("You sit on the small bed.");
                                System.out.println("It is surprisingly hard like a rock.");
                                System.out.println("The blankets feel really soft and warm, but you definitely would " +
                                        "not recommend sleeping on the bed.");
                                System.out.println("That is, unless, you want to wake up with any side of the bed " +
                                        "being the wrong side.");
                                System.out.println("");
                                System.out.println("Sleep on the bed?");
                                System.out.println("1. Lets do it!");
                                System.out.println("2. Nah");
                                String input6 = in.next();

                                if (input6.equals("1"))  {
                                    System.out.println("You lied on the over-rated bolder and took a nap.");
                                    System.out.println("...");
                                    System.out.println("Just as you suspected you were extremely stiff when " +
                                            "you woke up.");
                                    System.out.println("So much so that you couldn't move no matter what you did.");
                                    System.out.println("You stared up at the ceiling accepting that this was your life now.");
                                    break;
                                }
                                else if (input6.equals("2")) {
                                    System.out.println("Using your reasoning skills, you determined that sleeping on the " +
                                            "bed would not benefit your health.");
                                    System.out.println("You continued looking around the room.");
                                }

                            } else if (input2.equals("4")) {
                                System.out.println("You go though the dresser and find various clothes.");
                                System.out.println("They are all different colors and sizes.");
                                System.out.println("The fabric feels rough and scratchy.");
                                System.out.println("You wonder how anyone would willingly wear any of these.");
                                System.out.println("You close the dresser and look else where.");

                            } else if (input2.equals("5")) {
                                System.out.println("You tried to open the door.");
                                System.out.println("It is locked.");
                                if (key > 1) {
                                    System.out.println("");
                                    System.out.println("You used the key.");
                                    System.out.println("The door unlocked!");
                                    System.out.println("You walk through the door, escaping the room.");
                                    System.out.println("You breath the free fresh air outside.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Congratulations " + playrName + "! You beat the game!");
                                    System.out.println("Feel free to go back and try out different routes!");
                                    break;

                                }

                            } else {
                                System.out.println("Please choose one of the numbers.");
                            }
                        }
                    }
                } else if (number > 1) {
                    System.out.println("The room is flooded with a bright light.");
                    System.out.println("You are surprised that sitting here actually worked.");
                    System.out.println("Who were you kidding, you're smart.");
                    System.out.println("You knew that exact thing would happen!");
                    System.out.println("Just to prove how smart you were, you stood up, brushed yourself off " +
                            "and made your way over to the door.");
                    System.out.println("A door is exactly what will help you get out of here!");
                    System.out.println("");
                    System.out.println("Open door?");
                    System.out.println("1. Of course!");
                    System.out.println("2. Maybe not...");

                    String input5 = in.next();

                    if (input5.equals("1")) {
                        System.out.println("You try the door knob, but it is locked...");
                        System.out.println("Crushed by your ultimate defeat, you crumple to the floor.");
                        System.out.println("How could this have happened!?");
                        System.out.println("You're unfailing logic somehow failed! ");
                        System.out.println("What an unforeseeable turn of events!");
                        System.out.println("You pound on the door unwilling to admit defeat.");
                        System.out.println("You hit the door for hours out of " +
                        "sheer stubbornness.");
                        System.out.println("...");
                        System.out.println("The lights turn off, once again plunging you into darkness.");
                        System.out.println("You swear you could hear someone sigh in disappointment.");
                        System.out.println("But it could have also been one of the voices now in your head.");


                    } else if (input5.equals("2")) {
                        System.out.println("You back away from the door, thinking that it could be a trap.");
                        System.out.println("It can't possibly be this easy.");
                        System.out.println("You look around the room and find a small bed, dresser, bookcase, and desk.");

                        //copy paste

                        key = 1;
                        while (running) {
                            System.out.println("");
                            System.out.println("What do you do?");
                            System.out.println("1. Check desk");
                            System.out.println("2. Look at bookcase");
                            System.out.println("3. Sit on bed");
                            System.out.println("4. Go through dresser");
                            System.out.println("5. Open door");

                            String input2 = in.next();
                            if (input2.equals("1")) {
                                System.out.println("You check the desk.");
                                System.out.println("It looks like it's made of a dark wood and is several years old.");
                                System.out.println("Inside the drawers are a bunch of blank pieces of paper.");
                                System.out.println("There is also a pen.");
                                System.out.println("");
                                System.out.println("Write on the paper?");
                                System.out.println("1. Yes!");
                                System.out.println("2. No");
                                String input8 = in.next();

                                if (input8.equals("1")){
                                    System.out.println("What do you write?");
                                    System.out.println(":");
                                    write = scnr.next();
                                    System.out.println("You wrote " + write + " and signed with -" + playrName);
                                    System.out.println("You closed the drawers, but left the note on the table.");
                                }
                                else if (input8.equals("2")){
                                    System.out.println("You put the paper and pen back in their spots.");
                                }

                            } else if (input2.equals("2")) {
                                System.out.println("You looked at the bookcase thoughtfully.");
                                System.out.println("You noticed that one of the books was out of place.");
                                System.out.println("You took it out and flipped through the pages.");
                                System.out.println("A key falls out of the book.");
                                System.out.println("You obtained a key!");
                                key = 2;

                            } else if (input2.equals("3")) {
                                System.out.println("You sit on the small bed.");
                                System.out.println("It is surprisingly hard like a rock.");
                                System.out.println("The blankets feel really soft and warm, but you definitely would " +
                                        "not recommend sleeping on the bed.");
                                System.out.println("That is, unless, you want to wake up with any side of the bed " +
                                        "being the wrong side.");
                                System.out.println("");
                                System.out.println("Sleep on the bed?");
                                System.out.println("1. Lets do it!");
                                System.out.println("2. Nah");
                                String input6 = in.next();

                                if (input6.equals("1"))  {
                                    System.out.println("You lied on the over-rated bolder and took a nap.");
                                    System.out.println("...");
                                    System.out.println("Just as you suspected you were extremely stiff when " +
                                            "you woke up.");
                                    System.out.println("So much so that you couldn't move no matter what you did.");
                                    System.out.println("You stared up at the ceiling accepting that this was your life now.");
                                    break;
                                }
                                else if (input6.equals("2")) {
                                    System.out.println("Using your reasoning skills, you determined that sleeping on the " +
                                            "bed would not benefit your health.");
                                    System.out.println("You continued looking around the room.");
                                }

                            } else if (input2.equals("4")) {
                                System.out.println("You go though the dresser and find various clothes.");
                                System.out.println("They are all different colors and sizes.");
                                System.out.println("The fabric feels rough and scratchy.");
                                System.out.println("You wonder how anyone would willingly wear any of these.");
                                System.out.println("You close the dresser and look else where.");

                            } else if (input2.equals("5")) {
                                System.out.println("You tried to open the door.");
                                System.out.println("It is locked.");
                                if (key > 1) {
                                    System.out.println("");
                                    System.out.println("You used the key.");
                                    System.out.println("The door unlocked!");
                                    System.out.println("You walk through the door, escaping the room.");
                                    System.out.println("You breath the free fresh air outside.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Congratulations " + playrName + "! You beat the game!");
                                    System.out.println("Feel free to go back and try out different routes!");
                                    break;

                                }

                            } else {
                                System.out.println("Please choose one of the numbers.");
                            }
                        }


                    }

                }

            }

    }
}
