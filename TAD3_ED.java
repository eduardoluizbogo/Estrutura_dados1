package Aula1Exerc�cios;

import java.util.Scanner;

public class TAD3_ED {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op;
		boolean tomada = true;
		
		do {
		System.out.println("==== Trabalhando com Vetor ====");
		System.out.println("Escolha uma op��o:");
		System.out.println(" 1 - Preencher vetor");
		System.out.println(" 2 - Mostrar vetor");
		System.out.println(" 3 - Mostrar vetor inverso");
		System.out.println(" 4 - Sair");
		System.out.print(" Op��o -> ");
		op = entrada.nextInt();
		
		
		switch(op){
		case 1:
			Objeto_TAD3.criarVetor();
			break;
		case 2:
			Objeto_TAD3.mostraVetor();
			break;
		case 3:
			Objeto_TAD3.mostrarVetorInverso();
			break;
		case 4:
			tomada = false;
			break;
			default:
				System.out.println("Op��o inv�lida!");
		}
		
	} while(tomada == true);
		System.out.println("Voce saiu");
		
		entrada.close();

  }

	
}
