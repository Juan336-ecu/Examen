import java.util.Scanner;

public class Suma {
	
	public static void main(String[] args) {
		
		Scanner reader =  new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado=0;
			
		System.out.println("Introduce el primer n�mero:");			
		numero1 = reader.nextInt();
					
		System.out.println("Introduce el segundo n�mero:");
		numero2 = reader.nextInt();

		resultado = numero1+numero2;
		
		System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
		
		
	}
	

}
