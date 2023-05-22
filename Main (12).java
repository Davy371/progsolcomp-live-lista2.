//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: SOMA DOS PARES
//Data: 21/05/2023

public class Main {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
