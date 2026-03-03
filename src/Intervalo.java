import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int dentro = 0;
		int fora = 0;
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			if(num >=10 && num <=20){
				dentro = dentro +1;
			}else {
				fora = fora+1;
			}
			
		}
		
		System.out.println("in : "+dentro + " out : "+ fora);
		sc.close();
	}
}
