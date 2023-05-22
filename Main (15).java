//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: MENOR QUE 0
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        do {
            System.out.print("Digite um número (digite um número menor que 0 para sair): ");
            numero = input.nextInt();
        } while (numero >= 0);
    }
}
