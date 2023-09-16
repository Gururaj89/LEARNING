package countthenumberofdigits;

public class Counting {
	public int countdigits(int num) {
		int count=0;

		while(num!=0)

		{

		num=num/10;

		count++;

		}

		return count;
		
		
		
	}

}
