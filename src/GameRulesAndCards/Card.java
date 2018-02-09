package GameRulesAndCards;

public class Card {
	//The card class this is based on can be found at the following website.
	//http://math.hws.edu/eck/cs124/javanotes4/source/Card.java
	
	public final static int CLUBS = 1, SPADES = 2, DIAMONDS = 3, HEARTS = 4;
	public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
	private final int suit;
	private final int value;
	
	public Card(int givenValue, int givenSuit) {
		value = givenValue;
		suit = givenSuit;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSuitAsString() {
		switch( suit ) {
		case SPADES:	return "Spades";
		case CLUBS:		return "Clubs";
		case HEARTS:	return "Hearts";
		case DIAMONDS:	return "Diamonds";
		default:		return "Not Valid Suit";
		}
	}
	
	public String getValueAsString() {
		switch( value ) {
		case 1:		return "Ace";
		case 2:		return "Two";
		case 3:		return "Three";
		case 4:		return "Four";
		case 5:		return "Five";
		case 6:		return "Six";
		case 7:		return "Seven";
		case 8:		return "Eight";
		case 9:		return "Nine";
		case 10:	return "Ten";
		case 11:	return "Jack";
		case 12:	return "Queen";
		case 13:	return "King";
		default:	return "Not Valid Value";
		}
	}
	
	public String toString() {
		return getValueAsString() + " of " + getSuitAsString();
	}

	public Card compareTwoCards(Card cardOne, Card cardTwo) {
		int cardOneValue = cardOne.getValue();
		int cardOneSuit = cardOne.getSuit();
		int cardTwoValue = cardTwo.getValue();
		int cardTwoSuit = cardTwo.getSuit();
		
		if (cardOneValue > cardTwoValue) {
			return cardOne;
		} else if (cardOneValue == cardTwoValue) {
			if (cardOneSuit > cardTwoSuit) {
				return cardOne;
			} else {
				return cardTwo;
			}
		} else {
			return cardTwo;
		}
	}
}
