package condicional;

<<<<<<< HEAD

import java.util.Scanner;
=======
import java.util.Scanner;

>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

=======
>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
		 Scanner input = new Scanner(System.in);

		 System.out.println("Digite seu sexo(1-Masculino/2-Feminino):");
		 int sexo = input.nextInt();

		 System.out.println("Digite sua idade:");
		 int idade = input.nextInt();

		if(sexo == 1) {
			if(idade <= 15) {
				System.out.println("Mensalidade a ser paga:R$ 60");
			}
			 else if(idade>=16 && idade<=18) {
            	System.out.println("Mensalidade a ser paga:R$ 75");
			 }
			 else if(idade>=19 && idade<=30) {
            	System.out.println("Mensalidade a ser paga:R$ 90");
             }
			 else if(idade>=31 && idade<=40) {
            	System.out.println("Mensalidade a ser paga:R$ 85");
             }
			 else if(idade>40) {
            	System.out.println("Mensalidade a ser paga:R$ 80");
             }
		}
		else if(sexo == 2) {
		    if(idade <= 18) {
            	System.out.println("Mensalidade a ser paga:R$ 60");
			}
			 else if(idade>=19 && idade<=25) {
            	System.out.println("Mensalidade a ser paga:R$ 90");
             }
			 else if(idade>=26 && idade<=40) {
             	System.out.println("Mensalidade a ser paga:R$ 85");
             }
		   	 else if(idade>40) {
            	System.out.println("Mensalidade a ser paga:R$ 80");
             }
		}
		
}
<<<<<<< HEAD

	}

=======
}
>>>>>>> 2c260f1e6545e2edb3c5fea68c5cb94659c83c7f
