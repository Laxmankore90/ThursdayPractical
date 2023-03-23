//write a program to take 3 number and find the greatest of all 3 number
class GreatestNumber					
{
	public static void main(String args[])				//main method
	{
		int a=100;
		int b=30;
		int c=100;
		
		if (a>b && a>c)						//checking the a is greatest or not
		{
			System.out.print("a is the greatest number");
		  }
		else if  (b>c)							// checkingthe b is greatest or not
		{
			System.out.print("b is the greatest number");
		  }
		else				// if both condition are false than c is greatest
		{
			System.out.print("c is the greatest number");
		}
	}
}
