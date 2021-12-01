package ejercicio2;

public class Card {
//Esto es una cadena de caratres que te imprime los palos y el valor de las cartas//
	public String suit;
	public String value;
	//Es un metodo que te piede el valor y el palo de la carta.//
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
//Este metodo hace que me muestre las 5 primeras cartas del array del ejercicio anterior.//
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
