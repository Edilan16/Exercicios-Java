/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
*/

import java.util.Scanner;

public class SistemaCartesiano {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valo de X ");
		int X = sc.nextInt();
		System.out.println("Digite o valor de Y ");
		int Y = sc.nextInt();
		
		
		while(X != 0 &&  Y != 0) {
			if (X > 0 && Y >0)
				System.out.println("Primeiro");
			if (X < 0 && Y > 0 )
				System.out.println("Segundo");
			if (X < 0 && Y < 0)
				System.out.println("Terceiro");
			if (X > 0 && Y < 00)
				System.out.println("Quarto");
			
			System.out.println("Digite o valo de X ");
			X = sc.nextInt();
			System.out.println("Digite o valo de Y ");
			Y = sc.nextInt();
		}
		System.out.println("Terminou!");
		
		
		
	}

}
