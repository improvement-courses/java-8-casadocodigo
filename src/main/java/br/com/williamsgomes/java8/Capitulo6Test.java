package br.com.williamsgomes.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

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
		
		// contructor reference
		
		Supplier<Usuario> criadorDeUsuarios = Usuario::new;
		Usuario novo = criadorDeUsuarios.get();
		System.out.println();
		System.out.println(novo);
		
		Function<String, Usuario> usuariosCriados = Usuario::new; 
		Usuario will = usuariosCriados.apply("Williams Gomes");
		System.out.println();
		System.out.println(will);
		
		BiFunction<String, Integer, Usuario> usuariosCriados2 = Usuario::new;
		Usuario williamsSilva = usuariosCriados2.apply("Williams Silva", 250);
		System.out.println();
		System.out.println(williamsSilva);
		
		TriFunction<String, Integer, String, Usuario> testTri = Usuario::new;
		Usuario tri = testTri.apply("Williams Gomes", 260, "OK");
		System.out.println();
		System.out.println(tri);
		System.out.println(tri.getTesteTriFuncional());
		
		BiFunction<Integer, Integer, Integer> max = Math::max;
		System.out.println(max.apply(1, 4));
		
		ToIntBiFunction<Integer, Integer> max2 = Math::max;
		System.out.println(max2.applyAsInt(1, 4));
		
		IntBinaryOperator max3 = Math::max;
		System.out.println(max3.applyAsInt(1, 4));
		
	}

}
