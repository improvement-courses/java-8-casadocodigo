package br.com.williamsgomes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo6Test {

	public static void main(String[] args) {
		
		Usuario paulo = new Usuario("Paulo Silveira", 150);
		Usuario rodrigo = new Usuario("Rodrigo Turini", 120);
		Usuario guilherme = new Usuario("Guilherme Silveira", 190);
		Usuario williams = new Usuario("Williams Gomes", 120);
//		Usuario nuull = null;

		List<Usuario> usuarios = Arrays.asList(paulo, rodrigo, guilherme, williams);
		
		List<Usuario> users = new ArrayList<Usuario>();
		users.addAll(usuarios);
		
		users.stream()
			.peek(Usuario::tornarModerador)
			.forEach(u -> System.out.println(u.isModerador()));

		users.sort(Comparator
				.comparingInt(Usuario::getPontos)
				.thenComparing(Usuario::getNome));
		
		System.out.println();
		users.forEach(System.out::println);
		
		users.sort(Comparator.nullsLast(Comparator
				.comparingInt(Usuario::getPontos)
				.thenComparing(Usuario::getNome)).reversed());
		
		System.out.println();
		users.forEach(System.out::println);
		
		Usuario vivi = new Usuario("Viviane Maria", 50);
		System.out.println();
		System.out.println("Antes");
		System.out.println(vivi.isModerador());
		Runnable bloco = vivi::tornarModerador;
		bloco.run();
		System.out.println("Depois");
		System.out.println(vivi.isModerador());
		
		System.out.println();
		
		System.out.println("Antes");
		System.out.println(vivi.isModerador());
		Consumer<Usuario> consumer = Usuario::tornarModerador;
		consumer.accept(vivi);
		System.out.println("Depois");
		System.out.println(vivi.isModerador());
	}

}
