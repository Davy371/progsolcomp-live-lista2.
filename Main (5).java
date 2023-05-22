//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: CONCEITO DO ALUNO
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = input.nextInt();

        String conceito;

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 100.");
            return;
        }

        System.out.println("Conceito: " + conceito);
    }
}
