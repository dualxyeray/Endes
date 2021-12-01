package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//Esta es una cadena de caracteres en la cual hemos introducido los datos de la baraja de póquer//
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		ArrayList<Card> deck = new ArrayList<Card>();
//Este bucle te da un palo como corazón o espadas//
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
//Este bucle lo que te muestra todas las combinaciones de todos los palos y  te baraja las 51 cartas//
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
//Este for lo que te da las 5 primeras cartas que hemos barajado antes//
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
