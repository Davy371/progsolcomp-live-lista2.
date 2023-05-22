//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: TABUADA
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número positivo: ");
        int numero = input.nextInt();
        
        if (numero <= 0) {
            System.out.println("O número digitado não é válido.");
            return;
        }
        
        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println();
        }
    }
}
