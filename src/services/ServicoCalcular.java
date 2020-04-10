package services;

import java.util.List;

public class ServicoCalcular {
	
		public static <Tipo extends Comparable<? super Tipo>>Tipo maximo(List<Tipo> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista não pode estar vazia");
		}
		Tipo maximo = list.get(0);
		for (Tipo item: list) {
			if (item.compareTo(maximo) > 0) {
				maximo = item;
			}
		}
		return maximo;
		
	}

}
