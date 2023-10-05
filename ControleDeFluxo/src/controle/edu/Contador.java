package controle.edu;

import java.util.Scanner;

import controle.edu.exceptions.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		

		Scanner s = new Scanner(System.in);
		
		int parametroUm;
		int parametroDois;
		
		System.out.println("Digite o primeiro parametro...\n");
		parametroUm = s.nextInt();
		System.out.println("Digite o segundo parametro...\n");
		parametroDois = s.nextInt();
		
		try {
			metodoContador(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			e.printStackTrace();
		}
		
		s.close();
		
		
		
		
		}
		
		
		
		public static void metodoContador(int a, int b) throws ParametrosInvalidosException {
			int numeroIteracoes = (b - a);
			
			if(a > b) {throw new ParametrosInvalidosException();}
		
			System.out.println("Teremos " + numeroIteracoes + " iteracoes");
			
			
			for(int interacao = 1 ; interacao <= numeroIteracoes; interacao++) {
				System.out.println("Imprimindo o numero " + (interacao));
				
			}
		}

}
