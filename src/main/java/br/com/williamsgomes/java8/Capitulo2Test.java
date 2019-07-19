package br.com.williamsgomes.java8;

import java.util.Arrays;
import java.util.List;

public class Capitulo2Test {
	
	public static void main(String[] args) {
		
		Usuario paulo = new Usuario("Paulo Silveira", 150);
		Usuario rodrigo = new Usuario("Rodrigo Turini", 120);
		Usuario guilherme = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(paulo, rodrigo, guilherme);
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		
	}

}
