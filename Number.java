//Name: 
//Date: 
//Per: 
//AP Comp Sci

public class Number
{
	private Integer number;

	public Number()
	{
    setNumber(0);
	}

	public Number(int num)
	{
    setNumber(num);
	}

	public void setNumber(int num)
	{
    number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
    return (number % 2 == 1);
	}

	public boolean isPerfect()
	{
		int total=0;
    for (int i = 1; i < number; i++)
    {
      if (number % i == 0)
      {
        total+=i;
      }
    }
		return (number==total);
	}
	
	public String toString( )
	{
		return "";
	}
}