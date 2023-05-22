//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: CARGA MAXIMA DO ELEVADOR
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = input.nextInt();
        
        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int maxPessoas = input.nextInt();
        
        int pessoas = 0;
        int cargaAtual = 0;
        
        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = input.nextInt();
            
            if (pessoas < maxPessoas && cargaAtual + peso <= cargaMaxima) {
                pessoas++;
                cargaAtual += peso;
            } else {
                break;
            }
            
        } while (true);
        
        System.out.println("O elevador está cheio! Capacidade máxima atingida.");
        System.out.println("Número de pessoas: " + pessoas);
        System.out.println("Carga atual: " + cargaAtual + " kg");
    }
}
