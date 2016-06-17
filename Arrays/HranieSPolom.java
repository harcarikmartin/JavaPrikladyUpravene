public class HranieSPolom {

	public static void main(String[] args) {
		int[] pole = new int[] { 1, 2, 3, 4, -5, 4, 3, -2, 1, 12, 22, -8, 55 };
	
		System.out.println(getMin(pole));
		System.out.println(getMax(pole));
		System.out.println(getSum(pole));
		System.out.println(getAvg(pole));
		print(pole);
		sortAsc(pole);
	}
	
	public static int getMin(int[] pole) {
		int min = pole[0];
		for (int i = 1; i < pole.length; i++) {
			if(pole[i] < min) {
				min = pole[i];
			}
		}
		return min;
	}
	
	private static int getMax(int[] pole) {
		int max = pole[0];
		for (int i = 1; i < pole.length; i++) {
			if(pole[i] > max) {
				max = pole[i];
			}
		}
		return max;
	}
	
	private static int getSum(int[] pole) {
		int sum = 0;
		for (int i = 0; i < pole.length; i++) {
			sum += pole[i];
		}
		return sum;
	}

	private static double getAvg(int[] pole) {
		return (double) getSum(pole) / pole.length;
	}

	private static void sortAsc(int[] pole) {
		int mensia;
		
		for (int i = 0; i < pole.length - 1; i++) {
			for (int j = i; j < pole.length; j++) {
				if(pole[i] > pole[j]) {
					mensia = pole[j];
					pole[j] = pole[i];
					pole[i] = mensia;
				}
			}
		}
		print(pole);
	}

	private static void print(int[] pole) {
		for (int i = 0; i < pole.length; i++) {
			if(i < pole.length - 1) {
				System.out.print(pole[i] + ", ");
			} 
			else {
				System.out.print(pole[i]);
			}
		}
		System.out.println();
	}	
}
