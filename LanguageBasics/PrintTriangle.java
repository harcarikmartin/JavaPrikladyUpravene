/*
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/
public class PrintTriangle {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while(i < size) {
            printChars(size - i - 1, ' ');
            printChars((2 * (i + 1) - 1), '*');
            printChars(size - i - 1, ' ');
            System.out.println();
            i++;
        }
        
        System.out.println();
        PrintTriangle tr2 = new PrintTriangle();
        tr2.printTriangle2(5);
        
        System.out.println();
        PrintTriangle tr3 = new PrintTriangle();
        tr3.printMirrorTriangle(5);
    }

    private void printMirrorTriangle(int size) {
		for (int i = 0; i < size; i++) {
			printChars(size - i - 1 ,' ');
			printChars(i + 1,'*');
    		System.out.println();
		} 
		
	}

	public void printTriangle2(int size) {
    	for (int i = 0; i < size; i++) {
    		printChars(i + 1, '*');
    		printChars(size - i + 1, ' ');
    		System.out.println();
    	}
    }
    
    private static final void printChars(int length, char c) {
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
