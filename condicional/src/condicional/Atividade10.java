package condicional;

<<<<<<< HEAD

=======
>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

=======
>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		double num1 = input.nextDouble();
		System.out.println("Digite o segundo numero:");
		double num2 = input.nextDouble();

		System.out.println("O que deseja selecionar[1-Somar, 2-Multiplicar, 3-Subtrair, 4-Dividir]:");
		int operacao = input.nextInt();

		if (operacao == 1) {
			double resultado = num1 + num2;
			System.out.println("A operação escolhida foi:soma");
			System.out.println("Resultado:" + resultado);
		}
		else if (operacao == 2) {
			double resultado = num1 * num2;
			System.out.println("A operação escolhida foi:multiplicação");
			System.out.println("Resultado:" + resultado);
		}

		else if (operacao == 3) {
			double resultado = num1 - num2;
			System.out.println("A operação escolhida foi:subtração");
			System.out.println("Resultado:" + resultado);
		}

		else if (operacao == 4) {
			double resultado = num1 / num2;
			System.out.println("A operação escolhida foi:divisão");
			System.out.println("Resultado:" + resultado);
		}

	}

}
