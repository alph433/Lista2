import java.util.Scanner;

public class BaseDoTrapezio {


		public static void main(String[] args) {
			
		
			Scanner sc = new Scanner(System.in);
			
			float area;
			float basemaior;
			float basemenor;
			float altura;
			int a = 2;
			
			
			System.out.println("Qual o tamanho da base maior: ");
			basemaior = sc.nextFloat();
			
			System.out.println("Qual tamanho da base menor: ");
			basemenor = sc.nextFloat();
			
			System.out.println("Qual a altura");
			altura = sc.nextFloat();
			
			area = basemaior + basemenor * altura / a;
			
		System.out.printf("A area do Trapezio é: = %.2f ",area );
					
					
		}
	


}