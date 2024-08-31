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
