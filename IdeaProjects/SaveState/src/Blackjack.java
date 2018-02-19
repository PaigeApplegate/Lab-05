import java.util.Random;
import java.util.Scanner;
public class Blackjack {
        public static void main(String[] args) {

            //variables
            int card, valueCard, dCard, totalCards, futureCard, futureCardD, game, playerWin, DealerWin, ties, plays;
            int percent,user;
            //Random Generator
            Random randGen = new Random();
            Scanner in = new Scanner(System.in);

            //Game variables
            game = 0;
            playerWin = 0;
            DealerWin = 0;
            ties = 0;
            plays = 1;
            user = 0;

            //First loop. Keeps count of # of games
            while(user!=4){
                game = game + 1;

                System.out.println("");
                System.out.println("START GAME #" + game);
                System.out.println("");

                //Set cards to 0 after every game.
                card = 0;
                dCard = 0;
                valueCard = 0;

                futureCard = card;

                card = randGen.nextInt(10) + 1;
                valueCard = randGen.nextInt(13)+1;

                //Face cards
                if ((card<10) || (valueCard <10)){
                    card = valueCard;
                }
                if (card>10){
                    card = 10;
                }
                if (valueCard == 1)
                    System.out.println("Your card is a Ace!");

                else if ((valueCard>card) && (card==10)) {

                    if(valueCard == 11)
                        System.out.println("Your card is a Jack!");
                    if (valueCard == 12)
                        System.out.println("Your card is a Queen!");
                    if (valueCard == 13)
                        System.out.println("Your card is a King!");}

                if ((valueCard <= 10) && (card != 1))
                    System.out.println("Your card is a " + card + "!");
                totalCards = card + futureCard;
                System.out.println("Your hand is: " + totalCards);
                System.out.println("");

                //Second loop. Let menu screen pop up after every action.
                while (card < 21 && dCard < 21) {
                    System.out.println("1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print game statistics");
                    System.out.println("4. Exit");

                    //Keep track of previous cards for every loop.
                    futureCard = card;

                    String input = in.nextLine();

                    if (input.equals("1")) {
                        card = randGen.nextInt(10) + 1;
                        valueCard = randGen.nextInt(13)+1;

                        //Face cards
                        if ((card<10) || (valueCard <10)){
                            card = valueCard;
                        }
                        if (card>10){
                            card = 10;
                        }
                        if (valueCard == 1)
                            System.out.println("Your card is a Ace!");

                        else if ((valueCard>card) && (card==10)) {

                            if(valueCard == 11)
                                System.out.println("Your card is a Jack!");
                            if (valueCard == 12)
                                System.out.println("Your card is a Queen!");
                            if (valueCard == 13)
                                System.out.println("Your card is a King!");}

                        if ((valueCard <= 10) && (card != 1))
                            System.out.println("Your card is a " + card + "!");

                        //Total card calculation
                        totalCards = card + futureCard;
                        card = totalCards;
                        System.out.println("Your hand is: " + totalCards);
                        System.out.println("");
                        //Dealers card
                        futureCardD = dCard;
                        dCard = randGen.nextInt(10) + 1;
                        dCard = dCard + futureCardD;

                    } else if (input.equals("2")) {
                        futureCardD = dCard;
                        dCard = randGen.nextInt(10) + 1;
                        dCard = dCard + futureCardD;

                    } else if (input.equals("3")) {
                        System.out.println("Number of Player wins: " + playerWin);
                        System.out.println("Number of Dealer wins: " + DealerWin);
                        System.out.println("Number of tie games: " + ties);
                        System.out.println("Total # of games played is: " + plays);
                        percent = (playerWin * 100) / plays;
                        System.out.println("Percentage of Player wins: " + percent + "%");
                        System.out.println("");

                    } else if (input.equals("4")) {
                        user = 4;
                        break;

                    } else {
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer value between 1 and 4.");
                        System.out.println("");
                    }
                }
                if (card == 21 && dCard == 21) {
                    System.out.println("Dealer's hand: " + dCard);
                    System.out.println("Your hand: " + card);
                    System.out.println("");
                    System.out.println("It's a tie! No one wins!");
                    ties = ties + 1;
                    plays = plays + 1;

                } else if (card == 21) {
                    System.out.println("BLACKJACK! You win!");
                    playerWin = playerWin + 1;
                    plays = plays + 1;

                } else if (card > 21) {
                    System.out.println("You exceeded 21! You lose.");
                    DealerWin = DealerWin + 1;
                    plays = plays + 1;

                } else if (dCard == 21) {
                    System.out.println("Dealer's hand: " + dCard);
                    System.out.println("Your hand: " + card);
                    System.out.println("");
                    System.out.println("Dealer wins!");
                    DealerWin = DealerWin + 1;
                    plays = plays + 1;

                } else if (dCard > 21) {
                    System.out.println("Dealer's hand: " + dCard);
                    System.out.println("Your hand: " + card);
                    System.out.println("");
                    System.out.println("You win!");
                    playerWin = playerWin + 1;
                    plays = plays + 1;
                }
            }
        }

    }
