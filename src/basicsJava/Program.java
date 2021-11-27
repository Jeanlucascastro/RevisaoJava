package basicsJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import basicPessoas.Pessoas;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Pessoas pessoas = new Pessoas();

		
		List<Pessoas> list = new ArrayList<>();
		
		Integer total = 1;
		
		Integer quantidadePessoas = null;
		
		System.out.println("Digite a quantidade de pessoas: ");
		
		quantidadePessoas = sc.nextInt();
		
		for (int i = 0; i < quantidadePessoas; i++ ) {
			
			sc.nextLine();
			
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();

			
			System.out.println("Digite a quantidade de salgados ");
			Integer quantidade = sc.nextInt();
			
			total = total + quantidade;
			
			list.add(new Pessoas(name, quantidade));
			
			
		}
		
		//for (Pessoas x : list) {
		//	System.out.println());
	//	}
		
		Integer total2 = total - 1;
		
		System.out.println(list);
		System.out.println("Vai ser necessario " + total2  + " de salgados ");
		
				
		
		

			
	sc.close();
		
	}

}
