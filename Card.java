package ejercicio2;

public class Card {

	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
//Este metodo hace que me muestre las 5 primeras cartas del array del ejercicio anterior.//
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
