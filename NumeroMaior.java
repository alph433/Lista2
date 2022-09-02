import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Insira um numero inteiro: ");
		number1 = number.nextInt();
		
		System.out.println("Insira um numero inteiro: ");
		number2 = number.nextInt();
		
		if(number1 > number2){
			System.out.println("O numero maior e: " + number1);
			} else {
				System.out.println("O numero maior e: " + number2);
				
			}
			
		
	}
}
