import java.util.Scanner;

public class DesafioAula2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
        // caso contrário, exiba "Número negativo".
        System.out.println("Digite um número:");
        int numeroDigitado = leitura.nextInt();
        if (numeroDigitado > 0){
            System.out.println("Número positivo");
        } else if (numeroDigitado < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se
        // são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Digite um número:");
        int numero1 = leitura.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = leitura.nextInt();
        if (numero1 == numero2){
            System.out.println("Os números digitados são iguais ("+numero1+")");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número ("+numero1+") é maior que o segundo número ("+numero2+")");
        } else {
            System.out.println("O segundo número ("+numero2+") é maior que o primeiro número ("+numero1+")");
        }
        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        String mensagem = """
                Escolha uma opção:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """;
        System.out.println(mensagem);
        int opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("Digite a altura:");
            double quadrado = leitura.nextDouble();
            double area = quadrado * quadrado;
            System.out.println("Àrea do quadrado: "+area);
        } else if (opcao == 2) {
            System.out.println("Digite o raio:");
            double circulo = leitura.nextDouble();
            //"A = π * r2"
            double area = 3.14 * (circulo * circulo);
            System.out.println("Àrea do círculo: "+area);
        } else {
            System.out.println("Opção inválida");
        }
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um número entre 1 e 10:");
        int tabuada = leitura.nextInt();
        if (tabuada < 0 || tabuada > 10){
            System.out.println("Número inválido");
        }
        for (int i = 1; i <= 10; ++i) {
            System.out.println(tabuada + "x"+ i + " = " + (tabuada * i));
        }

        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar
        // e exiba uma mensagem correspondente.
        System.out.println("Digite um número:");
        int parOuImpar = leitura.nextInt();
        if ((parOuImpar % 2) == 0) {
            System.out.println(parOuImpar + " é par");
        } else {
            System.out.println(parOuImpar + " é impar");
        }

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        System.out.print("Digite um número: ");
        int numero3 = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero3; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero3 + " é: " + fatorial);
    }
}
