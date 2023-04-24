package exercicio4_Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		double num1 = 0, num2 = 0, resultado;

		do {
			Calculadora calculo1 = new Calculadora(num1, num2);
			System.out.println("*******CALCULADORA*******");
			System.out.println("Escolha a operacao: ");
			System.out.println("1- para Soma.");
			System.out.println("2- para Subtracao.");
			System.out.println("3- para Divisao.");
			System.out.println("4- para Multiplicacao.");
			System.out.println("5- para Potenciacao.");
			System.out.println("6- Encerrar");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor do primeiro numero: ");
				num1 = scan.nextDouble();
				System.out.println("Digite o valor do Segundo numero: ");
				num2 = scan.nextDouble();
				resultado = calculo1.Soma(num1, num2);
				System.out.printf("A soma de %.2f + %.2f = %.2f.\n", num1, num2, resultado);
				break;

			case 2:
				System.out.println("Digite o valor do primeiro numero: ");
				num1 = scan.nextDouble();
				System.out.println("Digite o valor do Segundo numero: ");
				num2 = scan.nextDouble();
				resultado = calculo1.Subtracao(num1, num2);
				System.out.printf("A soma de %.2f - %.2f = %.2f.\n", num1, num2, resultado);
				break;

			case 3:
				System.out.println("Digite o valor do primeiro numero: ");
				num1 = scan.nextDouble();
				System.out.println("Digite o valor do Segundo numero: ");
				num2 = scan.nextDouble();
				resultado = calculo1.Divisao(num1, num2);
				System.out.printf("A Divisão de %.2f / %.2f = %.2f.\n", num1, num2, resultado);
				break;

			case 4:
				System.out.println("Digite o valor do primeiro numero: ");
				num1 = scan.nextDouble();
				System.out.println("Digite o valor do Segundo numero: ");
				num2 = scan.nextDouble();
				resultado = calculo1.Multiplicacao(num1, num2);
				System.out.printf("A Multiplicacao de %.2f * %.2f = %.2f.\n", num1, num2, resultado);
				break;

			case 5:
				System.out.println("Digite o valor do primeiro numero: ");
				num1 = scan.nextDouble();
				System.out.println("Digite o valor do Segundo numero: ");
				num2 = scan.nextDouble();
				resultado = calculo1.Potenciacao(num1, num2);
				System.out.printf("A Potenciacao de %.2f ^ %.2f = %.2f.\n", num1, num2, resultado);
				break;
				
			case 6:
				System.out.print("Encerrado!");
				break;

			default:
				System.out.println("Opção inalida.");

			}

		} while (opcao != 6);
		scan.close();
	}

}
