public class CoinTest
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; // number of coin flips
	Coin coin = new Coin();
	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far

	// Create a coin object

	// Flip the coin FLIPS times
	for (int i = 0; i < FLIPS; i++)
	    {
		coin.flip();
		if (coin.isHeads()) {
			currentRun++;
		}
		else {
			currentRun = 0;
		}
		if (currentRun>maxRun) {
			maxRun = currentRun;
		}
		System.out.println(coin.toString());
	    }

	// Print the results
	System.out.println("The maximum run of HEADS was " + maxRun);
    }
}