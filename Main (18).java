//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: VOLUME DO GAS
//Data: 21/05/2023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = input.nextInt();
        
        int volume = volumeInicial;
        int tempo = 0;
        
        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }
        
        System.out.println("O tempo necessário para que o volume se torne maior que 1000 cm³ é: " + tempo + " segundos.");
    }
}
