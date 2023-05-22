//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: VETOR
//Data: 21/05/2023

public class Main {
    public static void main(String[] args) {
        int tamanho = 50;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }
        
        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
