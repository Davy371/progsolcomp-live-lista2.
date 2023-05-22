//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: 
//Data: 15/04/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número A: ");
        double A = input.nextDouble();
        
        System.out.print("Digite o número B: ");
        double B = input.nextDouble();
        
        double maior;
        
        if (A > B) {
            maior = A;
        } else {
            maior = B;
        }
        
        System.out.println("O maior número é: " + maior);
    }
}
