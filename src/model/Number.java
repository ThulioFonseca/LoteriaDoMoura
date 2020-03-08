package model;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number {

	private List<Integer> fullCard = new ArrayList<>(
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));

	public List<Integer> getNewRange(List<Integer> toRemove) { // Método que exclui uma lista de numeros do cartão "cheio" e retorna um novo cartão cheio, sem os numeros que foram excluidos;

		fullCard.removeAll(toRemove);

		return fullCard;

	}

	public List<Integer> getBet(List<Integer> removed) { //Metodo que retorna uma lista de inteiros que é uma combinação de 15 numeros, 

		List<Integer> bet = new ArrayList<>();

		List<Integer> newRangeCard = getNewRange(removed);

		Collections.shuffle(newRangeCard);

		for (int i = 0; i < 15; i++) {

			bet.add(newRangeCard.get(i));

		}

		bet.sort(null);

		return bet;
	}

}
