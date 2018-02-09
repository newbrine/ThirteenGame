package GameRulesAndCards;

import Users.Player;

public class Game {
	Player user = new Player();
	Player cpu1 = new Player();
	Player cpu2 = new Player();
	Player cpu3 = new Player();
	DeckOfCards deck = new DeckOfCards();

	public Game() {
		deck.shuffleDeck();
		dealCards(user, 1);
		dealCards(cpu1, 2);
		dealCards(cpu2, 3);
		dealCards(cpu3, 4);
		beginRound();
	}
	
	public Hand dealCards(Player player, int positionInDealilngOrder) {
		return null;
	}
	
	public void beginRound() {
		
	}
}
