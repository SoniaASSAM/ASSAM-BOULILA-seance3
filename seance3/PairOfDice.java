package seance3;

import java.lang.Math;


public class PairOfDice 
{
	private int die1,die2 ;
	
	
	public PairOfDice()
	{
		rollDice();
	}
	
	public void rollDice()
	{
		die1 = (int) (Math.random()*6) + 1;
		die2 = (int) (Math.random()*6) + 1;
	}

	public String toString()
	{
		System.out.println(die1+" "+die2);
	}
	
	public int getDie1()
	{ 
		return die1;
	}
	
	public int getDie2 ()
	{
		return die2;
	}
}