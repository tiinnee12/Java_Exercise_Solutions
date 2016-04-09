class MonthDay
{
	public static void main(String args[])
	{
		int m, d;
		m = Integer.parseInt(args[0]);
		d = Integer.parseInt(args[1]);
		
		/*Looking at each month individually and ensuring that the days
		are between the given interval. */
		
		boolean isTrue = (m == 3 && d >= 20 && d <= 31)
                         || (m == 4 && d >=  1 && d <= 30)
                         || (m == 5 && d >=  1 && d <= 31)
                         || (m == 6 && d >=  1 && d <= 20);

		System.out.println(isTrue);
	}
}

/*
Exercise: 1.2.23
Description: Write a program that takes two int values m and d from the command line
and prints true if day d of month m is between 3/20 and 6/20

Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
