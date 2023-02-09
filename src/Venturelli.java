import java.util.Scanner;

public class Venturelli
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. Tre array");
		System.out.println("2 - Es n. 2 - Titolo es. SecondoArray");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	static void swap (int[] v, int a, int b)
	{
		int temp;
		temp = v[a];
		v[a] = v[b];
		v[b] = temp;
	}
	static void es1 ()
	{
		int[] numeri1= new int[5];
		int[] numeri= new int[5];
		int[] numeriF = new int[10];
		
		for (int i=0; i < numeri.length; i++)
		{
			System.out.println("Inserire valore " + i + "del primo array");
			numeri[i] = Integer.parseInt(in.nextLine());
		}
		
		for (int i=0; i < numeri1.length; i++)
		{
			System.out.println("Inserire valore " + i + " del secondo array");
			numeri1[i] = Integer.parseInt(in.nextLine());
		}
		
		for (int i=0; i <= 4; i++)
		{
			numeriF[i] = numeri[i];
		}
		
		for (int i=5, j = 0; i <= 9; i++, j++)
		{
			numeriF[i] = numeri1[j];
		}
		
		for (int j=0; j<numeriF.length; j++)
		{
			for (int i=0; i<numeriF.length-1; i++)
			{
				if(numeriF[i]>numeriF[i+1])
					swap(numeriF, i, i+1);	
			}
		}
		
		for (int i=0; i<numeriF.length; i++)
		{
			System.out.println(numeriF[i]);	
		}
	}
	
	static void es2 ()
	{
		int[] numeri = new int[10];
		int k=0;
		for (int i=0; i < numeri.length; i++)
		{
			numeri[i] = (int) (Math.random()*20) -10;
			System.out.println(numeri[i]);
		}
		
		for (int i=0; i < numeri.length; i++)
			if(numeri[i] >= 0)
				k++;
		
		int[] numeriM = new int[k];
		
		for (int i=0, j=0; i < numeri.length; i++)
			if(numeri[i] >= 0)
			{
				numeriM[j] = numeri[i];
				j++;
			}
				
		for (int i=0; i < numeriM.length; i++)
		{
			for (int j=0; j < numeriM.length-1; j++)
			{
				if(numeriM[j]<numeriM[j+1])
					swap(numeriM, j, j+1);
			}
		}
		
		System.out.println();
		
		
		for (int i=0; i < numeriM.length; i++)
			System.out.println(numeriM[i]);

	}
	
}
