//Nome do Aluno: Davy Oliveira de Souza
//RA:1272314287
//Nome do Programa: MULTIPLOS DE 7
//Data: 21/05/2023

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            
            numero++;
        } while (numero % 7 != 0);
    }
}
