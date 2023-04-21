package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fb;
	
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}
		
	@Test
	void test() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	
	
	@Test
	void test2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
	
	@Test
	void test3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}
}
