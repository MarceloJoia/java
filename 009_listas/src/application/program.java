package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class program {

	public static void main(String[] args) {
		/*
		List lista = new LinkedList<E>();
		List lista1 = new ArrayList<E>();
		
		• Lista é uma estrutura de dados:
			• Homogênea (dados do mesmo tipo)
			• Ordenada (elementos acessados por meio de posições)
			• Inicia vazia, e seus elementos são alocados sob demanda
			• Cada elemento ocupa um "nó" (ou nodo) da lista
			
		• Tipo (interface): List
			• Classes que implementam: ArrayList, LinkedList, etc.
			
		• Vantagens:
			• Tamanho variável
			• Facilidade para se realizar inserções e deleções
			
		• Desvantagens:
			• Acesso sequencial aos elementos 
		*/
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//Inclui elemento em uma determinada posição.
		list.add(2, "Marco");
		
		
		//Mostrar o tamanho da lista
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("---- [ list.remove(\"Anna\") ] ----");
		/*
		list.remove("Anna");//Remover elemento da lista por [Nome]
		
		list.remove(1);//Remover elemento da lista por [ID]
		*/
		//Remover elemento [que atenda a um predicado]
		list.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String x) {
				return x.charAt(0) == 'M';
			}
		});
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		
		System.out.println();
		System.out.println("---- [ Index of ] ----");
		//Encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Existe na lista
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		
		
		System.out.println();
		System.out.println("---- [ Filtra por 'A' ] ----");
		//Encontrar elemento com a letra [A].
		List<Object> result = list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String x) {
				return x.charAt(0) == 'A';
			}
		}).collect(Collectors.toList());
		
		for(Object x : result) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println("---- [ Filtra o primeiro elemento com aletra 'A' ] ----");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
	}

}
