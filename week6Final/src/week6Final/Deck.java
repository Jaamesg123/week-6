package week6Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

	Random rand = new Random();
	
		private List<Card> card;
		public final int[] values = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		public final String[] suits = new String[] {"Spades", "Clubs", "Diamonds", "Hearts"};
		
		
		
		public Deck() {
			setCard(new ArrayList<Card>());
			
			for (int value : values) {
				for (String suit : suits) {
					card.add(new Card (value,suit));
				}
			}
		}
		
		public void displayData() {
			
			for (Card c : card) {
				if (c.getValue() == 14) {
					System.out.println("Ace of " + c.getSuit());
			}	else if (c.getValue() == 13) {
					System.out.println("King of " + c.getSuit());
			}	else if (c.getValue() == 12) {
					System.out.println("Queen of " + c.getSuit());
			}	else if (c.getValue() == 11) {
					System.out.println("Jack of " + c.getSuit());
			} else { 
					System.out.println(c.getValue() + " of " + c.getSuit());
				
				}
			}
		}
		
		public void shuffle() {
			Collections.shuffle(card);
		}
		
		public Card draw() {
			return getCard().remove(0);
			
		}


		public List<Card> getCard() {
			return card;
		}



		public void setCard(List<Card> card) {
			this.card = card;
		}
		
		
	

}
	



