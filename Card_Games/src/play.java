import java.util.Arrays;

public class play extends Player {
	public play(String temp){
		super(temp);
	}
	 public Card play(Eights eights, Card prev) {
	        Card card = searchForBestMatch(prev);
	        if (card == null) {
	            card = drawForMatch(eights, prev);
	        }
	        return card;
	    }



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

