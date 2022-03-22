import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int nalunos;
		
		System.out.println("Informe o numero de estudantes: ");
		nalunos = teclado.nextInt();
		
		char matriz [][] = new char [nalunos][10];
		char gabarito [] = new char[10];
		int auxiliar [] = new int[10];
		
		 for (int linha = 0; linha < nalunos; linha++) {
			 System.out.println("Resposta Estudante: " + (linha+1) + ":");
				for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
					auxiliar[coluna] = gerador.nextInt(5);
					switch(auxiliar[coluna]) { 
					case 0: 
						matriz[linha][coluna] = 'a';
						break;
					case 1: 
						matriz[linha][coluna] = 'b';
						break;
					case 2: 
						matriz[linha][coluna] = 'c';
						break;
					case 3: 
						matriz[linha][coluna] = 'd';
						break;	
					case 4: 
						matriz[linha][coluna] = 'e';
						break;	
						
					}
					System.out.print(matriz[linha][coluna] + " ");
					
				}
		      System.out.println();
		 }
		 System.out.println("Digite seu gabarito:  ");
		 for(int linha = 0; linha<gabarito.length; linha++) {
			 System.out.println("Gabarito: " + (linha+1) + ":");
			 gabarito[linha] = teclado.next().charAt(0);
		 }
		 
		 int acertos = 0;
		 for (int linha = 0; linha<nalunos; linha++) { 
			 for(int coluna = 0; coluna<matriz[linha].length; coluna++) {
				 if(gabarito[coluna] == matriz[linha][coluna]) {
					 acertos++;
				 }
			 }
			 System.out.println("O estudante " + (linha+1) + " acertou: " + acertos);
			 if (acertos>=7) { 
				 System.out.println("O estudante " + (linha+1) + " foi aprovado com : " + acertos);
			 } else { 
				 System.out.println("O estudante " + (linha+1) + " foi reprovado.");
			 }
			acertos = 0;
		 }
		 
		 
			 
	}
}


		 

	

