//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: CONDICAO DE PAGAMENTO
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da venda: R$ ");
        double valorVenda = input.nextDouble();
        
        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcao = input.nextInt();
        
        double totalVenda;
        
        switch (opcao) {
            case 1:
                totalVenda = valorVenda - (valorVenda * 0.1);
                break;
            case 2:
                totalVenda = valorVenda - (valorVenda * 0.05);
                break;
            case 3:
                totalVenda = valorVenda;
                break;
            case 4:
                totalVenda = valorVenda + (valorVenda * 0.05);
                break;
            case 5:
                totalVenda = valorVenda - (valorVenda * 0.08);
                break;
            case 6:
                totalVenda = valorVenda - (valorVenda * 0.07);
                break;
            default:
                System.out.println("Opção inválida. Digite um valor de 1 a 6.");
                return;
        }
        
        System.out.println("Total da venda: R$ " + totalVenda);
    }
}
