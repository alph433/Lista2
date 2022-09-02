import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1;
		long number2;
		float number3;
		
	System.out.println("Insira um numero inteiro: ");
		number1 = sc.nextInt();
	
	System.out.println("Insira um numero long: ");
	number2 = sc.nextLong();
	
	System.out.println("Insira um numero float: ");
	number3 = sc.nextFloat();
	
	
	System.out.printf("O numero inteiro digitado foi: "+ number1+ "\n" ); 
	System.out.printf("O Numero long digitado foi: "+ number2 + "\n");
	System.out.printf("O numero float digitado foi: %.4f", number3);
	
	
	}
	
	
	
}
