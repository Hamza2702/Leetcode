// Output a sequence of coins that would be dispensed by a vending machine,
	private static void Sequence(int x) {
		ArrayList<Integer> Coins = new ArrayList<>(); // Not fixed
		int[] coins = {1,2,5,10,20,50,100,200,500,1000,2000};
		int amount = x;

		for (int i = coins.length - 1; i >= 0; i--) {
		    while (amount >= coins[i]) { 
		        Coins.add(coins[i]);
		        amount -= coins[i];
		    }
		}

		System.out.println("\nAmount received: " + x + "\nYour change is: " + Coins + "\n");	
	}
