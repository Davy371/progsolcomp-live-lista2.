//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: FATORIAL
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = input.nextInt();
        
        int fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
