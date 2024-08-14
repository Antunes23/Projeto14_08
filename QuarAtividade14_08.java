package Atividade;

import java.util.Scanner;

import java.util.*;

public class QuarAtividade14_08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
			
		System.out.println("Digite um número");
		try {
			
			
			a = ler.nextInt();
			}
		catch(InputMismatchException erro) {
			System.out.println("Por favor digite apenas números!");
		}
	}
}