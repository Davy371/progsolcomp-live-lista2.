//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: INFORMACOES PESSOAIS
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = input.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenome = input.nextLine();
        
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        input.nextLine(); // Limpar o buffer
        
        System.out.print("Digite a naturalidade: ");
        String naturalidade = input.nextLine();
        
        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = input.nextLine().charAt(0);
        
        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }
    }
}
