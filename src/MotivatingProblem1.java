import java.util.Scanner;

import services.PrintService;

public class MotivatingProblem1 {
	//Motivating problem 2 (type safety & performance)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		ps.addValue("Maria");//Problema da seguran�a de tipos
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = (Integer) ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
