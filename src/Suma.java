import java.util.Scanner;

public class Suma {
	
	public static void main(String[] args) {
		
		Scanner reader =  new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado=0;
		boolean num1;
		boolean num2;
		
		
		System.out.println("Introduce el primer número:");			
		numero1 = reader.nextInt();
					
		System.out.println("Introduce el segundo número:");
		numero2 = reader.nextInt();

		num1=Primo(numero1);
		num2=Primo(numero2);
		if(num1 && num2) {
		
			resultado = numero1+numero2;

			System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
			
		}else {
			
			System.out.println("Los numero deben ser primos");
			
		}
			
		
		
	}
	
	public static boolean Primo(int num){
		  int cont = 2;
		  boolean pri=true;
		  while ((pri) && (cont!=num)){
		    if (num % cont == 0)
		      pri = false;
		    cont++;
		  }
		  return pri;
		}
	

}
