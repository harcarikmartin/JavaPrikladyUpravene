public class ArrayCopyMine {
	
	private static final int SIZE = 10000;

	public static void main(String[] args) {
		int[] source = new int[SIZE];
		int[] dest = new int[SIZE];
		
		
		
		long cas = System.nanoTime();
		System.arraycopy(source, 0, dest, 0, SIZE);
		System.out.println(System.nanoTime() - cas);
		
		cas = System.nanoTime();
		copyArray(source, dest);
		System.out.println(System.nanoTime() - cas);
		
		System.out.println();
		cas = System.nanoTime();
		copyArray(source, dest);
		System.out.println(System.nanoTime() - cas);
		
		cas = System.nanoTime();
		System.arraycopy(source, 0, dest, 0, SIZE);
		System.out.println(System.nanoTime() - cas);
	}
	
	//mnou vytvorena metoda na kopirovanie celeho pola do ineho pola
	
	public static void copyArray(int[] source, int[] dest) {
		for (int i = 0; i < SIZE; i++) {
			dest[i] = source[i];
		}
	}
}
