import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 1, qtdM_ate1000 = 0;
		float altura, maiorAltura = 0, menorAltura = 0;
		char sexo;
		double salario, mediaSalario = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		while (cont <= 2 ) {
			
			System.out.println(cont +"º funcionario");
			System.out.println("Digite a altura: ");
			altura = leitor.nextFloat();
			
			System.out.println("Digite o sexo: ");
			sexo = leitor.next() .charAt (0);
			
			System.out.println("Digite o salario: ");
			salario = leitor.nextDouble();
			
			
			mediaSalario += salario;
			
			if (altura > maiorAltura)
				maiorAltura = altura;
				
			if (altura < menorAltura || cont == 1)
				menorAltura = altura;
			
			if (sexo == 'f' && salario < 1000 )
				qtdM_ate1000++;
			
			
			cont++; 
		}
		
		mediaSalario /= (cont - 1);
		
		
		
		System.out.println("Média salarial: "+mediaSalario);
		System.out.println("Maior altura: "+maiorAltura);
		System.out.println("Menor altura: "+menorAltura);
		System.out.println("Mulheres c/ sala. ate 1000: "+qtdM_ate1000);
		
	}

}
