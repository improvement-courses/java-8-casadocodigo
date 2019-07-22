package br.com.williamsgomes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capitulo7Test {

	public static void main(String[] args) {

		Usuario paulo = new Usuario("Paulo Silveira", 150);
		Usuario rodrigo = new Usuario("Rodrigo Turini", 120);
		Usuario guilherme = new Usuario("Guilherme Silveira", 190);
		Usuario williams = new Usuario("Williams Gomes", 122);
		Usuario jose = new Usuario("José Manoel", 154);
		Usuario tome = new Usuario("Tome Turini", 198);
		Usuario adao = new Usuario("Adao Silveira", 154);
		Usuario joao = new Usuario("João Gomes", 450);
		Usuario felix = new Usuario("Félix Silveira", 90);
		Usuario maria = new Usuario("Maria Turini", 112);
		Usuario viviane = new Usuario("Viviane Silveira", 170);
		Usuario suzy = new Usuario("Suzy Gomes", 95);

		List<Usuario> usuarios = Arrays.asList(paulo, rodrigo, guilherme, williams, jose, tome, adao, joao, felix,
				maria, viviane, suzy);

		List<Usuario> users = new ArrayList<Usuario>();
		users.addAll(usuarios);
		
		// Depois do Java 8
//		users.sort(Comparator.comparing(Usuario::getPontos).reversed());
//		users.stream().peek(System.out::println).peek(u -> System.out.println(u.isModerador())).collect(Collectors.toList()).subList(0, 10).forEach(Usuario::tornarModerador);
//
//		System.out.println();
//		users.stream().peek(u -> System.out.println(u.isModerador())).forEach(System.out::println);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		List<Usuario> usuarios1 = Arrays.asList(paulo, rodrigo, guilherme, williams, jose, tome, adao, joao, felix,
				maria, viviane, suzy);

		List<Usuario> users1 = new ArrayList<Usuario>();
		users1.addAll(usuarios1);
		
		System.out.println();
		
		// Antes do Java 8
		Collections.sort(users1, new Comparator<Usuario>() {

			@Override
			public int compare(Usuario u1, Usuario u2) {
				return u1.getPontos() - u2.getPontos();
			}
		});
		
		Collections.reverse(users1);
		
		for (Usuario usuario : users) {
			System.out.println(usuario);
			System.out.println(usuario.isModerador());
		}
		
		System.out.println();
		
		List<Usuario> top10 = users1.subList(0, 10);
		for (Usuario usuario : top10) {
			usuario.tornarModerador();
			System.out.println(usuario);
			System.out.println(usuario.isModerador());
		}
	}

}
