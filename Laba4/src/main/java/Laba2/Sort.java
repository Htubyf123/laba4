package Laba2;

import java.util.Arrays;

public class Sort {
	
	private int[] sortedMas = new int[12];
	
	public Sort(int[] a) {
		for(int i = 0; i < 12; i ++) {
			this.sortedMas[i] = a[i];
		}
			boolean isSorted = false;
			int y;
			while(!isSorted) {
				isSorted = true;
				for (int i = 0; i < this.sortedMas.length - 1; i++) {
					if(this.sortedMas[i] > this.sortedMas[i + 1]) {
						isSorted = false;
						
						y = this.sortedMas[i];
						this.sortedMas[i] = this.sortedMas[i+1];
						this.sortedMas[i+1] = y;
				}
			}
		}
	}
	public int[] getSortedMas() {
		return this.sortedMas;
	}
}


