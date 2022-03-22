import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int nalunos;
		
		System.out.println("Informe o numero de alunos: ");
		nalunos = teclado.nextInt();
		
		char matriz [][] = new char [nalunos][10];
		char gabarito [] = new char[10];
		int auxiliar [] = new int[10];
		
		 for (int linha = 0; linha < nalunos; linha++) {
			 System.out.println("Resposta Aluno: " + (linha+1) + ":");
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
		 System.out.println(" ");
		 for(int linha = 0 )
	}

}
		 

	

