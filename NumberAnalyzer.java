//Name: 
//Date: 
//Per: 
//AP Comp Sci

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		list = new ArrayList<Number>();
	}

	public NumberAnalyzer(String numbers)
	{
		list = new ArrayList<Number>();
		int spacePos = 0;
		for (int i = 0; i < numbers.length(); i++)
		{
			spacePos = numbers.substring(i).indexOf(" ");
			System.out.println(spacePos);
			int currNum = Integer.parseInt(numbers.substring(i, spacePos));
			Number num = new Number(currNum);
			list.add(num);
		}
	}
	
	public void setList(String numbers)
	{


	
	}

	public int countOdds()
	{
      int oddCount=0;



      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;



      return evenCount;
	}

	public int countPerfects()
	{
		 int perfectCount=0;
     for (int i = 0; i < list.length; i++)
     {
       if (list[i].isPerfect())
       {
         perfectCount++;
       }
     }
      return perfectCount;
	}
	
	public String toString( )
	{
		return "";
	}
}