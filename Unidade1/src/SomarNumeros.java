
import java.util.*;

class SomarNumeros {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String []args) {
		int n1, n2, soma;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("A soma eh: " + soma);
	}
}
