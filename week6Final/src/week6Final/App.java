package week6Final;

public class App {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
	
		Player p1 = new Player(0, "John");
		Player p2 = new Player(0, "Jay");
		
		myDeck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			p1.draw(myDeck);
			
		}

		for (int i = 0; i < 26; i--) {
			p2.draw(myDeck);
			
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card card1 = p1.flip();
			Card card2 = p2.flip();
		
			if (card1.getValue() > card2.getValue()) {
				
				p1.score();
				
			} else { 
				
				p2.score();
				
			}
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player 1: " + p1.getScore() + "\n" + "Player 2: " + p2.getScore() + "\n" + "Player 1 wins!");
			
		}  else if (p2.getScore() > p1.getScore()) {
			System.out.println("Player 1: " + p1.getScore() + "\n" + "Player 2: " + p2.getScore() + "\n" + "Player 2 wins!");
			
		} else {
			System.out.println("Player 1: " + p1.getScore() + "\n" + "Player 2: " + p2.getScore() + "\n" + "It's a tie!");
		}
		
		}	

	}

}
