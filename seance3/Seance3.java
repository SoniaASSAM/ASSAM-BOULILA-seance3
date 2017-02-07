package seance3;

import java.util.Scanner;

public class Seance3 
{
	
	public static void exo51()
	{
		System.out.println("Exercice 5.1");
		int cpt = 0;
		PairOfDice pair = new PairOfDice();
		while(true)
		{
			cpt++;
			if (pair.getDie1()+pair.getDie2() == 2) break;
			pair.rollDice();
		}
		
		System.out.println("Snake eyes au bout de "+cpt+" essaies");
	} 
	
	
	public static void exo52()
	{
		System.out.println("Exercice 5.2");
		Scanner scn;
		double n;
		StatCalc sc = null;
		
		while(true)
		{
			scn = new Scanner(System.in);
			n = scn.nextDouble();
			if (n == 0) break;
			if (sc == null) sc = new StatCalc(n);
			else sc.enter(n);
			sc.print();
		}
		System.out.println("Fin.");
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Seance 3");
		// executer exo51
		//exo51();
		// executer exo52
		exo52();
		
	}
	
	
}
