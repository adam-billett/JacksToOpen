public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Initial deck: ");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("\nShuffled deck: ");
        System.out.println(deck);

        System.out.println("\nDealing 5 cards: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.dealCard());
        }

        System.out.println("\nRemaining cards in the deck");
        System.out.println(deck.getRemainingCards());
    }
}