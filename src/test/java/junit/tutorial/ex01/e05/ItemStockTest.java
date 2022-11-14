package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	 Item item = new Item("book",300);
	 Item item2 = new Item("cd",200);
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
	void getNum() {
		ItemStock itemStock = new ItemStock();
		int result = itemStock.getNum(item);
		assertEquals(0, result,"getNumメソッド(/item(0))は失敗です");
	}
	
	@Test
	void add() {
		ItemStock itemStock = new ItemStock();
		
				itemStock.add(item);
		int result = itemStock.getNum(item);
		
		assertEquals(1, result,"addメソッド(/item(1)は失敗です");
	}
	
	@Test
	void getNum2() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(2, result,"addメソッド(/item(2))は失敗です");
	}
	
	@Test
	void getNum1() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item2);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"addメソッド(/item(1)は失敗です");
	}

}
