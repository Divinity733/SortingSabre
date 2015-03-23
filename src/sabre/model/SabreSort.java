package sabre.model;

public class SabreSort
{
	private long startTime;
	private long endTime;
	private long sortTime;
	private int array[];
    private int length;
	
	public long getSortTime()
	{
		return sortTime;
	}
	
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "\nDays: " + sortTime / (1000 * 60 * 60 * 24) + "\n";
		timeToSort += "Hours: " + sortTime / (1000 * 60 * 60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime / (1000 * 60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime / (1000) % 60 + "\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		
		return timeToSort;
	}
	
	public GamersGuide[] selectionSort(GamersGuide[] unsortedGames)
	{
		GamersGuide maximumFun;
		int maximumPosition;
		startTime = System.currentTimeMillis();
		for (int position = 0; position < unsortedGames.length; position++)
		{
			maximumPosition = position;
			maximumFun = unsortedGames[position];
			for (int next = position + 1; next < unsortedGames.length; next++)
			{
				if (unsortedGames[next].compareTo(maximumFun) > 0)
				{
					maximumFun = unsortedGames[next];
					maximumPosition = next;
				}
			}
			if (maximumPosition != position)
			{
				swap(unsortedGames, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return unsortedGames;
	}
	
	public int[] selectionSort(int[] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if (minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		
		sortTime = endTime - startTime;
		
		return toBeSorted;
	}
	
	public void sort(int[] inputArr)
	{
        quickSort(inputArr, 0, inputArr.length - 1);
    }
	
	public void quickSort(int blah[], int lowerIndex, int higherIndex)
	{
        
        int i = lowerIndex;
        int j = higherIndex;
        if(j - i >= 1)
        {
        	int pivot = blah[lowerIndex];
            while (j > i)
            {
                while (blah[i] <= pivot && i <= j && j > i)
                {
                    i++;
                }
                while (blah[j] > pivot && j > i && j >= i)
                {
                    j--;
                }
                if (j > i)
                {
                    swap(blah, i, j);
                }
            }
            swap(blah, i, j);
            
            quickSort(blah, i, j - 1);
            quickSort(blah, i + 1, j);
        }
        else
        {
        	return;
        }
    }
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	private void swap(GamersGuide[] array, int position, int change)
	{
		GamersGuide temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
}
