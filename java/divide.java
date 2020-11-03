import java.util.Scanner;
public class Divide{
	public static void main(String[] args){
		int a, b;
		
		Scanner scan;		
		scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero entero: ");
		a = scan.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		b = scan.nextInt();
		
		System.out.println("El resultado de la division es " + (a / b));
	}
}