package war;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<card> hand;
    private int score;
    private String name;
    
    public Player(String name) {
    	this.name = name;
    	this.hand = new ArrayList<>();
    	this.score = 0;
    }
    
    public void describe() {
    	System.out.println(name + " has score: " + score);
    	for (card card : hand) {
    		card.describe();
    	}
    }
    
    public card next() {
    	return hand.remove(0);
    }
    
    public void draw(Deck deck) {
    	hand.add(deck.draw());
    }
    
    public void incrementScore() {
        score++;
    }

    // Getters for name and score
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    
    
    
}
