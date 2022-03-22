import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int matriz [][] = new int [4][4]; 
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna <matriz.length; coluna++) {
				matriz[linha][coluna] = gerador.nextInt(20);
			}	
		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna <matriz.length; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
				
	  }	
			
		System.out.println();

	}
}

}
