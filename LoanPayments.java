class LoanPayments
{
	public static void main(String args[])
	{
		double t, P; // t is years and P is the principal (def P:  The total amount of money being borrowed or lent.)
		double r; //r is the annual rate
		
		t = Double.parseDouble(args[0]);
		P = Double.parseDouble(args[1]);
		r = Double.parseDouble(args[2]);
		
		System.out.println((P*Math.exp(r*t))/(t*12));
	}
}

/*
Exercise: 1.2.24
Book: Introduction to Programming in Java: An Interdisciplinary Approach
*/ 
