package war;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                p1.draw(deck);
            } else {
                p2.draw(deck);
            }
        }
        for (int i = 0; i < 26; i++) {
            card card1 = p1.next();
            card card2 = p2.next();

            System.out.print("round " + (i + 1) + ": ");
            card1.describe();
            System.out.print(" vs ");
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                p1.incrementScore();
                System.out.println(p1.getName() + " wins round");
            } else if (card1.getValue() < card2.getValue()) {
                p2.incrementScore();
                System.out.println(p2.getName() + " wins roud");
            } else {
                System.out.println("tied");
            }

            // Print updated scores
            System.out.println("score is: " + p1.getName() + ": " + p1.getScore() + ", " + p2.getName() + ": " + p2.getScore());
            System.out.println();
        }

        // Step 4: Determine and print the winner
        System.out.println("end score " + p1.getName() + ": " + p1.getScore() + ", " + p2.getName() + ": " + p2.getScore());

        if (p1.getScore() > p2.getScore()) {
            System.out.println(p1.getName() + " wins");
        } else if (p1.getScore() < p2.getScore()) {
            System.out.println(p2.getName() + " wins");
        } else {
            System.out.println("draw");
        }
    }
}
