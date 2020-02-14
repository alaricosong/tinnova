package com.tinnova.prova;

public class TresCinco {

	    public static void main(String[] args) {

	        int N = 1000;
	        int result = sum(3, N-1) + sum(5, N-1) - sum(15, N-1);

	        System.out.println(result);
	      }

	      public static int sum(int n, int N) {
	          return n * (N/n) * (N/n + 1)/2;
	      }
	}
