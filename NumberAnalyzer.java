//Name: 
//Date: 
//Per: 
//AP Comp Sci

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		list = new ArrayList<Number>();
		setList("6 9 4 2 0");
	}

	public NumberAnalyzer(String numbers)
	{
		list = new ArrayList<Number>();
		setList(numbers);
	}
	
	public void setList(String numbers)
	{
		int spacePos = numbers.indexOf(" ");
		String cutMeUp = numbers;
		
		for (int i = 0; i < numbers.length(); i++) //99% sure I'm a crackhead or smth
		{
			if (spacePos != -1)
			{
				int eaNum = Integer.parseInt(cutMeUp.substring(0, spacePos));
				Number num = new Number(eaNum);
				list.add(num);
				cutMeUp = cutMeUp.substring(spacePos + 1);
			}
			else
			{
				break;
			}
			spacePos = cutMeUp.indexOf(" ");
		}
		Number finalNum = new Number(Integer.parseInt(cutMeUp));
		list.add(finalNum); //garbage algorithm is garbage, this works how
	}

	public int countOdds()
	{
      int oddCount=0;
      for (Number eaNum : list)
      {
    	  if (eaNum.getNumber() % 2 == 1)
    	  {
    		  oddCount++;
    	  }
      }

      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for (Number eaNum : list)
      {
    	  if (eaNum.getNumber() % 2 == 0)
    	  {
    		  evenCount++;
    	  }
      }

      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		
		//get divisors
		int divisorTotal = 0;
		for (Number eaNum: list)
		{
			for (int i = 1; i < eaNum.getNumber(); i++) //get divisors of this number
			{
				if (eaNum.getNumber() % i == 0)
				{
					divisorTotal+=i;
				}
			}
			if (eaNum.getNumber() == divisorTotal) //check for perfect
			{
				perfectCount++; //add one if perfect
			}
			divisorTotal = 0; //reset val for next num
		}
		
		return perfectCount;
	}
	
	public String toString( )
	{
		int outArray[] = new int[list.size()];
		for (int i = 0; i < outArray.length; i++)
		{
			outArray[i] = list.get(i).getNumber();
		}
		return Arrays.toString(outArray);
	}
}