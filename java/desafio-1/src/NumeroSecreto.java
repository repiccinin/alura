//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que
// o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número
// digitado pelo usuário é maior ou menor do que o número gerado.
//
//Dicas:
//
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int totalDeTentativas = 0;
        int numeroDigitado = 0;

        while (totalDeTentativas <= 5) {
            System.out.println("Digite um número de 0 a 100:");
            numeroDigitado = leitura.nextInt();
            if (numeroSecreto == numeroDigitado) {
                System.out.println("Você acertou o número Secreto " + numeroSecreto + " em " + totalDeTentativas + " tentativas");
                break;
            } else if (numeroSecreto < numeroDigitado) {
                System.out.println("O número secreto é menor que " + numeroDigitado);
            } else {
                System.out.println("O número secreto é maior que " + numeroDigitado);
            }
            totalDeTentativas++;
        }
        if (totalDeTentativas > 5) {
            System.out.println("VocÊ atingiu o número máximo de tentativas");
        }
    }
}
