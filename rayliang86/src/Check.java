

public class Check 
{

	public static void main(String[] args) 
	{
		//int[] i = {9, 3, 7, 4, 8, 1};
		//Bubble.order(i);
		int[] j = new int[]{2, 4, 5, 7, 8, 10, 14};
		System.out.println(Binary.order(j, 5));
	}
	
}

class Bubble
{
	public static void order(int[] a)
	{
		for(int n = 0; n < a.length - 1; n++)
		{
			for(int m = 0; m < a.length - 1; m++)//m < a.length - n - 1
			{
				if(a[m] > a[m+1])
				{
					int tmp = a[m];
					a[m] = a[m+1];
					a[m+1] = tmp;
					continue;
				}
				else
				{
					continue;
				}
			}
		}
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}

class Binary
{
	public static int order(int[] a, int b)
	{
		int highposition = a.length - 1;
		int lowposition = 0;
		int middle = 0;
		while(true)
		{
			middle = (highposition+lowposition)/2;
			if(b == a[middle])
			{
				return middle;
			}
			else
			{
				if(highposition != lowposition)
				{
					if(b < a[middle])
					{
						highposition = middle - 1; 
					}
					else if(b > a[middle])
					{
						lowposition = middle + 1;
					}
				}
				else
				{
					return -1;
				}
			}
		}
	}
}