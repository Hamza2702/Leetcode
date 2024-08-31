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
