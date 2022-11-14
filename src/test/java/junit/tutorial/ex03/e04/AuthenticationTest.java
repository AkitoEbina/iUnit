package junit.tutorial.ex03.e04;

import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AuthenticationTest {

	@Mock
	private AccountDao accountDao;
	
	@InjectMocks
	private Authentication authentication = new Authentication();
	
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
	void test1() {
		doReturn(null).when(accountDao).findOrNull(null);
		
	}
	@Test
	void test2() {
		Account account = new Account("user1", "pass");
		doReturn(account).when(accountDao).findOrNull("user1");
		
	}

	@Test
	void test3() {
		Account account = new Account("user1", "pa");
		doReturn(account).when(accountDao).findOrNull(null);
		
	}
}
