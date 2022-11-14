package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmployeeTest {

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
	void load()   {
	
		//InputStream sytemin = System.in;
		//try {
		//InputStream fileStream = new FileInputStream("/junit/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
		//InputStream bufferedStream = new BufferedInputStream(fileStream); 
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList1 = Employee.load(input);
		Employee emp = empList1.get(0);
		
		assertEquals("Ichihro", emp.getFirstName());
		assertEquals("Tanaka", emp.getFirstName());
		assertEquals("ichiro@example.com", emp.getFirstName());
		
		}
		
		
		//}catch(FileNotFoundException e) {
			//System.out.println(e);
		//}

		
		
		
		//InputStream input = getClass().getResourceAsStream("Employee.txt");
		
		
	}	
	//"C:\env\springworkspace\junit\src\main\java\junit\tutorial\ex02\e02\Employee.txt"
	//"C:\\env\\springworkspace\\junit\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt"
	//throw 
	//try {
	//}catch(FileNotFoundException e) {
		//System.out.println(e);
	//}

