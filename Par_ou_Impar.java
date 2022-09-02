import java.util.Scanner;

public class Par_ou_Impar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		float number1;
		int dividindo  = 2;
		
		System.out.println("Insira um numero: ");
		number1 = sc.nextFloat();
		
		
		if(number1 % dividindo == 0) {		
			System.out.println("O numero inserido e Par");
							
			} else {
				System.out.println("O numero inserido e Impar");
		} 
		
		
	}
}
