//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: MULTIPLOS E NAO MULTIPLOS
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = input.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
