package casino;

/**
 * A stack of more than one deck used in a casino game
 *
 */
public class DeckStack {

	private Deck[] decks;
	private int curDeck = 0;
	
	public DeckStack(int numDecks) {
		decks = new Deck[numDecks];
		for(int i=0; i<decks.length; i++) decks[i] = new Deck();
	}
	
	public Card dealTopCard() {
		if(decks[curDeck].cardsLeft() > 0) return decks[curDeck].dealTopCard();
		
		curDeck++;
		if(curDeck == decks.length) restoreDecks();
		
		return decks[curDeck].dealTopCard();
	}
	
	protected void restoreDecks() {
		for(Deck d : decks) d.restockDeck();
		curDeck = 0;
	}
	
	public int cardsLeft() {
		int c = 0;
		for(Deck d : decks) c += d.cardsLeft();
		return c;
	}
	
	
}
