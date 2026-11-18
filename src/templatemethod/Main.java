
package templatemethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 4) {
			System.out.println("\n=========================================");
			System.out.println("      MAQUINA DE BEBIDAS AUTOMÁTICA      ");
			System.out.println("=========================================");
			System.out.println("1 - Café");
			System.out.println("2 - Chá");
			System.out.println("3 - Cappuccino");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opcao: ");

			if (input.hasNextInt()) {
				opcao = input.nextInt();
			} else {
				System.out.println("\nEntrada inválida! Digite apenas números.");
				input.next();
				continue;
			}

			Bebida bebidaSelecionada = null;

			switch (opcao) {
			case 1:
				System.out.println("\n=== PREPARANDO CAFÉ ===");
				bebidaSelecionada = new Cafe();
				break;
			case 2:
				System.out.println("\n=== PREPARANDO CHÁ ===");
				bebidaSelecionada = new Cha();
				break;
			case 3:
				System.out.println("\n=== PREPARANDO CAPPUCCINO ===");
				bebidaSelecionada = new Cappuccino();
				break;
			case 4:
				System.out.println("\nEncerrando a máquina. Até logo!");
				break;
			default:
				System.out.println("\nOpcao inválida! Tente novamente.");
				break;
			}

			if (bebidaSelecionada != null) {
				bebidaSelecionada.prepararBebida();
				System.out.println("Bebida pronta! Sirva-se.");
			}
		}

		input.close();
	}
}
