import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, qtePeca1, codPeca2, qtePeca2 ;
		double valPeca1, valPeca2, valorPagar;
		
		codPeca1 = sc.nextInt();
		qtePeca1 = sc.nextInt();
		valPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtePeca2 = sc.nextInt();
		valPeca2 = sc.nextDouble();
		
		valorPagar = valPeca1 * qtePeca1 + valPeca2 * qtePeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		sc.close();
	}

}
