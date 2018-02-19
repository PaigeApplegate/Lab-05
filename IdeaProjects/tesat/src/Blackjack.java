public class Blackjack { public static void main(String[]args){
    P1Random rng = new P1Random();
    int card, valueCard;
    card = rng.nextInt(11) + 16;
    valueCard = rng.nextInt(13)+1;
    System.out.println(card + " " + valueCard);
    card = rng.nextInt(11) + 16;
    valueCard = rng.nextInt(13)+1;
    System.out.println(card + " " + valueCard);
    card = rng.nextInt(11) + 16;
    valueCard = rng.nextInt(13)+1;
    System.out.println(card + " " + valueCard);
    card = rng.nextInt(11) + 16;
    valueCard = rng.nextInt(13)+1;
    System.out.println(card + " " + valueCard);
    card = rng.nextInt(11) + 16;
    valueCard = rng.nextInt(13)+1;
    System.out.println(card + " " + valueCard);
}
}
