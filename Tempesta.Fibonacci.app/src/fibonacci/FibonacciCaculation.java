package fibonacci;

public class FibonacciCaculation
{
	public FibonacciCaculation()
	{
		calculation();
	}

	public void calculation()
	{
		// Variables defined
		int mathnumber = 45;
		int firstTerm = 0;
		int secondTerm = 1;
		
		// Displayed the line to tell user what is to follows.
		System.out.print("Fibonacci Series first " + mathnumber + " terms:\n\n");

		for (int Output = 1; Output <= mathnumber; ++Output)
		{
			calcResults(firstTerm);

			// compute the next term
			int mathcalc = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = mathcalc;

		}
	}

	public void calcResults(int firstTerm)
	{
		// Display the first 45 numbers in the sequence
		System.out.print(firstTerm + "\n\n");
	}
}