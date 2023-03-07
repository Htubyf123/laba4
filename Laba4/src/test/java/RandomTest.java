

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.Random;

public class RandomTest {

	@Test
	public void test() {
		int r = new Random().getRandom();
		assertTrue(r<701 && r>249);
	}

}
