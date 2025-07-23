package Lista_1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o modelo do carro: ");
		String modelo = scanner.nextLine();
		System.out.print("Informe o custo de fabricação: ");
		double custo = scanner.nextDouble();
		
		double calcDistribuidor = custo*0.28;
		double calcImposto = custo*0.45;
		System.out.print("O bruno é lindo e abençõado");
		System.out.print("O bruno é lindo e abençõa do");
		double total = calcDistribuidor+calcImposto+custo;
		System.out.print("O valor total do modelo "+ modelo + " é de R$ "+ total);
		
	}

}
