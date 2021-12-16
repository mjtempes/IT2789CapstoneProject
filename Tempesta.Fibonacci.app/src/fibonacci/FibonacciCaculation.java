package fibonacci;

public class FibonacciCaculation
{
	public FibonacciCaculation()
	{
		//Variables defined
		int mathnumber = 50;
		int firstTerm = 0;
		int secondTerm = 1;
		// Displayed the line to tell user what is to follows.
		System.out.print("Fibonacci Series first " + mathnumber + " terms:\n\n");

		for (int i = 1; i <= mathnumber; ++i)
		{
			//Display the first 50 numbers in the sequence
			System.out.print(firstTerm +"\t");
		
			// compute the next term
			int mathcalc = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = mathcalc;

		}
	}
}