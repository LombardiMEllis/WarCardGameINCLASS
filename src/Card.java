
public class Card {
	//ATTRIBUTES
	//encapsulation (making them private) protects them
	private char rank;
	private char suit;
	
	
	//METHODS
	//default constructor
	public Card() {
		//ideally randomized
		setRank('z');
		setSuit('z');
	}
	
	//overloaded constructor that sets values
	public Card(char r, char s) {
		setRank(r);
		setSuit(s);
	}
	
	//setters
	public void setRank(char r){
		//check if correct
		if(r == 'A' || r == '2' || r == '3' || r == '4' 
				|| r == '5' || r == '6' || r == '7' || r == '8'
				|| r == '9' || r == 'T' || r == 'J' || r == 'Q' || r == 'K') {
			rank = r;
		} else {
			rank = 'z';
		}
	}
	
	public void setSuit(char s) {
		if (s =='H' || s == 'D' || s == 'S' || s == 'C') {
			suit = s;
		} else {
			suit = 'z';
		}
	}
	
	//getters
	public char getSuit() {
		return suit;
	}
	
	public char getRank() {
		return rank;
	}
	
	//toString
	public String toString() {
		return "Suit: " + getSuit()
		+ " Rank: " + getRank();
	}

}
