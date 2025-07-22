package Lista_1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o numero total de eleitores do municipio: " );
		double eleitores = scanner.nextDouble();
		System.out.print("Informe o numero total de votos brancos: ");
		double brancos = scanner.nextDouble();
		System.out.print("Informe o numero total de nulos: ");
		double nulos = scanner.nextDouble();
		System.out.print("Informe o total de votos validos: ");
		double validos = scanner.nextDouble();
		
		double calcBrancos = brancos / eleitores *100 ;
		double calcNulos = nulos / eleitores *100 ;
		double calcValidos = validos / eleitores *100 ;
		double soma = calcBrancos + calcNulos+ calcValidos;
		double naoVotantes = 100-soma ;
		
		System.out.println("A quantidade de votos brancos é de " + calcBrancos + " %");
		System.out.println("A quantidade de votos nulos é de " + calcNulos + " %");
		System.out.println(" A quantidade de votos validos é de " + calcValidos + " %");
		
		System.out.println(soma);
		System.out.println(naoVotantes);

	}

}
