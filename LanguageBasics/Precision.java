public class Precision {
	public static void main(String[] args) {
		float f = 1E6f;
		for (int i = 0; i < 1000000; i++) {
			f += 0.01f;
		}
		System.out.println(f);

		f = 1E6f;
		System.out.println(f + 1000000 * 0.01);
		
		System.out.println();
		
		double d = 1E6;
		for (int i = 0; i < 1000000; i++) {
			d += 0.01;
		}
		System.out.println(d);

		d = 1E6;
		System.out.println(d + 1000000 * 0.01);
	}
}
