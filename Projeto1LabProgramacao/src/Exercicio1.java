import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
	   Scanner teclado = new Scanner(System.in);
	   
	   int nlinha,ncoluna,valorpesquisa;
	   System.out.println("Informe o numero de linhas: ");
	   nlinha = teclado.nextInt();
	   System.out.println("Informe o numero de colunas: ");
	   ncoluna = teclado.nextInt();
	   
	   int matriz [][] = new int[nlinha][ncoluna];
	   
	   for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <matriz.length; j++) {
				System.out.println("Informe os valores da matriz: ");
				matriz[i][j] = teclado.nextInt();
	   
		
			}			
				
	   }		
	   
	   for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
				

	
	}
		System.out.println();
  }
 
  System.out.println("Digite um numero que vc procura na matriz");
  valorpesquisa = teclado.nextInt();
  
  boolean achou = false;
  for (int i = 0; i < matriz.length; i++) {
	  for (int j = 0; j<matriz.length; j++) { 
		  if(matriz[i][j] == valorpesquisa) {
			  achou = true;
			  System.out.println("Achou na posicao: " + (i+1) + "," + (j+1));
		  }
	  }
  }
  
  if(!achou) {
	  System.out.println("Nao achou o numero");
  
  
  }
  
 }	   
	
}	
