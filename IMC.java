import java.util.Scanner;
import java.util.regex.Matcher;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float peso;
		float altura;
		int divisor;
		float imc;
		
		System.out.printf("Insira seu peso: ");
		peso = sc.nextFloat();		
		
		System.out.printf("Insira sua altura: ");
		altura = sc.nextFloat();
		
		imc = peso / (altura * altura);
				
				System.out.printf("Seu IMC é de: %.2f ", imc);
	}
	
	
	
}
