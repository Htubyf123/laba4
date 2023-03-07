package Laba2;

import java.util.Arrays;

public class RandomArray {
	private int[] arrayMas = new int[12];
	public RandomArray() {
		for(int i = 0; i < 12; i++) {
			this.arrayMas[i] = new Random().getRandom();
		}
	}
	public int[] getArray() {
		return this.arrayMas;
	}

}
