package sabre.controller;

import sabre.view.FrameSabre;
import sabre.model.*;

public class SabresController
{
	private FrameSabre appFrame;
	private SabreSort mySabre;
	private int[] wholeNumbers;
	private double[] realNumbers;
	private String[] wordage;
	
	public SabresController()
	{
		mySabre = new SabreSort();
		appFrame = new FrameSabre(this);
	}
	
	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}
	
	public double[] getRealNumbers()
	{
		return realNumbers;
	}
	
	public String[] getWordage()
	{
		return wordage;
	}
	
	public void setAppFrame(FrameSabre appFrame)
	{
		this.appFrame = appFrame;
	}
	
	public void setWholeNumbers(int[] wholeNumbers)
	{
		this.wholeNumbers = wholeNumbers;
	}
	
	public void setRealNumbers(double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}
	
	public void setWordage(String[] wordage)
	{
		this.wordage = wordage;
	}
	
	public SabreSort getMySabre()
	{
		return mySabre;
	}
	
	public void start()
	{
		fillTheArrays();
		for (int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
		System.out.println();
		mySabre.selectionSort(wholeNumbers);
		System.out.print(mySabre.sortingTime(mySabre.getSortTime()));
		for (int spot : wholeNumbers)
		{
			System.out.print(spot + ", ");
		}
	}
	
	private void fillTheArrays()
	{
		randomIntArray();
		// randomDoubleArray();
	}
	
	private void randomDoubleArray()
	{
		realNumbers = new double[20];
		for (int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random() * 9000;
			if (spot % 7 > 3 && spot % 9 < 3)
			{
				realNumbers[spot] *= -1.000;
			}
		}
		
	}
	
	private void randomIntArray()
	{
		wholeNumbers = new int[2000000];
		for (int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 234532);
		}
	}
}
