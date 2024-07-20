package br.com.selecao;

import java.util.Scanner;

public class Contador {
	public static void main(String [] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite os números:");
		int num1 = tc.nextInt();
		int num2 = tc.nextInt();
		
		try {
			contar(num1, num2);
		}catch(ParametroInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void contar(int num1, int num2) throws ParametroInvalidoException{
		if(num1 > num2) {
			throw new ParametroInvalidoException("O primeiro número não pode ser maior do que o segundo");
		}
		else {
			int contagem = num2 - num1;
			for(int i = 1; i <= contagem; i++) {
				System.out.println(i);
			}
		}
	}
}
