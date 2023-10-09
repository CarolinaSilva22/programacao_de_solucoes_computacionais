package atividade1;

import java.util.Scanner;

public class Atividade7_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int linhas = 5;
		int colunas = 5;

		int[][] matriz = new int[linhas][colunas];
		num(matriz, colunas, colunas, input);
		exibir(matriz, colunas, colunas);
		input.close();
	}
		public static void num(int[][] matriz, int linhas, int colunas, Scanner input) {
		System.out.println("Digite os elementos da matriz 5x5:");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = input.nextInt();
			}
		}
		}
		public static void exibir(int[][] matriz, int linhas, int colunas) {
		System.out.println("Elementos onde o índice da linha é par e o índice da coluna é ímpar:");

		for (int i = 0; i < linhas; i += 2) {
			for (int j = 1; j < colunas; j += 2) {
				System.out.print(matriz[i][j] + " ");
			}
		}

		
	}
}
