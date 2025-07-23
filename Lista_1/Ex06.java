package Lista_1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
	System.out.print("Informe a sua idade em anos: ");
	int idade = scanner.nextInt();
	
	int calcIdade = idade *365;
	System.out.print("Meu cachorro é bagunceiro");
	
	System.out.print("A idade em dias é " + calcIdade);
	}

}
