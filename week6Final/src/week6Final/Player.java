package week6Final;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	
	public Player(int score, String name) {
		hand = new ArrayList<Card>();
		this.score = 0;
		this.name = name;
		
	}
	
	public void describe() {
		
		System.out.println(" Player : " + this.name + "    " + "Score : " + this.score + "\n --------" + "Cards : ");
		
		for (Card c : hand) {
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
	
	public void score() {
		this.score += 1;
		
	}
	
	public Card flip() {
		return getHand().remove(0);
	}
	
	public void draw(Deck deck) {
		Card playCard = deck.draw();
		getHand().add(playCard);
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	}

	
	

	
	
	

	
	
	
	
	
	
	

	
	

	
	
	
	
	
	






