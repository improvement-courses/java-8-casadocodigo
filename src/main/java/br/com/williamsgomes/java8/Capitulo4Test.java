package br.com.williamsgomes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo4Test {
	
	public static void main(String[] args) {
		
		Usuario paulo = new Usuario("Paulo Silveira", 150);
		Usuario rodrigo = new Usuario("Rodrigo Turini", 120);
		Usuario guilherme = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(paulo, rodrigo, guilherme);
		
		Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de mostrar os nomes!");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		
		List<Usuario> users = new ArrayList<Usuario>();
		
		users.addAll(usuarios);
		
		users.removeIf(u -> u.getPontos() > 160);
		
		System.out.println();
		users.forEach(System.out::println);
		
	}

}
