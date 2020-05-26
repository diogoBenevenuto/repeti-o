import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		int num; 
		int rep = 1; 
		int maior = 0;
		
		System.out.println("Digite 15 números: ");
		
		
		while ( rep <= 15) {
			System.out.printf("%dN:" ,rep);
			num = leitor.nextInt();
			
			++rep;
			
			if (num > maior) {
			maior = num;	
				
			}
			
			
		}
		
		System.out.println();
		System.out.println("maior: " + maior);
	}

}
