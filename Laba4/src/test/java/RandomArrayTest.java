

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.BeforeClass;
import org.junit.Test;
import Laba2.RandomArray;

public class RandomArrayTest {
	static int[] c;
	@BeforeClass
	public static void creation() {
		RandomArray array = new RandomArray();
		c = array.getArray();
				for(int i = 0; i < c.length; i++ ) {
					assertNotNull(c[i]);
				}
	}
	
	@Test
	public void test() {
		assertEquals(c.length, 12);
	}
	
}
