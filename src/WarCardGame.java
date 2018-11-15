
public class WarCardGame {

	public static void main(String[] args) {
		//create an instance of the Card class
		Card card1 = new Card();
		//set separately bc nothing set in constructor
		card1.setRank('2'); 
		System.out.println("Card1: " + card1);
		
		//create w/ set values
		Card card2 = new Card('4', 'H');
		System.out.println("Card 2: " + card2);

	}

}
