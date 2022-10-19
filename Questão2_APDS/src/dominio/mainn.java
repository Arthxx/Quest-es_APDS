package dominio;

import java.util.Scanner;

public class mainn {
	

			public static void main(String[] args) {
				int option = 10;
				do {
					cal a = new cal();
					try (Scanner input = new Scanner(System.in)) {
						System.out.println("Questão2- Calculamento de tempo de Emprego");
						System.out.println("____________________________________________");
						System.out.println("1 - Calcular Tempo de Emprego");
						System.out.println("____________________________________________");
						System.out.println("2 - Sair");
						option = input.nextInt();
					}
					
					switch(option) {
					case 1: a.cal1();
						break;
					case 2: System.out.println("Final do Programa");
						break;
					default: System.out.println("Opção inesistente");
						break;
					}
					
				}while(option != 2);
			}
		
		}

