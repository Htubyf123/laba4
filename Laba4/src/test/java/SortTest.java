

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.RandomArray;
import Laba2.Sort;

public class SortTest {
	static RandomArray array;
	static int[] c;
	static Sort s;
	
	@BeforeClass
	public static void creation() {
		array = new RandomArray();
		c = array.getArray();
		s = new Sort(c);
	}
	
	@Test
	public void test() {
		c = s.getSortedMas();
	}

	@AfterClass
	public static void sortirovka() {
		for(int i = 0; i < c.length - 1; i++ ) {
			assertTrue(c[i] <= c[i + 1]);
		}
	}
}
