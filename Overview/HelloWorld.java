public class HelloWorld {
	
	public static long fact(int a)
	{
		long fr = 0;
		if (a < 0)
			System.out.println("Faktorial Rekurzia: Cislo je zaporne");
		else if (a == 1 || a == 0 )
		{
			fr = 1;
		}
			
		else 
		{
			fr = a*fact(a-1);
		}
		return fr;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//Absolutna hodnota
		int n = 6, m = n;
	
		if (n < 0) 
		{
			m = -m;
		}
		System.out.println("Absolutna hodnota je " + m);
		
		//Faktorial
		long f = 1;
		if (n == 0)
		{
			f = 1;
			System.out.println("Faktorial: " + f);
		}
		else if (n > 0)
		{
		for (int i = 2; i <= n; i++)
			f *= i;	
			System.out.println("Faktorial: " + f);
		}
		else
		{
			System.out.println("Faktorial: Cislo je zaporne");
		}
		//Faktorial rekurzia
		
		if (fact(n) != 0)
		{
			System.out.println("Faktorial rekurzia: " + fact(n));
		}
		
		
		//n hviezdiciek
		if (n > 0)
		{	
			for (int i = 0; i < n; i++)
			{
			System.out.print("*");
			}
		}
		else if (n == 0)
		{
			System.out.println("Hviezdicky: Cislo je nulove");
		}
		else
		{
			System.out.println("Hviezdicky: Cislo je zaporne");
		}
	}
}
