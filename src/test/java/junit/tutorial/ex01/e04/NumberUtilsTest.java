package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void isEven() {
		boolean result = NumberUtils.isEven(10);
		assertEquals(true, result,"isEvenメソッド(/true)失敗");
	}
	
	@Test
	void isEven2() {
		boolean result = NumberUtils.isEven(7);
		assertEquals(false, result,"isEvenメソッド(/false)失敗");
	}

}
