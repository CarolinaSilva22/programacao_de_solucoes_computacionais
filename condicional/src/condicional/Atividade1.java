package condicional;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

=======
>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota = input.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota1 = input.nextDouble();
		
		double total = (nota + nota1) / 2;
		if (total >= 7) {
			System.out.println("O aluno está aprovado!");
		} else {
			System.out.println("O aluno está reprovado!");
		}
	}

}
