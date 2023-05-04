 import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // leitura da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento da linha " + (i+1) + " e coluna " + (j+1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // impressão da matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // impressão dos elementos nas posições linha par e coluna ímpar
        System.out.print("Elementos nas posições de linha par e coluna ímpar: ");
        for (int i = 0; i < matriz.length; i += 2) {
            for (int j = 1; j < matriz[i].length; j += 2) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();

        // matriz transposta
        int[][] transposta = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // impressão da matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        // troca dos elementos da diagonal principal com a diagonal secundária
        for (int i = 0; i < matriz.length; i++) {
            int aux = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length-1-i];
            matriz[i][matriz.length-1-i] = aux;
        }

        // impressão da matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}