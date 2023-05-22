//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: PREENCHER MATRIZES
//Data: 21/05/2023

public class Main {
    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        int[][] matriz = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = 0;
            }
        }
        
        System.out.println("Matriz preenchida com zeros:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
