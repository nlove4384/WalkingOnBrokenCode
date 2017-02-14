
/**
 * A standard playing card.
 */
public class Card {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank == 1 && that.rank != 1){
        	return 1;
        }
        if (this.rank !=1 && that.rank ==1){
        	return -1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Gets the card's rank.
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Gets the card's suit.
     */
    public int getSuit() {
        return this.suit;
    }

    /**
     * Returns the card's index in a sorted deck of 52 cards.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
    public static Card[] makeDeck(){
    	Card[] deck = new Card [52];
    	for (int i=1; i<=3; i++){
    		for( int p = 1; p <=13; p ++){
    			deck[((i*13)+p)-1] = new Card (i,p);
    		}
    			    	
    	}
    	return deck;
    }
    public static int[] suitHist(Card[] card){
    	int clubs=0;
    	int diamonds=0;
    	int hearts=0;
    	int spades=0;
    for (int i = 0; i < card.length; i++ ){
    		if(card[i].getSuit()==0){
    			clubs ++;
    		}
    		if (card[i].getSuit()==1){
    			diamonds++;
    		}
    		if(card[i].getSuit()==2){
    			hearts++;
    		}
    		if(card[i].getSuit()==3){
    			spades++;
    		}
     	
    	
    	}
    int[] hist = new int[4];
    hist[0] = clubs;
    hist[1] = diamonds;
    hist[2] = hearts;
    hist[3] = spades;
    return hist;
    }

}