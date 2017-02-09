package seance3;

import java.util.Scanner;

public class Seance3 
{
	
	public static final int MIN_DICE = 2;
	
	public static final int MAX_DICE = 12;
	
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
	
	
	public static void exo53()
	{
		System.out.println("exercice5.3");
		
		for (int i=MIN_DICE; i<= MAX_DICE; i++)
		{
			StatCalc sc = null;
			
			for (int j=0;j<10000;j++)
			{
				if (sc==null) sc= new StatCalc(countRolls(i));
				else sc.enter(countRolls(i));
			}
			
			System.out.printf("sum", i);
	        System.out.printf("mean", sc.getMean());
	        System.out.printf("standard deviation", sc.getStandardDeviation());
	        System.out.printf("max", sc.getMax());
	        System.out.println("-------------------------------------");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Seance 3");
		// executer exo51
		//exo51();
		// executer exo52
		exo52();
		
		exo53();
		
	}
	
	
}
