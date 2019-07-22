package br.com.williamsgomes.java8;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface TriFunction<T, U, S, R> {

	R apply(T t, U u, S s);
	
	default <V> TriFunction<T, U, S, V> andThen(Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (T t, U u, S s) -> after.apply(apply(t, u, s));
	}

}
