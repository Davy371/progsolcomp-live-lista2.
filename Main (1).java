//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: TRES VALORES
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int C = input.nextInt();
        
        if (A <= B && A <= C) {
            System.out.print(A + " ");
            
            if (B <= C) {
                System.out.print(B + " ");
                System.out.print(C);
            } else {
                System.out.print(C + " ");
                System.out.print(B);
            }
        } else if (B <= A && B <= C) {
            System.out.print(B + " ");
            
            if (A <= C) {
                System.out.print(A + " ");
                System.out.print(C);
            } else {
                System.out.print(C + " ");
                System.out.print(A);
            }
        } else {
            System.out.print(C + " ");
            
            if (A <= B) {
                System.out.print(A + " ");
                System.out.print(B);
            } else {
                System.out.print(B + " ");
                System.out.print(A);
            }
        }
    }
}
