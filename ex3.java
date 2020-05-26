import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		int num;
		int soma = 0  ,media= 0;
		int rep = 1;
		
		
		System.out.println("Digite 20 numeros:");
		
		while (rep <= 20) {
			System.out.printf("%dN:" ,rep);
			num = leitor.nextInt();
			
			++rep;
			
			soma = soma + num;
			media= soma/20;
		}
		System.out.println();
		
		System.out.println("soma:" +soma);
		
		System.out.println("media:" +media);		
		
		}
		
		
	}


