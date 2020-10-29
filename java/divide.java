import java.util.Scanner;
public class divide{
	public static void main(String[] args){
		int a, b;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("Introduce el primer número entero: ");
		a = scan.nextInt();
		System.out.println("Introduce el segundo número entero: ");
		b = scan.nextInt();
		System.out.println("El resultado de la división es " + (a / b));
	}
}