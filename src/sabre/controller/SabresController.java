package sabre.controller;

import java.util.ArrayList;

import sabre.view.FrameSabre;
import sabre.model.*;

public class SabresController
{
	private FrameSabre appFrame;
	private SabreSort mySabre;
	private int[] wholeNumbers;
	private int[] wholeNumbersQuick;
	private double[] realNumbers;
	private String[] wordage;
	private ArrayList<Integer> arrayList;
	
	public SabresController()
	{
		mySabre = new SabreSort();
		appFrame = new FrameSabre(this);
		arrayList = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getArrayList()
	{
		return arrayList;
	}

	public int[] getWholeNumbers()
	{
		return wholeNumbers;
	}
	
	public int[] getWholeNumbersQuick()
	{
		return wholeNumbersQuick;
	}
	
	public double[] getRealNumbers()
	{
		return realNumbers;
	}
	
	public String[] getWordage()
	{
		return wordage;
	}
	
	public void setArrayList(
			ArrayList<Integer> arrayList)
	{
		this.arrayList = arrayList;
	}
	
	public void setAppFrame(
			FrameSabre appFrame)
	{
		this.appFrame = appFrame;
	}
	
	public void setWholeNumbers(
			int[] wholeNumbers)
	{
		this.wholeNumbers = wholeNumbers;
	}
	
	public void setWholeNumbersQuick(
			int[] wholeNumbersQuick)
	{
		this.wholeNumbersQuick = wholeNumbersQuick;
	}
	
	public void setRealNumbers(
			double[] realNumbers)
	{
		this.realNumbers = realNumbers;
	}
	
	public void setWordage(
			String[] wordage)
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
	}
	
	private void fillTheArrays()
	{
		randomIntArray();
		randomDoubleArray();
		quickSorter();
		randomArrayListArray();
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
		wholeNumbers = new int[5000];
		for (int spot = 0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 555555);
		}
	}
	
	private void randomArrayListArray()
	{
		wholeNumbers = new int[5000];
		for (int spot = 0; spot < wholeNumbers.length; spot++)
		{
			int myRandom = (int) (Math.random() * 36000);
			wholeNumbers[spot] = myRandom;
			arrayList.add(myRandom);
		}
	}
	
	private void quickSorter()
	{
		wholeNumbersQuick = new int[20];
		for (int spot = 0; spot < wholeNumbersQuick.length; spot++)
		{
			wholeNumbersQuick[spot] = (int) (Math.random() * 555555);
		}
	}
}
