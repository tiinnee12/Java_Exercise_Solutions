class GreatCircle
{
	public static void main(String args[])
	{
		double x1, y1, x2, y2, d, angle1;
		
		x1 = Math.toRadians(Double.parseDouble(args[0]));
		y1 = Math.toRadians(Double.parseDouble(args[1]));
		x2 = Math.toRadians(Double.parseDouble(args[2]));
		y2 = Math.toRadians(Double.parseDouble(args[3]));
		
		angle1 = Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		d = 60 * Math.toDegrees(angle1);
		
		System.out.println("Great-Circle Distance: " + d);
	}
}

/*
Exercise: 1.2.33
Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
