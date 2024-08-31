package one;

import java.util.ArrayList;

public class Learning{

	public static void main(String args[]) {
		Values();
		Mean();
		Sequence(48);
		Number(4);
		Fibonacci(100);
		Conversion(10);
	}

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
	
	// Output the average (mean) value in an array, as well as all values above that value.
	private static void Mean() {
		float[] values = {3,11,4,6,8,9,6};
		float mean = 0;
		ArrayList<Float> aboveMean = new ArrayList<>();
		
		for (int i = 0; i < values.length; i++) {
			mean += values[i];
		}
		
		mean = mean/values.length;
		for (int i = 0; i < values.length; i++) {
			if (values[i] > mean) {
				aboveMean.add(values[i]);
			}
		}
		System.out.println("\nThe mean of values is: " + mean);
		if (aboveMean.isEmpty()) {
			System.out.println("There are no values above the mean.");
		} else if (aboveMean.size() == 1) {
			System.out.println("There is one value above the mean: " + aboveMean);
		} else {
			System.out.println("The values above the mean are: " + aboveMean);
		}
	}
	
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
	
	// Determine whether or not a number is prime, even, square, etc.
	private static void Number(int x) {
		int number = x;
		
		System.out.println("The number " + number + ":");
		// Even or ODD
		if (number % 2 == 0) {
			System.out.println("- even.");
		} else if (number % 2 == 1) {
			System.out.println("- odd.");
		}
		
		// Prime
		boolean isPrime = true;
		if (number > 1) {
		    for (int i = 2; i <= number / 2; i++) {
		        if (number % i == 0) { // Check if its divisible by any of these numbers
		            isPrime = false; // Not a prime number
		            break;
		        }
		    }
		} else {
		    isPrime = false;
		}

		if (isPrime && number > 1) {
		    System.out.println("- is prime.");
		} else {
		    System.out.println("- is not prime.");
		}
		
		// Square
		boolean isSquare = false;
		for (int i = 0; i < (number); i++) {
			if (i * i == number) {
				isSquare = true;
				break;
			} else {
				isSquare = false;
			}
		}
		
		if (isSquare) {
			System.out.println("- is a square number.");
		} else {
			System.out.println("- is not a square number.");
		}
		
		
	}
	
	// Output the Fibonacci sequence
	private static void Fibonacci(long x) {
		ArrayList<Long> list = new ArrayList<>();
        list.add((long) 0); 
        list.add((long) 1); 

        for (int i = 2; i < x; i++) { 
            long nextNumber = list.get(i - 1) + list.get(i - 2);
            list.add(nextNumber);
        }
        
        System.out.println("\nThe fibonacci sequence for " + x + " is:");
        for (long num : list) {
            System.out.print(num + ", ");
        }
	}
	
	// Convert between measurements, e.g. miles per hour, metres per second.
	private static void Conversion(int x) {
		float number = x;
		float result = 0;
		
		result = number / number;
		result *=  1.609344;
		result *= number;
		System.out.println("\n\n" + number + " miles per hour to kmh is " + result);
		
		result = number / number;
		result *= 3.6;
		result *= number;
		System.out.println(number + " metres per second to kmh " + result);
	}
	
}
