
import java.util.Scanner;
public class Blackjack {
    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);

        //variables
        int playerCard, dealerCard, totalCards, futureCard, game, playerWin, DealerWin, ties, plays;
        int user, choice;
        double percent;

        //Random Generator
        P1Random rng = new P1Random();

        //Game variables
        game = 0;
        playerWin = 0;
        DealerWin = 0;
        ties = 0;
        plays = 0;
        user = 0;

        //First loop. Keeps count of # of games
        while(user!=4){
            game = game + 1;

            System.out.println("START GAME #" + game);
            System.out.println("");

            //Set cards to 0 after every game.
            dealerCard = 0;
            playerCard = 0;

            futureCard = playerCard;

            playerCard = rng.nextInt(13)+1;

            //Face cards
            if (playerCard <= 10 && playerCard !=1)
                System.out.println("Your card is a " + playerCard + "!");
            switch (playerCard){
                case 1:
                    System.out.println("Your card is a ACE!");
                    break;
                case 11:
                    System.out.println("Your card is a JACK!");
                    playerCard = 10;
                    break;
                case 12:
                    System.out.println("Your card is a QUEEN!");
                    playerCard = 10;
                    break;
                case 13:
                    System.out.println("Your card is a KING!");
                    playerCard = 10;
                    break;
            }
            totalCards = playerCard + futureCard;
            System.out.println("Your hand is: " + totalCards);
            System.out.println("");

            //Second loop. Let menu screen pop up after every action.
            while ((playerCard < 21) && (playerCard != dealerCard)) {
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("");
                System.out.println("Choose an option: ");
                //Keep track of previous cards for every loop.
                futureCard = playerCard;

                choice = scnr.nextInt();

                if (choice == 1) {
                    playerCard = rng.nextInt(13)+1;

                    //Face cards
                    if (playerCard <= 10 && playerCard != 1)
                        System.out.println("Your card is a " + playerCard + "!");
                    switch (playerCard){
                        case 1:
                            System.out.println("Your card is a ACE!");
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerCard = 10;
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerCard = 10;
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            playerCard = 10;
                            break;
                    }
                    //Total card calculation
                    totalCards = playerCard + futureCard;
                    playerCard = totalCards;
                    System.out.println("Your hand is: " + totalCards);
                    System.out.println("");
                }
                else if (choice == 2) {
                    System.out.println("");
                    dealerCard = rng.nextInt(11) + 16;

                    if ((dealerCard > playerCard) && (dealerCard < 21) || (dealerCard == 21)){
                        System.out.println("Dealer's hand: " + dealerCard);
                        System.out.println("Your hand is: " + playerCard);
                        System.out.println("");
                        System.out.println("Dealer wins!");
                        DealerWin = DealerWin + 1;
                        plays = plays + 1;
                        break;
                    }
                    else if (dealerCard < playerCard || dealerCard > 21){
                        System.out.println("Dealer's hand: " + dealerCard);
                        System.out.println("Your hand is: " + playerCard);
                        System.out.println("");
                        System.out.println("You win!");
                        playerWin = playerWin + 1;
                        plays = plays + 1;
                        break;
                    }

                } else if (choice == 3) {
                    System.out.println("Number of Player wins: " + playerWin);
                    System.out.println("Number of Dealer wins: " + DealerWin);
                    System.out.println("Number of tie games: " + ties);
                    System.out.println("Total # of games played is: " + plays);
                    if (plays == 0){
                        System.out.println("Percentage of Player wins: 0.0%");
                        System.out.println("");
                    }
                    else {percent = (playerWin * 100) / plays;

                    System.out.println("Percentage of Player wins: " + percent + "%");
                    System.out.println("");}

                } else if (choice == 4) {
                    user = 4;
                    break;

                } else {
                    System.out.println("");
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    System.out.println("");
                }
            }
            if (playerCard == dealerCard) {
                System.out.println("");
                System.out.println("Dealer's hand: " + dealerCard);
                System.out.println("Your hand is: " + playerCard);
                System.out.println("");
                System.out.println("It's a tie! No one wins!");
                ties = ties + 1;
                plays = plays + 1;

            } else if (playerCard == 21) {
                System.out.println("");
                System.out.println("BLACKJACK! You win!");
                playerWin = playerWin + 1;
                plays = plays + 1;

            } else if (playerCard > 21) {
                System.out.println("");
                System.out.println("You exceeded 21! You lose.");
                DealerWin = DealerWin + 1;
                plays = plays + 1;
            }
        }
    }
}