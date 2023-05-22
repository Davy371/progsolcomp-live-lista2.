//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: HOSPEDAGEM
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = input.nextInt();
        
        double valorDiaria = 60.00;
        double taxaServico;
        
        if (numeroDiarias > 15) {
            taxaServico = 5.50;
        } else if (numeroDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }
        
        double total = numeroDiarias * (valorDiaria + taxaServico);
        
        System.out.println("O total da hospedagem é: R$ " + total);
    }
}
