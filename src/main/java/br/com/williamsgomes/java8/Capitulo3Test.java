package br.com.williamsgomes.java8;

public class Capitulo3Test {

	public static void main(String[] args) {
		
		new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println(i);
			}
		}).start();
		
		System.out.println();
		Validador<String> validadorCEP =  valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		
		validadorCEP.valida("04101-300");
		
		
	}
	
}
