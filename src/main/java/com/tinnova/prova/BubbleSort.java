package com.tinnova.prova;

public class BubbleSort {
	
	private int[] v;

	public int[] getVetor() {
	    return v;
	}

	public void setVetor(int[] vetor) {
	    this.v = vetor;
	}

	public void bubbleSort() {
		int n = v.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (v[j] > v[j + 1]) {
	                int aux = v[j];
	                v[j] = v[j + 1];
	                v[j + 1] = aux;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int []vetor = {5, 3, 2, 4, 7, 1, 0, 6};
		BubbleSort v = new BubbleSort();
		v.setVetor(vetor);
		v.bubbleSort();
		vetor = v.getVetor();
		
		for (int i : vetor)
			System.out.print(i + " ");
	}
}
