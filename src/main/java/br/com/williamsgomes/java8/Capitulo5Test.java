package br.com.williamsgomes.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capitulo5Test {
	
	public static void main(String[] args) {
		
		Usuario paulo = new Usuario("Paulo Silveira", 150);
		Usuario rodrigo = new Usuario("Rodrigo Turini", 120);
		Usuario guilherme = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(paulo, rodrigo, guilherme);
		
		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		usuarios.forEach(System.out::println);
		
		usuarios.sort((u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getNome(), u2.getNome()));
		System.out.println();
		usuarios.forEach(System.out::println);
		
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		System.out.println();
		usuarios.forEach(System.out::println);
		
		List<String> palavras = Arrays.asList("Caelum", "Alura", "Casa do Código");
		
		Collections.sort(palavras);
		System.out.println();
		System.out.println(palavras);
		
		palavras.sort(Comparator.naturalOrder());
		System.out.println();
		System.out.println(palavras);
		
		palavras.sort(Comparator.reverseOrder());
		System.out.println();
		System.out.println(palavras);
		
		usuarios.sort(Comparator.comparingInt(Usuario::getPontos));
		System.out.println();
		usuarios.forEach(System.out::println);
		
	}

}
