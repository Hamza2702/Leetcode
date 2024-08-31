public static <T> void reverse(List<T> l){
		final int lastPosition = l.size() - 1;
		for (int i = 0; i < l.size() / 2; i++){
			T old = l.get(i);
			l.set(i, l.get(lastPosition - i));
			l.set(lastPosition - i, old);
		}
	}
