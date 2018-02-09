package GameRulesAndCards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTests {

	@Test
	void testCardValues() {
		Card c = new Card(5,3);
		assertEquals(c.toString(), "Five of Diamonds");
	}
	
	@Test
	void testDeckCreation() {
		DeckOfCards d = new DeckOfCards();
		assertEquals(d.deckSize(), 52);
	}
	
	@Test
	void testShuffle() {
		DeckOfCards d = new DeckOfCards();
		DeckOfCards t = new DeckOfCards();
		d.shuffleDeck();
		assertFalse(d == t);
	}
	
	@Test
	void testCompareCards() {
		Card one = new Card(4, 2);
		Card two = new Card(11, 1);
		Card three = new Card(4, 4);
		
		assertEquals(one.compareTwoCards(one, two), two);
		assertEquals(one.compareTwoCards(one, three), three);
		assertEquals(two.compareTwoCards(two, three), two);
	}
	
	@Test
	void testDealCard() {
		DeckOfCards d = new DeckOfCards();
		assertEquals(d.dealCard(), d.getCard(0));
	}
}
