// Output the highest / lowest values in an array
	private static void Values() {
		int[] values = {5,15,2500,21,512,36,2};
		int highestValue = values[0];
		int lowestValue = values[0];
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] > highestValue) {
				highestValue = values[i];
			}
			if (values[i] < lowestValue) {
				lowestValue = values[i];
			}
		}		
		System.out.println("Highest Value in array is: " + highestValue);
		System.out.println("Lowest Value in array is: " + lowestValue);
	}
	
