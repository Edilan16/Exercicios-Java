import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		String dia ;
		
		switch(x){
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia ="Segunda";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7 :
			dia = "Sabado";
			break;
		default:
			dia = "numero invalido";
			
		
		}
	System.out.println(dia);
	}

}
