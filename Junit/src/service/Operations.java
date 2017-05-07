package service;

public class Operations {
	
	// (long ... numbers) en argument attend rien ou un tableau de valeurs de type long de taille non spécifiée (dynamique)
	public static long add (long... numbers)
	{
		if(numbers.length>0)
		{
		long sum = 0;
		for(int i = 0; i<numbers.length; i++)
		{
			sum+=numbers[i];
		}
		return sum;
		}
		else {
			return 0;
		}
	}

	public static long mult (long... numbers)
	{
		if(numbers.length>0)
		{
			long result = 1;
			for(long nb : numbers)
			{
				result*=nb;
			}
			return result;
		}
		else{
		return 0;
		}
	}
}
