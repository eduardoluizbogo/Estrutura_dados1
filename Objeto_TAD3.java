package Aula1Exerc�cios;

import java.util.Scanner;

public class Objeto_TAD3 {

	static Scanner entrada = new Scanner(System.in);
	
	 final static int TAM = 10;
     static int vet[] = new int [TAM];
     
     public static void criarVetor() {
    	 System.out.println("-- Criando um vetor de 10 posi��es --");
         for (int x = 0; x < TAM; x++){
               System.out.print("Digite um n�mero: ");
               vet[x] = entrada.nextInt();
         }
     }
     
	public static void mostraVetor() {
		System.out.println("-- Mostrando o vetor --"); 
        for(int x = 0; x < TAM; x++)
        System.out.println(vet[x] +" | ");
	}
	
	public static void mostrarVetorInverso() {
		System.out.println("-- Mostrando o vetor inverso --");
        for(int x = vet.length - 1; x >= 0; x--)
        System.out.println(vet[x] +" | ");
	}
}
