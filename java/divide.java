import java.util.Scanner;
public class divide{
	public static void main(String[] args){
		int a, b;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero entero: ");
		a = scan.nextInt();
		System.out.println("Introduce el segundo n�mero entero: ");
		b = scan.nextInt();
		System.out.println("El resultado de la divisi�n es " + (a / b));
	}
}