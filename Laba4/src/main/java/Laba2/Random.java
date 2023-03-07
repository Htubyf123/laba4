package Laba2;


public class Random {
	private int randomnoe;
	
	public Random() {
		this.randomnoe = generation();
	}
	private int generation() {
		return (int) (Math.random()*450+251);
	}
	public int getRandom() {
		return randomnoe;
	}
}


	