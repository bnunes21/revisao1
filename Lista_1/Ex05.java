package Lista_1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
System.out.print("Informe um numero inteito: ");
int numeroInteiro = scanner.nextInt();

int antecessor = numeroInteiro-1;
int sucessor = numeroInteiro+1;

System.out.println(" O sucessor do numero " + numeroInteiro+ " É " +sucessor);
System.out.println(" O antecessor do numero " + numeroInteiro+ " É " +antecessor);
	}

}
