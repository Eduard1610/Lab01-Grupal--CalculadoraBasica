import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a, b;
		System.out.println("******Calculator******");
		System.out.println("Ingrese Valor de a");
		a =sc.nextInt();
		System.out.println("Ingrese Valor de b");
		b =sc.nextInt();

		System.out.println("La suma de "+a+" + " +b+" es: "+add(a,b));
		System.out.println("La resta de"+a+" - " +b+" es: "+sub(a,b));
		System.out.println("La multiplicacion de"+a+" x " +b+" es: "+mul(a,b));
	}
	
	//METODOS

	public static int add(int a, int b){
		int suma;
		suma = a+b;
		return suma;
	}
	public static int sub(int a, int b){
		int resta;
		resta = a-b;
		return resta;
	}
	public static int mul(int a, int b){
		int multiplicacion;
		multiplicacion = a*b;
		return multiplicacion;
	}
	public static int div(int a, int b){
		return 0;
	}
	public static int mod(int a, int b){
		return 0;
	}
}
