class StdGaussian
{
	public static void main(String args[])
	{
		double v, u, w;
		
		v = Math.random();
		u = Math.random();
		
		w = Math.sin(2*Math.PI*v)*Math.pow((-2*Math.log(u)), (1/2));
		
		System.out.println("Standard Gaussian random variable: " + w);
	}
}

/*
Exercise: 1.2.27
Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
