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
