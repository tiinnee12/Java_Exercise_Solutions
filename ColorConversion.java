class ColorConversion
{
	public static void main(String args[])
	{
		double red, green, blue;
		
		red = Double.parseDouble(args[0]);
		green = Double.parseDouble(args[1]);
		blue = Double.parseDouble(args[2]);
		
		double white = Math.max(Math.max((red/255),(green/255)), (blue/255));
		double cyan = (white - (red/255))/white;
		double magenta = (white - (green/255))/white;
		double yellow = (white - (blue/255))/white;
		double black = 1 - white;
		
		System.out.println("cyan    = " + cyan);
		System.out.println("magenta = " + magenta);
		System.out.println("yellow  = " + yellow);
		System.out.println("black   = " + black);
	}
}

/*
Exercise: 1.2.32
Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
