package GameRulesAndCards;

public class DeckOfCards {
	//Class based off of the DeckOfCards class found at:
	//http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/10/deck-of-cards.html

	private Card[] deckOfCards;
	private int topCardOfDeck;
	
	public DeckOfCards(){
		deckOfCards = new Card[52];
		int positionInDeck = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++) {
				deckOfCards[positionInDeck++] = new Card(i, j);
			}
		}
		topCardOfDeck = 0;
	}
	
	public int deckSize() {
		return deckOfCards.length;
	}
	
	public Card getCard(int i) {
		return deckOfCards[i];
	}
	
	public void shuffleDeck() {
		int i, j, k;
		Card help;
		for(i = 0; i < 52; i++) {
			j = (int) ((int)52*Math.random());
			k = (int) ((int)52*Math.random());
			help = deckOfCards[j];
			deckOfCards[j] = deckOfCards[k];
			deckOfCards[k] = help;
		}
		topCardOfDeck = 0;
	}
	
	public Card dealCard() {
		if (topCardOfDeck < 52) {
			return deckOfCards[topCardOfDeck++];
		} else {
			System.out.println("There are no cards left in the deck.");
			return null;
		}
	}
	
}

































