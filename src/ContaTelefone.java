import java.util.Locale;
import java.util.Scanner;

public class ContaTelefone {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Quantos minutos foram usados ? ");
		double minutos = entrada.nextDouble();
		
		double conta = 50.00;
		
		if (minutos > 100 ) {
			conta += (minutos - 100) * 2.0;
			System.out.printf("Valor a pagar : %.2f%n" , conta);
		}else {
			System.out.printf("valor a pagar : %.2f%n",conta);
		}
	entrada.close();
	}
}
