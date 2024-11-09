package war;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"H", "D", "C", "S"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for(String suit : suits) {
        	for(int i = 0; i < ranks.length; i++) {
        		cards.add(new card(i + 2, ranks[i] + " of " + suit));
        	}
        }
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public card draw() {
		return cards.remove(0); //top card
	}
}
