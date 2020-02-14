package com.tinnova.prova;

public class Fatorial {

	public static String result(int num) {
		return "Fatorial de " + num + " é " + fat(num);
	}

	private static long fat(int num) {
		int anterior = num-1;
		long fat = 0;
		
		if (num <= 1) return 1;
			else fat =  num * fat(anterior);
		
		return fat;
	}
}
