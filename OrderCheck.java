class OrderCheck
{
	public static void main(String args[])
	{
		double x, y, z;
	
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		z = Double.parseDouble(args[2]);
	
		boolean isOrder = (x < y && y < z == true)
						|| (x > y && y > z == true);
	
		System.out.println(isOrder);
	}
}

/*
Exercise: 1.2.28
Description: Order check. Write a program that takes three double values x, y, and z
as command-line arguments and prints true if the values are strictly ascending or
descending ( x < y < z or x > y > z ), and false otherwise.

Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
