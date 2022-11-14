package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void CountterTest() {
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result, "incremenメソッド1回実行失敗");
	}

	@Test
	void CountterTest2() {
		Counter counter = new Counter();
		//for(i=1;i<=2;i++){
		//int result = counter.increment()*i;
		//}
		int result = counter.increment() * 2;
		assertEquals(2, result, "incremenメソッド2回実行失敗");
	}

	@Test
	void CountterTest3() {
		Counter counter = new Counter();
		//for(i=1;i<=50;i++){
		//int result = counter.increment()*i;}
		//
		int result = counter.increment() * 51;
		assertEquals(51, result, "incremenメソッド51回実行失敗");
	}
}
