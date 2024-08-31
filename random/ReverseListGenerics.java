public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(1); l.add(2); l.add(3); l.add(4);
		System.out.println(l);
		reverse(l);
		System.out.println(l);
	}

public static <T> void reverse(List<T> l){
		final int lastPosition = l.size() - 1;
		for (int i = 0; i < l.size() / 2; i++){
			T old = l.get(i);
			l.set(i, l.get(lastPosition - i));
			l.set(lastPosition - i, old);
		}
	}
