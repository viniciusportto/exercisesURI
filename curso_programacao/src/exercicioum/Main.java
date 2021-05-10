package exercicioum;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		 
		String produto = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, com preço de R$ %.2f%n", produto, preco);
		System.out.printf("%s, com preço de R$ %.2f%n", produto2, preco2);
		System.out.println("");
		System.out.printf("Registro: %d anos, código %d e gênero: %s%n", idade, codigo, genero);
		System.out.println("");
		System.out.printf("Medidas com oito casas decimais: %.8f %n", medida);
		System.out.printf("Arredondado (três casas decimais): %.3f %n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal Americano: %.3f", medida);
		
	}

}
