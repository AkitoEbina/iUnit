package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	
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

	
	
	@ParameterizedTest
	@ValueSource(doubles = {-0.1,0.0,10.5,10.6})
	void contains(double num) {
		Range range = new Range(0.0, 10.5);
		boolean r = range.contains(num);
		assertEquals(true,r);
	}
	
	
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.2,-5.1,5.1,5.2})
	void contains2(double num2) {
		Range range2 = new Range(-5.1, 5.1);
		boolean r2 = range2.contains(num2);
		assertEquals(true,r2);
	}
	
//	@Test
//	void contains() {
//		boolean r = range.contains(-0.1);
//		assertEquals(false, r);
//	}
//	
//    * Stringのケース（正常系）
//    * @param name
//    */
//   @ParameterizedTest
//   @ValueSource(strings = {
//           "",
//           "a",
//           "1234567890"
//   })
//   void testItemNameCanSetting(String name){
//       assertDoesNotThrow(() -> new Item(name));
//   }
}
